package net.lmagikk.heartofthecraft.util;

import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_NETHUM_TOOL = createTag("needs_nethum_tool");
        public static final TagKey<Block> INCORRECT_FOR_NETHUM_TOOL = createTag("incorrect_for_nethum_tool");
        public static final TagKey<Block> NEEDS_WARRUM_TOOL = createTag("needs_warrum_tool");
        public static final TagKey<Block> INCORRECT_FOR_WARRUM_TOOL = createTag("incorrect_for_warrum_tool");
        public static final TagKey<Block> NEEDS_ENNUM_TOOL = createTag("needs_ennum_tool");
        public static final TagKey<Block> INCORRECT_FOR_ENNUM_TOOL = createTag("incorrect_for_ennum_tool");
        public static final TagKey<Block> NEEDS_CRAFFUM_TOOL = createTag("needs_craffium_tool");
        public static final TagKey<Block> INCORRECT_FOR_CRAFFUM_TOOL = createTag("incorrect_for_craffium_tool");

        public static final TagKey<Block> PICK_AXE_MINEABLE = createTag("mineable/pick_axe");


        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(HeartOfTheCraft.MODID, name));
        }

    }
}
