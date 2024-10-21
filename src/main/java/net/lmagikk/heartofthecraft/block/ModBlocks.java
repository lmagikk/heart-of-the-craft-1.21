package net.lmagikk.heartofthecraft.block;

import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.lmagikk.heartofthecraft.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(HeartOfTheCraft.MODID);


    public static final DeferredBlock<Block> OVUM_ORE = registerBlock("ovum_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .lightLevel(state -> 5)));

    public static final DeferredBlock<Block> NETHUM_ORE = registerBlock("nethum_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .lightLevel(state -> 5)));
    public static final DeferredBlock<Block> OCCUM_ORE = registerBlock("occum_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .lightLevel(state -> 5)));
    public static final DeferredBlock<Block> ENNUM_ORE = registerBlock("ennum_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .lightLevel(state -> 5)));
    public static final DeferredBlock<Block> WARRUM_ORE = registerBlock("warrum_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .lightLevel(state -> 5)));

    public static final DeferredBlock<Block> WARRUM_BLOCK = registerBlock("warrum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NETHUM_BLOCK = registerBlock("nethum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ENNUM_BLOCK = registerBlock("ennum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> OCCUM_BLOCK = registerBlock("occum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> OVUM_BLOCK = registerBlock("ovum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CRAFFUM_ALLOY_BLOCK = registerBlock("craffum_alloy_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItems(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
