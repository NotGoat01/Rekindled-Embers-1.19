package com.NotGoat.RekindledEmbers.registry;

import com.NotGoat.RekindledEmbers.RekindledEmbers;
import com.NotGoat.RekindledEmbers.items.RubyItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;


public class ModItems {

    //Items
    public static final Item moltenheart = new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.EPIC).maxCount(16));
    public static final RubyItem ruby = new RubyItem();
    //mod-id:item-name


    //Block items
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem RUBY_ORE = new BlockItem(ModBlocks.RUBY_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static void registerModItems() {
        Registry.register(Registry.ITEM, new Identifier(RekindledEmbers.MOD_ID,  "molten_heart"), moltenheart);
        Registry.register(Registry.ITEM, new Identifier(RekindledEmbers.MOD_ID,  "ruby"), ruby);
        Registry.register(Registry.ITEM, new Identifier(RekindledEmbers.MOD_ID,  "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(RekindledEmbers.MOD_ID,  "ruby_ore"), RUBY_ORE);
    }


}