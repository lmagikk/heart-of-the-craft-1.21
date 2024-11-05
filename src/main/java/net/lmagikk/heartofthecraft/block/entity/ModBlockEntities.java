package net.lmagikk.heartofthecraft.block.entity;

import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.lmagikk.heartofthecraft.block.ModBlocks;
import net.lmagikk.heartofthecraft.block.entity.custom.OreGenBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, HeartOfTheCraft.MODID);

    public static final Supplier<BlockEntityType<OreGenBlockEntity>> ORE_GEN_BE = BLOCK_ENTITIES.register("ore_gen_be", () -> BlockEntityType.Builder.of(
            OreGenBlockEntity::new, ModBlocks.ORE_GENERATOR_BLOCK.get())
            .build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
