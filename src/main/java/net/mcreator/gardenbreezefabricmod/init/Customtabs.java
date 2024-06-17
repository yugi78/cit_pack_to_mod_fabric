
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

public class Customtabs {
	public static ResourceKey<CreativeModeTab> TAB_HANANACRAFT = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "hananacraft"));
	public static ResourceKey<CreativeModeTab> TAB_GHOULCRAFT = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "ghoulcraft"));
	public static ResourceKey<CreativeModeTab> TAB_MINIATURA = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "miniatura"));
	public static ResourceKey<CreativeModeTab> TAB_NATURE = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "nature"));
	public static ResourceKey<CreativeModeTab> TAB_MEUBLE = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "meuble"));
	public static ResourceKey<CreativeModeTab> TAB_DECORATION = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "decoration"));
	public static ResourceKey<CreativeModeTab> TAB_NOURRITURE = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "nourriture"));
	public static ResourceKey<CreativeModeTab> TAB_LUMINAIRES = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GardenBreezeFabricModMod.MODID, "luminaires"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_HANANACRAFT,
				FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".hananacraft")).icon(() -> new ItemStack(Blocks.CHERRY_FENCE_GATE)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_GHOULCRAFT, FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".ghoulcraft")).icon(() -> new ItemStack(Blocks.MELON)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_MINIATURA, FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".miniatura")).icon(() -> new ItemStack(Items.ARMOR_STAND)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_NATURE, FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".nature")).icon(() -> new ItemStack(Blocks.ACACIA_LEAVES)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_MEUBLE, FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".meuble")).icon(() -> new ItemStack(Blocks.CHISELED_BOOKSHELF)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_DECORATION, FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".decoration")).icon(() -> new ItemStack(Blocks.REDSTONE_LAMP)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_NOURRITURE, FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".nourriture")).icon(() -> new ItemStack(Items.CARROT)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_LUMINAIRES, FabricItemGroup.builder().title(Component.translatable("item_group." + GardenBreezeFabricModMod.MODID + ".luminaires")).icon(() -> new ItemStack(Blocks.REDSTONE_LAMP)).build());
	}
}
