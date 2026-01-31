package net.ihnore_ihor.tutorialmod;

import net.fabricmc.api.ClientModInitializer;
import net.ihnore_ihor.tutorialmod.item.ModItems;

public class TutorialModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
    }
}
