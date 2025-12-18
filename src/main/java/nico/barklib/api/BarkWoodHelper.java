package nico.barklib.api;

import net.minecraft.item.ItemConvertible;

import java.util.Optional;

public class BarkWoodHelper {
    public static Optional<BarkWoodSet> getSetFromEntry(ItemConvertible entry) {
        return BarkWoodSetRegistry.stream().filter(set -> set.containsEntry(entry)).findFirst();
    }
}
