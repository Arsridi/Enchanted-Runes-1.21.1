package net.arsridi.enchantedrunes.item;

import net.arsridi.enchantedrunes.EnchantedRunes;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUNE_SLATE = registerItem("rune_slate", new Item(new Item.Settings()));
    public static final Item ARCANE_RESIN = registerItem("arcane_resin", new Item(new Item.Settings()));

    // Registry item helper method
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EnchantedRunes.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EnchantedRunes.LOGGER.info("Registering Mod Items for " + EnchantedRunes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RUNE_SLATE);
        });
    }
}
