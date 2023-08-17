package sorcei.deepslatestairsmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeepslateStairsMod implements ModInitializer {
	public static final String DEEPSLATESTAIRSMOD = "deepslatestairsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(DEEPSLATESTAIRSMOD);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}