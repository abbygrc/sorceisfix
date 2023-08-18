package net.sorcei.simplechanges.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sorcei.simplechanges.SimpleChangesMod;

public class ModBlocks {
    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(SimpleChangesMod.SIMPLECHANGES, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(SimpleChangesMod.SIMPLECHANGES, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        SimpleChangesMod.LOGGER.debug("Registering ModBlocks for: " + SimpleChangesMod.SIMPLECHANGES);
    }
}
