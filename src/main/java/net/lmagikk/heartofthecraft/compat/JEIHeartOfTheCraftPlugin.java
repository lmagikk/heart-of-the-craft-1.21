package net.lmagikk.heartofthecraft.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.lmagikk.heartofthecraft.recipe.ModRecipes;
import net.lmagikk.heartofthecraft.recipe.OreGenRecipe;
import net.lmagikk.heartofthecraft.screen.custom.OreGenBlockScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEIHeartOfTheCraftPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(HeartOfTheCraft.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new OreGenRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()
        ));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<OreGenRecipe> oreGenRecipes = recipeManager
                .getAllRecipesFor(ModRecipes.ORE_GEN_TYPE.get()).stream().map(RecipeHolder::value).toList();
        registration.addRecipes(OreGenRecipeCategory.ORE_GEN_RECIPE_RECIPE_TYPE, oreGenRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(OreGenBlockScreen.class, 80, 30, 20, 30 , OreGenRecipeCategory.ORE_GEN_RECIPE_RECIPE_TYPE);

    }
}
