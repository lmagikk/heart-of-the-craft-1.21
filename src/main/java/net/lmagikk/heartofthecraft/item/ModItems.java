package net.lmagikk.heartofthecraft.item;

import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.lmagikk.heartofthecraft.item.complex.FlightCharm;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HeartOfTheCraft.MODID);

    public static final DeferredItem<Item> HEART_OF_THE_WARDEN = ITEMS.register("heart_of_the_warden",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HEART_OF_THE_WITHER = ITEMS.register("heart_of_the_wither",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HEART_OF_THE_DRAGON = ITEMS.register("heart_of_the_dragon",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.EPIC)));

    public static final DeferredItem<Item> HEART_OF_THE_OCEAN = ITEMS.register("heart_of_the_ocean",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.EPIC)));

    public static final DeferredItem<Item> HEART_OF_THE_OVERWORLD = ITEMS.register("heart_of_the_overworld",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.EPIC)));

    public static final DeferredItem<Item> OVUM_INGOT = ITEMS.register("ovum_ingot",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)));

    public static final DeferredItem<Item> NETHUM_INGOT = ITEMS.register("nethum_ingot",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)));

    public static final DeferredItem<Item> OCCUM_INGOT = ITEMS.register("occum_ingot",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)));

    public static final DeferredItem<Item> ENNUM_INGOT = ITEMS.register("ennum_ingot",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)));

    public static final DeferredItem<Item> WARRUM_INGOT = ITEMS.register("warrum_ingot",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)));

    public static final DeferredItem<Item> CRAFFUM_ALLOY_BAR = ITEMS.register("craffum_alloy_bar",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.EPIC))
            {
                public boolean isFoil(ItemStack itemStack)
                {
                    return true;
                }
            });

    public static final DeferredItem<Item> FALSE_HEART_OF_THE_CRAFT = ITEMS.register("false_heart_of_the_craft",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.COMMON)));

    public static final DeferredItem<Item> TRUE_HEART_OF_THE_CRAFT = ITEMS.register("true_heart_of_the_craft",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.EPIC)));

    public static final DeferredItem<Item> HEART_OF_THE_PACK = ITEMS.register("heart_of_the_pack",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.EPIC))
            {
                public boolean isFoil(ItemStack itemStack) {
                    return true;
                }
            });

    public static final DeferredItem<Item> SHARD_OF_THE_PACK = ITEMS.register("shard_of_the_pack",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.EPIC))
            {
                public boolean isFoil(ItemStack stack){
                    return true;
                }
            });


    public static final DeferredItem<Item> FLIGHT_CHARM = ITEMS.register("flight_charm",
            () -> new FlightCharm(new Item.Properties()));

    //Blocks



    //Tools



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
