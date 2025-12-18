package nico.barklib.api;

public class BarkWoodSetRegistry {
    protected static final Map<Identifier, BarkWoodSet> map = new HashMap<>();

    public static void registerWoodSet(Identifier setId, BarkWoodSet woodSet) {
        this.map.put(setId, woodSet);
    }
}