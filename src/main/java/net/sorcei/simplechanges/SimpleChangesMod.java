package net.sorcei.simplechanges;

import net.fabricmc.api.ModInitializer;

import net.sorcei.simplechanges.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleChangesMod implements ModInitializer {
	public static final String SIMPLECHANGES = "simplechanges";
	public static final Logger LOGGER = LoggerFactory.getLogger(SIMPLECHANGES);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}