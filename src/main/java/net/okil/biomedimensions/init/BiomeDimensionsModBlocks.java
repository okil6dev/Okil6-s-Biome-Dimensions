/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.okil.biomedimensions.init;

import net.okil.biomedimensions.block.WarmOceanDimensionPortalBlock;
import net.okil.biomedimensions.block.PlainsDimensionPortalBlock;
import net.okil.biomedimensions.block.DesertDimensionPortalBlock;
import net.okil.biomedimensions.BiomeDimensionsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

public class BiomeDimensionsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(BiomeDimensionsMod.MODID);
	public static final DeferredBlock<Block> PLAINS_DIMENSION_PORTAL;
	public static final DeferredBlock<Block> DESERT_DIMENSION_PORTAL;
	public static final DeferredBlock<Block> WARM_OCEAN_DIMENSION_PORTAL;
	static {
		PLAINS_DIMENSION_PORTAL = REGISTRY.register("plains_dimension_portal", PlainsDimensionPortalBlock::new);
		DESERT_DIMENSION_PORTAL = REGISTRY.register("desert_dimension_portal", DesertDimensionPortalBlock::new);
		WARM_OCEAN_DIMENSION_PORTAL = REGISTRY.register("warm_ocean_dimension_portal", WarmOceanDimensionPortalBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}