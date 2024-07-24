package net.dean.betterobsidian.item;

import net.dean.betterobsidian.BetterObsidian;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item OBSIDIAN_INGOT = registerItem("obsidian_ingot", new Item(new FabricItemSettings()));

    private static void addItemsToItemGroup(FabricItemGroupEntries entries){
        entries.add(OBSIDIAN_INGOT);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(BetterObsidian.MOD_ID, name), item);
    }

    public static void registerModItems(){
        BetterObsidian.LOGGER.info("Registering Mod Items for " + BetterObsidian.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToItemGroup);

    }
}
