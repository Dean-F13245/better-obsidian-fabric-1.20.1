package net.dean.betterobsidian.item;

import net.dean.betterobsidian.BetterObsidian;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item OBSIDIAN_INGOT = registerItem("obsidian_ingot", new Item(new FabricItemSettings()));

    public static final Item OBSIDIAN_PICKAXE = registerItem("obsidian_pickaxe",
            new PickaxeItem(ModToolMaterial.OBSIDIAN, 1,2f, new FabricItemSettings()));

    public static final Item OBSIDIAN_AXE = registerItem("obsidian_axe",
            new AxeItem(ModToolMaterial.OBSIDIAN, 3,2f, new FabricItemSettings()));

    public static final Item OBSIDIAN_SHOVEL = registerItem("obsidian_shovel",
            new ShovelItem(ModToolMaterial.OBSIDIAN, 0,0f, new FabricItemSettings()));

    public static final Item OBSIDIAN_SWORD = registerItem("obsidian_sword",
            new SwordItem(ModToolMaterial.OBSIDIAN, 5,3f, new FabricItemSettings()));

    public static final Item OBSIDIAN_HOE = registerItem("obsidian_hoe",
            new HoeItem(ModToolMaterial.OBSIDIAN, 0,0f, new FabricItemSettings()));


    public static final Item OBSIDIAN_HELMET = registerItem("obsidian_helmet",
            new ArmorItem(ModArmourMaterials.OBSIDIAN, ArmorItem.Type.HELMET,  new FabricItemSettings()));

    public static final Item OBSIDIAN_CHESTPLATE = registerItem("obsidian_chestplate",
            new ArmorItem(ModArmourMaterials.OBSIDIAN, ArmorItem.Type.CHESTPLATE,  new FabricItemSettings()));

    public static final Item OBSIDIAN_LEGGINGS = registerItem("obsidian_leggings",
            new ArmorItem(ModArmourMaterials.OBSIDIAN, ArmorItem.Type.LEGGINGS,  new FabricItemSettings()));

    public static final Item OBSIDIAN_BOOTS = registerItem("obsidian_boots",
            new ArmorItem(ModArmourMaterials.OBSIDIAN, ArmorItem.Type.BOOTS,  new FabricItemSettings()));





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
