package net.dean.betterobsidian.datagen;

import net.dean.betterobsidian.Block.ModBlocks;
import net.dean.betterobsidian.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REINFORCED_OBSIDIAN);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.OBSIDIAN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_SWORD, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OBSIDIAN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OBSIDIAN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OBSIDIAN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OBSIDIAN_BOOTS));

    }
}
