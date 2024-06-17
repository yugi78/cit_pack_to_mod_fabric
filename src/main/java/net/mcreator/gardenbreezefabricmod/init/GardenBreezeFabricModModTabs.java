
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gardenbreezefabricmod.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.gardenbreezefabricmod.GardenBreezeFabricModMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class GardenBreezeFabricModModTabs {
	public static ResourceKey<CreativeModeTab> TAB_GARDENBREEZE = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "gardenbreeze"));
	public static ResourceKey<CreativeModeTab> TAB_MIZUNOS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "mizunos"));
	public static ResourceKey<CreativeModeTab> TAB_GRANNYSCORNER = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "grannyscorner"));
	public static ResourceKey<CreativeModeTab> TAB_MEUBLE = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "meuble"));
	public static ResourceKey<CreativeModeTab> TAB_LUMINAIRE = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "luminaire"));
	public static ResourceKey<CreativeModeTab> TAB_NATURE = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "nature"));
	public static ResourceKey<CreativeModeTab> TAB_NOURRITURE = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "nourriture"));
	public static ResourceKey<CreativeModeTab> TAB_DECORATION = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "decoration"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_GARDENBREEZE,
				FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".gardenbreeze")).icon(() -> new ItemStack(Blocks.LARGE_FERN)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_MIZUNOS, FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".mizunos")).icon(() -> new ItemStack(Items.APPLE)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_GRANNYSCORNER,
				FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".grannyscorner")).icon(() -> new ItemStack(Items.PAINTING)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_MEUBLE, FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".meuble")).icon(() -> new ItemStack(Blocks.LIGHT_BLUE_BED)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_LUMINAIRE,
				FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".luminaire")).icon(() -> new ItemStack(Blocks.REDSTONE_WALL_TORCH)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_NATURE,
				FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".nature")).icon(() -> new ItemStack(Blocks.SWEET_BERRY_BUSH)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_NOURRITURE,
				FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".nourriture")).icon(() -> new ItemStack(Items.MELON_SLICE)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_DECORATION,
				FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".decoration")).icon(() -> new ItemStack(Blocks.MAGENTA_CANDLE)).build());
	}
}
