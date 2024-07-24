package net.dean.betterobsidian;

import net.dean.betterobsidian.Block.ModBlocks;
import net.dean.betterobsidian.item.ModItemGroups;
import net.dean.betterobsidian.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterObsidian implements ModInitializer {
	public static final String MOD_ID = "better_obsidian";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}