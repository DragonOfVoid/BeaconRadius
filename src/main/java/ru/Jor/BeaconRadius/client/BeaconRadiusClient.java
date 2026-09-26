package ru.Jor.BeaconRadius.client;

import net.fabricmc.api.ClientModInitializer;
import ru.Jor.BeaconRadius.BeaconRadius;
public class BeaconRadiusClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BeaconRadius.LOGGER.info("Client side of mod {} initialized!", BeaconRadius.MOD_ID);
    }
}
