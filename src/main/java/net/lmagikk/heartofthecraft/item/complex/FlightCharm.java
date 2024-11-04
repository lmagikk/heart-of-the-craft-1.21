package net.lmagikk.heartofthecraft.item.complex;

import net.minecraft.ChatFormatting;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class FlightCharm extends Item {
    public FlightCharm(Properties properties){
        super(properties);
    }

    @Override
    public net.minecraft.world.InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        player.getAbilities().mayfly = !player.getAbilities().mayfly;
        if (player.getAbilities().mayfly) {
            player.getAbilities().flying=true;
            level.playSound(player, new BlockPos(player.blockPosition()), SoundEvents.PLAYER_LEVELUP, SoundSource.PLAYERS);
        }
        if (!player.getAbilities().mayfly){
            player.getAbilities().flying = false;
            level.playSound(player, new BlockPos(player.blockPosition()), SoundEvents.SHIELD_BREAK, SoundSource.PLAYERS);
        }
        if (level instanceof ClientLevel){

            player.sendSystemMessage(player.getAbilities().mayfly ? Component.literal("You can now fly!").withStyle(ChatFormatting.BLUE) :
                   Component.literal("Flight is now disabled.").withStyle(ChatFormatting.BLUE));
        }
        return super.use(level, player, usedHand);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.literal("Allows creative flight!").withStyle(ChatFormatting.AQUA));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}

