package net.lmagikk.heartofthecraft.datagen;

import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.lmagikk.heartofthecraft.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, HeartOfTheCraft.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ENNUM_BLOCK);
        blockWithItem(ModBlocks.NETHUM_BLOCK);
        blockWithItem(ModBlocks.WARRUM_BLOCK);
        blockWithItem(ModBlocks.OCCUM_BLOCK);
        blockWithItem(ModBlocks.OVUM_BLOCK);

        blockWithItem(ModBlocks.ENNUM_ORE);
        blockWithItem(ModBlocks.NETHUM_ORE);
        blockWithItem(ModBlocks.WARRUM_ORE);
        blockWithItem(ModBlocks.OCCUM_ORE);
        blockWithItem(ModBlocks.OVUM_ORE);

        blockWithItem(ModBlocks.CRAFFUM_ALLOY_BLOCK);

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
