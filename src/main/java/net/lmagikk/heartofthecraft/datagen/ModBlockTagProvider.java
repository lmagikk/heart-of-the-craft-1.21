package net.lmagikk.heartofthecraft.datagen;

import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.lmagikk.heartofthecraft.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, HeartOfTheCraft.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ENNUM_BLOCK.get())
                .add(ModBlocks.NETHUM_BLOCK.get())
                .add(ModBlocks.WARRUM_BLOCK.get())
                .add(ModBlocks.OCCUM_BLOCK.get())
                .add(ModBlocks.OVUM_BLOCK.get())

                .add(ModBlocks.ENNUM_ORE.get())
                .add(ModBlocks.NETHUM_ORE.get())
                .add(ModBlocks.WARRUM_ORE.get())
                .add(ModBlocks.OCCUM_ORE.get())
                .add(ModBlocks.OVUM_ORE.get())

                .add(ModBlocks.CRAFFUM_ALLOY_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.OCCUM_BLOCK.get())
                .add(ModBlocks.OVUM_BLOCK.get())
                .add(ModBlocks.OCCUM_ORE.get())
                .add(ModBlocks.OVUM_ORE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.NETHUM_BLOCK.get())
                .add(ModBlocks.NETHUM_ORE.get());


    }
}
