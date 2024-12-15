package electroblob.wizardry;

import electroblob.wizardry.item.ModItemGroups;
import electroblob.wizardry.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wizardry implements ModInitializer {
	public static final String MOD_ID = "ebwizardry";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}