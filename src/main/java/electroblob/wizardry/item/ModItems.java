package electroblob.wizardry.item;

import electroblob.wizardry.Wizardry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MAGIC_SHARD = registerItem("crystal_shard", new Item(new FabricItemSettings()));
    public static final Item MAGIC_CRYSTAL = registerItem("crystal_magic", new Item(new FabricItemSettings()));
    public static final Item GRAND_CRYSTAL = registerItem("grand_crystal", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(MAGIC_SHARD);
        entries.add(MAGIC_CRYSTAL);
        entries.add(GRAND_CRYSTAL);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Wizardry.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Wizardry.LOGGER.info("Register mod items for " + Wizardry.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
    }
}
