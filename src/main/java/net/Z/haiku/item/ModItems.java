package net.Z.haiku.item;

import net.Z.haiku.HaikuMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HaikuMod.MOD_ID);

    public static final RegistryObject<Item> IRONSAND = ITEMS.register("ironsand",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_IRON = ITEMS.register("refined_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TAMAHAGANE_INGOT = ITEMS.register("tamahagane_ingot",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
