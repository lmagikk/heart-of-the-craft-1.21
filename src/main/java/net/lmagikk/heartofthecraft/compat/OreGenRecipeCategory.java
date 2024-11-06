package net.lmagikk.heartofthecraft.compat;


import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableBuilder;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.lmagikk.heartofthecraft.block.ModBlocks;
import net.lmagikk.heartofthecraft.recipe.OreGenRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

public class OreGenRecipeCategory implements IRecipeCategory<OreGenRecipe> {








    public static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(HeartOfTheCraft.MODID, "ore_generating");
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(HeartOfTheCraft.MODID,
            "textures/gui/ore_gen_jeir.png");

    public static final RecipeType<OreGenRecipe> ORE_GEN_RECIPE_RECIPE_TYPE =
            new RecipeType<>(UID, OreGenRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public OreGenRecipeCategory(IGuiHelper helper){

        this.background = helper.createDrawable(TEXTURE, 0, 0, 256, 115);

        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.ORE_GENERATOR_BLOCK.get()));
    }


    @Override
    public RecipeType<OreGenRecipe> getRecipeType() {
        return ORE_GEN_RECIPE_RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Ore_Generator");
    }

    @Override
    public @Nullable IDrawable getBackground() {
        return background;
    }

    @Override
    public @Nullable IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, OreGenRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT,120, 20 ).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.OUTPUT,120, 90 ).addItemStack(recipe.getResultItem(null));


    }
}
