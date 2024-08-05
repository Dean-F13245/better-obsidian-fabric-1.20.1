package net.dean.betterobsidian.item;

import net.dean.betterobsidian.BetterObsidian;
import net.dean.betterobsidian.Block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup BetterObsidian_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BetterObsidian.MOD_ID, "better_obsidian"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.better_obsidian"))
                    .icon(() -> new ItemStack(ModItems.OBSIDIAN_INGOT)).entries((displayContext, entries) -> {

                        entries.add(ModItems.OBSIDIAN_INGOT);
                        entries.add(ModBlocks.REINFORCED_OBSIDIAN);

                        entries.add(ModItems.OBSIDIAN_PICKAXE);
                        entries.add(ModItems.OBSIDIAN_SWORD);
                        entries.add(ModItems.OBSIDIAN_AXE);
                        entries.add(ModItems.OBSIDIAN_SHOVEL);
                        entries.add(ModItems.OBSIDIAN_HOE);

                        entries.add(ModItems.OBSIDIAN_HELMET);
                        entries.add(ModItems.OBSIDIAN_CHESTPLATE);
                        entries.add(ModItems.OBSIDIAN_LEGGINGS);
                        entries.add(ModItems.OBSIDIAN_BOOTS);



                    }).build());

    public static void registerItemGroups(){

        BetterObsidian.LOGGER.info("Registering Item Groups");

    }


}
