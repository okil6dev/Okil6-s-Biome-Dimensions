/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.okil.biomedimensions.init;

import net.okil.biomedimensions.item.WarmOceanDimensionItem;
import net.okil.biomedimensions.item.PlainsDimensionItem;
import net.okil.biomedimensions.item.DesertDimensionItem;
import net.okil.biomedimensions.BiomeDimensionsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class BiomeDimensionsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BiomeDimensionsMod.MODID);
	public static final DeferredItem<Item> PLAINS_DIMENSION;
	public static final DeferredItem<Item> DESERT_DIMENSION;
	public static final DeferredItem<Item> WARM_OCEAN_DIMENSION;
	static {
		PLAINS_DIMENSION = REGISTRY.register("plains_dimension", PlainsDimensionItem::new);
		DESERT_DIMENSION = REGISTRY.register("desert_dimension", DesertDimensionItem::new);
		WARM_OCEAN_DIMENSION = REGISTRY.register("warm_ocean_dimension", WarmOceanDimensionItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}