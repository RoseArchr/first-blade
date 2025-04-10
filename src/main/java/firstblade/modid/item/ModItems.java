package firstblade.modid.item;

import firstblade.modid.FirstBlade;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item THE_FIRST_BLADE = registerItem("first_blade", new Item(
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FirstBlade.MOD_ID,"first_blade")))));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(FirstBlade.MOD_ID, name), item);
    }

    public static void registerModItems(){


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries ->{

            entries.add(THE_FIRST_BLADE);

        });


    }
}
