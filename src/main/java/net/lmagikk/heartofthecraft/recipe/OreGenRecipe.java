package net.lmagikk.heartofthecraft.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

public record OreGenRecipe(Ingredient inputItem, ItemStack output) implements Recipe<OreGenRecipeInput> {

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(inputItem);
        return list;
    }

    @Override
    public boolean matches(OreGenRecipeInput oreGenRecipeInput, Level level) {
        if (level.isClientSide()){
            return false;
        }
        return inputItem.test(oreGenRecipeInput.getItem(0));
    }

    @Override
    public ItemStack assemble(OreGenRecipeInput oreGenRecipeInput, HolderLookup.Provider provider) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int i, int i1) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider provider) {
        return output;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.ORE_GEN_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.ORE_GEN_TYPE.get();
    }

    public static class Serializer implements RecipeSerializer<OreGenRecipe>{

        public static final MapCodec<OreGenRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC_NONEMPTY.fieldOf("ingredient").forGetter(OreGenRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(OreGenRecipe::output)
        ).apply(inst, OreGenRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, OreGenRecipe> STREAM_CODEC =
                StreamCodec.composite(
                        Ingredient.CONTENTS_STREAM_CODEC, OreGenRecipe::inputItem,
                        ItemStack.STREAM_CODEC, OreGenRecipe::output,
                        OreGenRecipe::new);

        @Override
        public MapCodec<OreGenRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, OreGenRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}
