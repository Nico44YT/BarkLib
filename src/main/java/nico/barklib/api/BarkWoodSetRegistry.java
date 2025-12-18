package nico.barklib.api;

import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class BarkWoodSetRegistry {
    protected static final Map<Identifier, BarkWoodSet> map = new HashMap<>();

    public static void registerWoodSet(BarkWoodSet woodSet) {
        map.put(woodSet.id(), woodSet);
    }

    public static Optional<BarkWoodSet> maybeGetWoodSet(Identifier id) {
        return Optional.ofNullable(map.get(id));
    }

    public static BarkWoodSet getWoodSet(Identifier id) {
        return map.get(id);
    }

    public static Stream<BarkWoodSet> stream() {
        return map.values().stream();
    }

    public static Stream<Identifier> keyStream() {
        return map.keySet().stream();
    }

    public static Stream<Map.Entry<Identifier, BarkWoodSet>> entryStream() {
        return map.entrySet().stream();
    }
}