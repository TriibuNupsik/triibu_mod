package me.triibu_mod;

import me.triibu_mod.entity.ModEntities;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Triibu_mod implements ModInitializer {
    public static final String MOD_ID = "triibu_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModEntities.registerModEntities();

        WorldAPI worldAPI = new WorldAPI();
        worldAPI.StartAPI();
    }
}
