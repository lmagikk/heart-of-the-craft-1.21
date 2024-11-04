package net.lmagikk.heartofthecraft.datagen;

import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.lmagikk.heartofthecraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output,  ExistingFileHelper existingFileHelper) {
        super(output, HeartOfTheCraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.HEART_OF_THE_WARDEN.get());
        basicItem(ModItems.HEART_OF_THE_OCEAN.get());
        basicItem(ModItems.HEART_OF_THE_OVERWORLD.get());
        basicItem(ModItems.HEART_OF_THE_WITHER.get());
        basicItem(ModItems.HEART_OF_THE_DRAGON.get());
        basicItem(ModItems.FALSE_HEART_OF_THE_CRAFT.get());
        basicItem(ModItems.TRUE_HEART_OF_THE_CRAFT.get());
        basicItem(ModItems.HEART_OF_THE_PACK.get());
        basicItem(ModItems.SHARD_OF_THE_PACK.get());


        basicItem(ModItems.CRAFFUM_ALLOY_BAR.get());
        basicItem(ModItems.OCCUM_INGOT.get());
        basicItem(ModItems.OVUM_INGOT.get());
        basicItem(ModItems.NETHUM_INGOT.get());
        basicItem(ModItems.ENNUM_INGOT.get());
        basicItem(ModItems.WARRUM_INGOT.get());
        basicItem(ModItems.FLIGHT_CHARM.get());


    }

}
