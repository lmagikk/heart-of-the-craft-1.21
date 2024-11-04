package net.lmagikk.heartofthecraft.item.complex;

import net.lmagikk.heartofthecraft.item.ModToolsTiers;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

public class PickAxe extends PickaxeItem {
    public PickAxe(Tier tier, Properties properties){
        super(ModToolsTiers.CRAFFUM, properties  );
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        if( state.is(BlockTags.MINEABLE_WITH_AXE)){
            return 10f;
        }
        if(state.is(BlockTags.MINEABLE_WITH_PICKAXE)){
            return 12f;
        }
        return super.getDestroySpeed(stack, state);
    }

    @Override
    public boolean canPerformAction(ItemStack stack, ItemAbility itemAbility) {
        return ItemAbilities.DEFAULT_AXE_ACTIONS.contains(itemAbility);
    }

    @Override
    public boolean isCorrectToolForDrops(ItemStack stack, BlockState state) {
        if(state.is(BlockTags.MINEABLE_WITH_AXE)){
            return true;
        }
        return super.isCorrectToolForDrops(stack, state);
    }
}
