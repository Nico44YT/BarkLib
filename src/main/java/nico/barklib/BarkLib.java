package nico.barklib;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import nico.barklib.api.BarkWoodSetRegistry;

public class BarkLib implements ModInitializer {

    public static final String MOD_ID = "barklib";

    @Override
    public void onInitialize() {
        BarkWoodSetRegistry.initVanilla();
    }

    public static Identifier id(String name) {
        return Identifier.of(MOD_ID, name);
    }
}