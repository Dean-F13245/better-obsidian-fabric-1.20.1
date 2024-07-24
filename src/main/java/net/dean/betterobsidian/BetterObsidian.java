package net.dean.betterobsidian;

import net.dean.betterobsidian.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterObsidian implements ModInitializer {
	public static final String MOD_ID = "better_obsidian";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}