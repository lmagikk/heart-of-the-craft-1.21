package net.lmagikk.heartofthecraft.item;

import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.lmagikk.heartofthecraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HeartOfTheCraft.MODID);

    public static final Supplier<CreativeModeTab> HEART_OF_THE_CRAFT = CREATIVE_MODE_TAB.register("heart_of_the_craft",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TRUE_HEART_OF_THE_CRAFT.get()))
                    .title(Component.translatable("creativetab.heartofthecraft"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.HEART_OF_THE_WARDEN);
                        output.accept(ModItems.HEART_OF_THE_WITHER);
                        output.accept(ModItems.HEART_OF_THE_DRAGON);
                        output.accept(ModItems.HEART_OF_THE_OCEAN);
                        output.accept(ModItems.HEART_OF_THE_OVERWORLD);

                        output.accept(ModBlocks.ENNUM_ORE);
                        output.accept(ModBlocks.NETHUM_ORE);
                        output.accept(ModBlocks.OCCUM_ORE);
                        output.accept(ModBlocks.OVUM_ORE);
                        output.accept(ModBlocks.WARRUM_ORE);

                        output.accept(ModItems.ENNUM_INGOT);
                        output.accept(ModItems.NETHUM_INGOT);
                        output.accept(ModItems.OCCUM_INGOT);
                        output.accept(ModItems.OVUM_INGOT);
                        output.accept(ModItems.WARRUM_INGOT);

                        output.accept(ModBlocks.OVUM_BLOCK);
                        output.accept(ModBlocks.NETHUM_BLOCK);
                        output.accept(ModBlocks.OCCUM_BLOCK);
                        output.accept(ModBlocks.ENNUM_BLOCK);
                        output.accept(ModBlocks.WARRUM_BLOCK);

                        output.accept(ModItems.FALSE_HEART_OF_THE_CRAFT);
                        output.accept(ModItems.TRUE_HEART_OF_THE_CRAFT);

                        output.accept(ModItems.CRAFFUM_ALLOY_BAR);
                        output.accept(ModBlocks.CRAFFUM_ALLOY_BLOCK);
                        
                        //ore generator block

                        output.accept(ModItems.HEART_OF_THE_PACK);
                        output.accept(ModItems.SHARD_OF_THE_PACK);

                        output.accept(ModItems.ENNUM_BOOTS);
                        output.accept(ModItems.ENNUM_LEGGINGS);
                        output.accept(ModItems.ENNUM_CHESTPLATE);
                        output.accept(ModItems.ENNUM_HELMET);

                        output.accept(ModItems.WARRUM_BOOTS);
                        output.accept(ModItems.WARRUM_LEGGINGS);
                        output.accept(ModItems.WARRUM_CHESTPLATE);
                        output.accept(ModItems.WARRUM_HELMET);

                        output.accept(ModItems.NETHUM_BOOTS);
                        output.accept(ModItems.NETHUM_LEGGINGS);
                        output.accept(ModItems.NETHUM_CHESTPLATE);
                        output.accept(ModItems.NETHUM_HELMET);

                        output.accept(ModItems.NETHUM_SWORD);
                        output.accept(ModItems.NETHUM_AXE);
                        output.accept(ModItems.NETHUM_PICKAXE);

                        output.accept(ModItems.WARRUM_SWORD);
                        output.accept(ModItems.WARRUM_AXE);
                        output.accept(ModItems.WARRUM_PICKAXE);

                        output.accept(ModItems.ENNUM_SWORD);
                        output.accept(ModItems.ENNUM_AXE);
                        output.accept(ModItems.ENNUM_PICKAXE);

                        output.accept(ModItems.FLIGHT_CHARM);
                        output.accept(ModItems.PICK_AXE);

                        output.accept(ModBlocks.ORE_GENERATOR_BLOCK);

                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
