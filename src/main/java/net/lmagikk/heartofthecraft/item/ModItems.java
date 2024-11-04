package net.lmagikk.heartofthecraft.item;

import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.lmagikk.heartofthecraft.item.complex.FlightCharm;
import net.lmagikk.heartofthecraft.item.complex.PickAxe;
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



    //Tools

    //Nethum
    public static final DeferredItem<SwordItem> NETHUM_SWORD = ITEMS.register("nethum_sword",
            () -> new SwordItem(ModToolsTiers.NETHUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolsTiers.NETHUM, 7f, -0.5f))
                    .rarity(Rarity.EPIC)));
    public static final DeferredItem<PickaxeItem> NETHUM_PICKAXE = ITEMS.register("nethum_pickaxe",
            () -> new PickaxeItem(ModToolsTiers.NETHUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolsTiers.NETHUM, 3f, -2f))
                    .rarity(Rarity.EPIC)));
    public static final DeferredItem<AxeItem> NETHUM_AXE = ITEMS.register("nethum_axe",
            () -> new AxeItem(ModToolsTiers.NETHUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolsTiers.NETHUM, 12f, -2.5f))
                    .rarity(Rarity.EPIC)));

    //Warrum

    public static final DeferredItem<SwordItem> WARRUM_SWORD = ITEMS.register("warrum_sword",
            () -> new SwordItem(ModToolsTiers.NETHUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolsTiers.NETHUM, 9f, 0f))
                    .rarity(Rarity.EPIC)));
    public static final DeferredItem<PickaxeItem> WARRUM_PICKAXE = ITEMS.register("warrum_pickaxe",
            () -> new PickaxeItem(ModToolsTiers.NETHUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolsTiers.NETHUM, 4f, -1.5f))
                    .rarity(Rarity.EPIC)));
    public static final DeferredItem<AxeItem> WARRUM_AXE = ITEMS.register("warrum_axe",
            () -> new AxeItem(ModToolsTiers.NETHUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolsTiers.NETHUM, 14f, -2f))
                    .rarity(Rarity.EPIC)));

    //Ennum

    public static final DeferredItem<SwordItem> ENNUM_SWORD = ITEMS.register("ennum_sword",
            () -> new SwordItem(ModToolsTiers.NETHUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolsTiers.NETHUM, 12f, 0.5f))
                    .rarity(Rarity.EPIC)));
    public static final DeferredItem<PickaxeItem> ENNUM_PICKAXE = ITEMS.register("ennum_pickaxe",
            () -> new PickaxeItem(ModToolsTiers.NETHUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolsTiers.NETHUM, 5f, -1f))
                    .rarity(Rarity.EPIC)));
    public static final DeferredItem<AxeItem> ENNUM_AXE = ITEMS.register("ennum_axe",
            () -> new AxeItem(ModToolsTiers.NETHUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolsTiers.NETHUM, 17f, -1.5f))
                    .rarity(Rarity.EPIC)));

    public static final DeferredItem<PickAxe> PICK_AXE = ITEMS.register("pick_axe",
            () -> new PickAxe(ModToolsTiers.CRAFFUM, new Item.Properties()
                    .attributes(PickAxe.createAttributes(ModToolsTiers.CRAFFUM, 20f, 0f))
                    .rarity(Rarity.EPIC)));


    public static final DeferredItem<ArmorItem> NETHUM_HELMET = ITEMS.register("nethum_helmet",
            () -> new ArmorItem(ModArmorMaterials.NETHUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(40))));
    public static final DeferredItem<ArmorItem> NETHUM_CHESTPLATE = ITEMS.register("nethum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NETHUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(40))));
    public static final DeferredItem<ArmorItem> NETHUM_LEGGINGS = ITEMS.register("nethum_leggings",
            () -> new ArmorItem(ModArmorMaterials.NETHUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(40))));
    public static final DeferredItem<ArmorItem> NETHUM_BOOTS = ITEMS.register("nethum_boots",
            () -> new ArmorItem(ModArmorMaterials.NETHUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(40))));

    public static final DeferredItem<ArmorItem> WARRUM_HELMET = ITEMS.register("warrum_helmet",
            () -> new ArmorItem(ModArmorMaterials.WARRUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(45))));
    public static final DeferredItem<ArmorItem> WARRUM_CHESTPLATE = ITEMS.register("warrum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.WARRUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(45))));
    public static final DeferredItem<ArmorItem> WARRUM_LEGGINGS = ITEMS.register("warrum_leggings",
            () -> new ArmorItem(ModArmorMaterials.WARRUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(45))));
    public static final DeferredItem<ArmorItem> WARRUM_BOOTS = ITEMS.register("warrum_boots",
            () -> new ArmorItem(ModArmorMaterials.WARRUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(45))));

    public static final DeferredItem<ArmorItem> ENNUM_HELMET = ITEMS.register("ennum_helmet",
            () -> new ArmorItem(ModArmorMaterials.ENNUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(-1))));
    public static final DeferredItem<ArmorItem> ENNUM_CHESTPLATE = ITEMS.register("ennum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ENNUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(-1))));
    public static final DeferredItem<ArmorItem> ENNUM_LEGGINGS = ITEMS.register("ennum_leggings",
            () -> new ArmorItem(ModArmorMaterials.ENNUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(-1))));
    public static final DeferredItem<ArmorItem> ENNUM_BOOTS = ITEMS.register("ennum_boots",
            () -> new ArmorItem(ModArmorMaterials.ENNUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(-1))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
