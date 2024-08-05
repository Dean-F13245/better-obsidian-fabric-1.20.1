package net.dean.betterobsidian.datagen;

import net.dean.betterobsidian.Block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider{
    protected ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.REINFORCED_OBSIDIAN);


    }
}
