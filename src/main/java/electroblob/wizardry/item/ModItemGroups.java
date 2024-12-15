package electroblob.wizardry.item;

import electroblob.wizardry.Wizardry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup WIZARDRY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Wizardry.MOD_ID, "crystal_magic"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.ebwizardry"))
                    .icon(() -> new ItemStack(ModItems.MAGIC_CRYSTAL))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MAGIC_SHARD);
                        entries.add(ModItems.MAGIC_CRYSTAL);
                        entries.add(ModItems.GRAND_CRYSTAL);
                    }).build());
    //itemGroup.ebwizardrygear
    //itemGroup.ebwizardryspells

    public static void registerItemGroups() {
        Wizardry.LOGGER.info("Register items groups for " + Wizardry.MOD_ID);

    }
}
