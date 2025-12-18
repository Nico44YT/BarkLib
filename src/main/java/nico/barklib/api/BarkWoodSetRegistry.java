package nico.barklib.api;

import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class BarkWoodSetRegistry {
    protected static final Map<Identifier, BarkWoodSet> map = new HashMap<>();

    public static void registerWoodSet(Identifier setId, BarkWoodSet woodSet) {
        map.put(setId, woodSet);
    }
}