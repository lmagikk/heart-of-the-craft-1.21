package net.lmagikk.heartofthecraft.recipe;

import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, HeartOfTheCraft.MODID);
    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, HeartOfTheCraft.MODID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<OreGenRecipe>> ORE_GEN_SERIALIZER =
            SERIALIZERS.register("ore_generating", OreGenRecipe.Serializer::new);
    public static final DeferredHolder<RecipeType<?>, RecipeType<OreGenRecipe>> ORE_GEN_TYPE =
            TYPES.register("ore_generating", () -> new RecipeType<OreGenRecipe>() {
                @Override
                public String toString() {
                    return "ore_generating";
                }
            });



    public static void register(IEventBus eventBus){
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}
