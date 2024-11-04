package net.lmagikk.heartofthecraft.datagen;


import net.lmagikk.heartofthecraft.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries){
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }


    @Override
    protected void generate(){
        dropSelf(ModBlocks.ENNUM_BLOCK.get());
        dropSelf(ModBlocks.NETHUM_BLOCK.get());
        dropSelf(ModBlocks.OCCUM_BLOCK.get());
        dropSelf(ModBlocks.OVUM_BLOCK.get());
        dropSelf(ModBlocks.WARRUM_BLOCK.get());

        dropSelf(ModBlocks.ENNUM_ORE.get());
        dropSelf(ModBlocks.NETHUM_ORE.get());
        dropSelf(ModBlocks.OCCUM_ORE.get());
        dropSelf(ModBlocks.OVUM_ORE.get());
        dropSelf(ModBlocks.WARRUM_ORE.get());
        dropSelf(ModBlocks.CRAFFUM_ALLOY_BLOCK.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
