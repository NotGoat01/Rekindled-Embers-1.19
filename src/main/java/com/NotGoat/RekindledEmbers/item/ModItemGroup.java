package com.NotGoat.RekindledEmbers.item;

import com.NotGoat.RekindledEmbers.RekindledEmbers;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup RUBY = FabricItemGroupBuilder.build(
            new Identifier(RekindledEmbers.MOD_ID, "ruby"), () -> new ItemStack(ModItems.RUBY)
    );
}
