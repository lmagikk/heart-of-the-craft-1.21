package net.lmagikk.heartofthecraft.worldgen;

import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_OVUM_ORE = registerKey("add_ovum_ore");
    public static final ResourceKey<BiomeModifier> ADD_OCCUM_ORE = registerKey("add_occum_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHUM_ORE = registerKey("add_nethum_ore");
    public static final ResourceKey<BiomeModifier> ADD_WARRUM_ORE = registerKey("add_warrum_ore");
    public static final ResourceKey<BiomeModifier> ADD_ENNUM_ORE = registerKey("add_ennum_ore");


    public static void bootstrap(BootstrapContext<BiomeModifier> context){
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_OVUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVUM_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OCCUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OCEAN),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OCCUM_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHUM_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_WARRUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.HAS_ANCIENT_CITY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.WARRUM_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ENNUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ENNUM_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES));


    }

    private static ResourceKey<BiomeModifier> registerKey(String name){
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(HeartOfTheCraft.MODID, name));
    }
}
