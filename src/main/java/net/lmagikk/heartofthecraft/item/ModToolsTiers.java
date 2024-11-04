package net.lmagikk.heartofthecraft.item;

import net.lmagikk.heartofthecraft.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolsTiers {
    public static final Tier NETHUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_NETHUM_TOOL,
            10000,
            12,
            4,
            30,
            () -> Ingredient.of(ModItems.NETHUM_INGOT));

    public static final Tier WARRUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_WARRUM_TOOL,
            15000,
            13,
            5,
            35,
            () -> Ingredient.of(ModItems.WARRUM_INGOT));

    public static final Tier ENNUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ENNUM_TOOL,
            -1,
            16,
            6,
            40,
            () -> Ingredient.of(ModItems.ENNUM_INGOT));

    public static final Tier CRAFFUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_CRAFFUM_TOOL,
            -1,
            25,
            12,
            50,
            () -> Ingredient.of(ModItems.CRAFFUM_ALLOY_BAR));
}
