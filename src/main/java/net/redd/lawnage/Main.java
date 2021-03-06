package net.redd.lawnage;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
	public static final Block GrassLawn = new Block(FabricBlockSettings.of(Material.SOIL).strength(0.6f).sounds(BlockSoundGroup.GRASS).breakByTool(FabricToolTags.SHOVELS));
	public static final Block MushroomLawn = new Block(FabricBlockSettings.of(Material.SOIL).strength(0.6f).sounds(BlockSoundGroup.GRASS).breakByTool(FabricToolTags.SHOVELS));
	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("lawnage", "grasslawn"), GrassLawn);
		Registry.register(Registry.ITEM, new Identifier("lawnage", "grasslawn"), new BlockItem(GrassLawn, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier("lawnage", "mushroomlawn"), MushroomLawn);
		Registry.register(Registry.ITEM, new Identifier("lawnage", "mushroomlawn"), new BlockItem(MushroomLawn, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		}
}
