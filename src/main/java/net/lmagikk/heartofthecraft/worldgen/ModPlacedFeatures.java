package net.lmagikk.heartofthecraft.worldgen;

import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.HeightmapPlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> OVUM_ORE_PLACED_KEY = registerKey("ovum_ore_placed");
    public static final ResourceKey<PlacedFeature> OCCUM_ORE_PLACED_KEY = registerKey("occum_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHUM_ORE_PLACED_KEY = registerKey("nethum_ore_placed");
    public static final ResourceKey<PlacedFeature> WARRUM_ORE_PLACED_KEY = registerKey("warrum_ore_placed");
    public static final ResourceKey<PlacedFeature> ENNUM_ORE_PLACED_KEY = registerKey("ennum_ore_placed");

    public static void bootsrap(BootstrapContext<PlacedFeature> context){
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, OVUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVUM_ORE),
                ModOrePlacements.commonOrePlacement(32,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(100))));
        register(context, OCCUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OCCUM_ORE),
                ModOrePlacements.commonOrePlacement(5,
                        HeightmapPlacement.onHeightmap(Heightmap.Types.OCEAN_FLOOR_WG)));
        register(context, NETHUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHUM_ORE),
                ModOrePlacements.commonOrePlacement(24,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(100), VerticalAnchor.absolute(125))));
        register(context, WARRUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WARRUM_ORE),
                ModOrePlacements.commonOrePlacement(16,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(10))));
        register(context, ENNUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ENNUM_ORE),
                ModOrePlacements.commonOrePlacement(24,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(50))));

    }


    private static ResourceKey<PlacedFeature> registerKey(String name){
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(HeartOfTheCraft.MODID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers){
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}
