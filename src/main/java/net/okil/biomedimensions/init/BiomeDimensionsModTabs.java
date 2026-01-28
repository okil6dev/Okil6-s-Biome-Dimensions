/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.okil.biomedimensions.init;

import net.okil.biomedimensions.BiomeDimensionsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class BiomeDimensionsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BiomeDimensionsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(BiomeDimensionsModItems.PLAINS_DIMENSION.get());
			tabData.accept(BiomeDimensionsModItems.DESERT_DIMENSION.get());
			tabData.accept(BiomeDimensionsModItems.WARM_OCEAN_DIMENSION.get());
		}
	}
}