package net.Z.haiku.datagen.loot;

import net.Z.haiku.block.ModBlocks;
import net.Z.haiku.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.TAMAHAGANE_BLOCK.get());
        this.dropSelf(ModBlocks.IRONSAND_BLOCK.get());

        this.add(ModBlocks.SATETSU_DEPOSIT.get(),
                block -> createOreDrop(ModBlocks.SATETSU_DEPOSIT.get(), ModItems.IRONSAND.get()));
        this.add(ModBlocks.RIVER_SATETSU_DEPOSIT.get(),
                block -> createOreDrop(ModBlocks.RIVER_SATETSU_DEPOSIT.get(), ModItems.IRONSAND.get()));
        this.add(ModBlocks.PURE_SATETSU_DEPOSIT.get(),
                block -> createOreDrop(ModBlocks.PURE_SATETSU_DEPOSIT.get(), ModItems.IRONSAND.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}