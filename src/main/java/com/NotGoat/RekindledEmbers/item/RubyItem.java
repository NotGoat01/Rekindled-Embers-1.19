/*
package com.NotGoat.RekindledEmbers.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;


public class RubyItem extends Item {
    public RubyItem() {
        super(new FabricItemSettings().group(ModItemGroup.RUBY));
    }


    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {

        if (!user.getWorld().isClient() && hand == Hand.MAIN_HAND) {
            // runs on serverside only
            if (entity.getType() == EntityType.SHEEP){

                SheepEntity sheep = (SheepEntity) entity;
                sheep.setColor(DyeColor.RED);
                if (!user.isCreative()) {
                    user.getStackInHand(hand).decrement(1);
                }
            } else {
                user.sendMessage(Text.literal("Try using this on a sheep ;)"));

            }

        }
        return super.useOnEntity(stack, user, entity, hand);
    }
}
*/
