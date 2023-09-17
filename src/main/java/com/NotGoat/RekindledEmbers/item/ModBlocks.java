package com.NotGoat.RekindledEmbers.item;

import com.NotGoat.RekindledEmbers.RekindledEmbers;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings

            .of(Material.METAL, MapColor.RED)
            .requiresTool()
            .strength(5.0f,6.0f)
            .sounds(BlockSoundGroup.METAL)
    );

    public static final Block RUBY_ORE = new Block(FabricBlockSettings

            .of(Material.STONE, MapColor.GRAY)
            .requiresTool()
            .strength(3.0f, 15.0f)
            .sounds(BlockSoundGroup.STONE)

    );
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(RekindledEmbers.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(RekindledEmbers.MOD_ID, "ruby_ore"), RUBY_ORE);
    }
}
