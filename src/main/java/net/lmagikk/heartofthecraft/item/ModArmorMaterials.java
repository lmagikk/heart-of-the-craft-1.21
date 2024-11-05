package net.lmagikk.heartofthecraft.item;

import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
            DeferredRegister.create(Registries.ARMOR_MATERIAL, HeartOfTheCraft.MODID);

    public static final Holder<ArmorMaterial> NETHUM_ARMOR_MATERIAL =
            ARMOR_MATERIALS.register("nethum", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 6);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.CHESTPLATE, 10);
                map.put(ArmorItem.Type.HELMET, 6);
            }), 30, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> Ingredient.of(ModItems.NETHUM_INGOT.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(HeartOfTheCraft.MODID, "nethum"))),
                    0.3f, 0.1f));

    public static final Holder<ArmorMaterial> WARRUM_ARMOR_MATERIAL =
            ARMOR_MATERIALS.register("warrum", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 8);
                        map.put(ArmorItem.Type.LEGGINGS, 10);
                        map.put(ArmorItem.Type.CHESTPLATE, 12);
                        map.put(ArmorItem.Type.HELMET, 8);
                    }), 35, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> Ingredient.of(ModItems.WARRUM_INGOT.get()),
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(HeartOfTheCraft.MODID, "warrum"))),
                    0.4f, 0.2f));

    public static final Holder<ArmorMaterial> ENNUM_ARMOR_MATERIAL =
            ARMOR_MATERIALS.register("ennum", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 10);
                        map.put(ArmorItem.Type.LEGGINGS, 12);
                        map.put(ArmorItem.Type.CHESTPLATE, 14);
                        map.put(ArmorItem.Type.HELMET, 10);
                    }), 40, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> Ingredient.of(ModItems.ENNUM_INGOT.get()),
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(HeartOfTheCraft.MODID, "ennum"))),
                    0.5f, 0.3f));





   public static void register(IEventBus eventBus){
       ARMOR_MATERIALS.register(eventBus);
   }
}
