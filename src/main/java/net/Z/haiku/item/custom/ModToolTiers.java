package net.Z.haiku.item.custom;

import net.Z.haiku.HaikuMod;
import net.Z.haiku.tags.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier TAMAHAGANE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 600, 12f, 2f, 14,
                    ModTags.Blocks.TAMAHAGANE, () -> Ingredient.of(ModItems.TAMAHAGANE_INGOT.get())),
            new ResourceLocation(HaikuMod.MOD_ID, "alexandrite"), List.of(Tiers.GOLD), List.of());

}
