package com.NotGoat.RekindledEmbers.item;

import com.NotGoat.RekindledEmbers.RekindledEmbers;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;

import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;



public class ModItems {



    //Items
    public static final Item MOLTEN_HEART = registerItem("moltenheart",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));



    //mod-id:item-name


    //Block items
    public static final Item RUBY_BLOCK =  registerItem("ruby_block",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));
    public static final Item RUBY_ORE =  registerItem("ruby_ore",
                new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RekindledEmbers.MOD_ID, name), item);
    }

    public static void registerModItems() {

        RekindledEmbers.LOGGER.debug("Regestering Mod Items For" + RekindledEmbers.MOD_ID);

    }


}