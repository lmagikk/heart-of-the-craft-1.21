package net.lmagikk.heartofthecraft.worldgen;

import net.lmagikk.heartofthecraft.HeartOfTheCraft;
import net.lmagikk.heartofthecraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVUM_ORE = registerKey("ovum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OCCUM_ORE = registerKey("occum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHUM_ORE = registerKey("nethum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WARRUM_ORE = registerKey("warrum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ENNUM_ORE = registerKey("ennum_ore");

public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
    RuleTest stoneReplacables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
    RuleTest deepslateReplacables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
    RuleTest netherrackReplacables = new BlockMatchTest(Blocks.NETHERRACK);
    RuleTest endReplacables = new BlockMatchTest(Blocks.END_STONE);



    register(context, OVUM_ORE, Feature.ORE, new OreConfiguration(stoneReplacables,ModBlocks.OVUM_ORE.get().defaultBlockState(), 8));
    register(context, OCCUM_ORE, Feature.ORE, new OreConfiguration(stoneReplacables,ModBlocks.OCCUM_ORE.get().defaultBlockState(), 5));
    register(context, NETHUM_ORE, Feature.ORE, new OreConfiguration(netherrackReplacables,ModBlocks.OVUM_ORE.get().defaultBlockState(), 4));
    register(context, WARRUM_ORE, Feature.ORE, new OreConfiguration(deepslateReplacables,ModBlocks.OVUM_ORE.get().defaultBlockState(), 8));
    register(context, ENNUM_ORE, Feature.ORE, new OreConfiguration(endReplacables,ModBlocks.OVUM_ORE.get().defaultBlockState(), 4));

}





    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(HeartOfTheCraft.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                         ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
