package net.Z.haiku.item;

import net.Z.haiku.HaikuMod;
import net.Z.haiku.block.ModBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HaikuMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HAIKU = CREATIVE_MODE_TABS.register("haiku",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.TAMAHAGANE_INGOT.get()))
                    .title(Component.translatable("Haiku"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItem.TAMAHAGANE_INGOT.get());
                        output.accept(ModItem.IRONSAND.get());
                        output.accept(ModItem.REFINED_IRON.get());

                        output.accept(ModBlock.TAMAHAGANE_BLOCK.get());
                        output.accept(ModBlock.SATETSU_DEPOSIT.get());
                        output.accept(ModBlock.RIVER_SATETSU_DEPOSIT.get());
                        output.accept(ModBlock.PURE_SATETSU_DEPOSIT.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
