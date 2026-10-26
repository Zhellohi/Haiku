package net.Z.haiku.datagen;

import net.Z.haiku.HaikuMod;
import net.Z.haiku.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, HaikuMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(
                ModBlocks.SATETSU_DEPOSIT.get(), cubeAll(ModBlocks.SATETSU_DEPOSIT.get()));
        simpleBlockWithItem(
                ModBlocks.RIVER_SATETSU_DEPOSIT.get(), cubeAll(ModBlocks.RIVER_SATETSU_DEPOSIT.get()));
        simpleBlockWithItem(
                ModBlocks.PURE_SATETSU_DEPOSIT.get(), cubeAll(ModBlocks.PURE_SATETSU_DEPOSIT.get()));
        simpleBlockWithItem(
                ModBlocks.IRONSAND_BLOCK.get(), cubeAll(ModBlocks.IRONSAND_BLOCK.get()));
        simpleBlockWithItem(
                ModBlocks.TAMAHAGANE_BLOCK.get(), cubeAll(ModBlocks.TAMAHAGANE_BLOCK.get()));



    }
    public void simpleBlockWithItem(Block block, ModelFile model) {
        simpleBlock(block, model);
        simpleBlockItem(block, model);
    }
}