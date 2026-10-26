package net.Z.haiku.tags;

import net.Z.haiku.HaikuMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(HaikuMod.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> HAIKU_METALLURGY = tag("haiku_metallurgy");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(HaikuMod.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

        public static class Items {
            public static final TagKey<Block> HAIKU_METALLURGY_ITEMS = tag("haiku_metallurgy_items");


            private static TagKey<Block> tag(String name) {
                return BlockTags.create(new ResourceLocation(HaikuMod.MOD_ID, name));
            }

            private static TagKey<Block> forgeTag(String name) {
                return BlockTags.create(new ResourceLocation("forge", name));
            }
        }
    }
}
