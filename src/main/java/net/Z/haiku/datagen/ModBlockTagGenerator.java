package net.Z.haiku.datagen;

import net.Z.haiku.HaikuMod;
import net.Z.haiku.block.ModBlocks;
import net.Z.haiku.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, HaikuMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.HAIKU_METALLURGY)
                .add(ModBlocks.SATETSU_DEPOSIT.get()).addTag(Tags.Blocks.GRAVEL);

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.IRONSAND_BLOCK.get(),
                ModBlocks.PURE_SATETSU_DEPOSIT.get(),
                        ModBlocks.SATETSU_DEPOSIT.get(),
                        ModBlocks.RIVER_SATETSU_DEPOSIT.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TAMAHAGANE_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RIVER_SATETSU_DEPOSIT.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.IRONSAND_BLOCK.get(),
                ModBlocks.SATETSU_DEPOSIT.get(),
                        ModBlocks.PURE_SATETSU_DEPOSIT.get());


        }

    @Override
    public String getName() {
        return "Block Tags";
    }
    }