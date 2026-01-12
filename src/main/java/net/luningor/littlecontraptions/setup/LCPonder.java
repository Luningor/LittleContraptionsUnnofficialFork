package net.luningor.littlecontraptions.setup;

import net.luningor.littlecontraptions.LCMod;
import net.luningor.littlecontraptions.block.BargeAssemblerBlock;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import dev.murad.shipping.setup.ModBlocks;
import dev.murad.shipping.setup.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class LCPonder {

    private static CreateRegistrate createRegistrate = CreateRegistrate.create(LCMod.MOD_ID);

    public static final BlockEntry<BargeAssemblerBlock> BARGE_ASSEMBLER_ENTRY = new BlockEntry<>(createRegistrate, LCBlocks.BARGE_ASSEMBLER);
    public static final BlockEntry<Block> CORNER_GUIDE_RAIL_BLOCK_BLOCK_ENTRY = new BlockEntry<>(createRegistrate, ModBlocks.GUIDE_RAIL_CORNER);
    public static final BlockEntry<Block> BARGE_DOCK_ENTRY = new BlockEntry<>(createRegistrate, ModBlocks.BARGE_DOCK);
    public static final BlockEntry<Block> TUG_DOCK_ENTRY = new BlockEntry<>(createRegistrate, ModBlocks.TUG_DOCK);
    public static final BlockEntry<Block> LOCO_DOCK_ENTRY = new BlockEntry<>(createRegistrate, ModBlocks.LOCOMOTIVE_DOCK_RAIL);
    public static final BlockEntry<Block> CAR_DOCK_ENTRY = new BlockEntry<>(createRegistrate, ModBlocks.CAR_DOCK_RAIL);
    public static final BlockEntry<Block> AUTO_SWITCH = new BlockEntry<>(createRegistrate, ModBlocks.AUTOMATIC_SWITCH_RAIL);
    public static final BlockEntry<Block> AUTO_TEE = new BlockEntry<>(createRegistrate, ModBlocks.AUTOMATIC_TEE_JUNCTION_RAIL);

    public static final ItemEntry<Item> STEAM_TUG_ITEM_ENTRY = new ItemEntry<>(createRegistrate, ModItems.STEAM_TUG);
    public static final ItemEntry<Item> ENERGY_TUG_ITEM_ENTRY = new ItemEntry<>(createRegistrate, ModItems.ENERGY_TUG);
    public static final ItemEntry<Item> STEAM_LOCOMOTIVE_ENTRY = new ItemEntry<>(createRegistrate, ModItems.STEAM_LOCOMOTIVE);
    public static final ItemEntry<Item> ENERGY_LOCOMOTIVE_ITEM_ENTRY = new ItemEntry<>(createRegistrate, ModItems.ENERGY_LOCOMOTIVE);
    public static final ItemEntry<Item> TUG_ROUTE_ENTRY = new ItemEntry<>(createRegistrate, ModItems.TUG_ROUTE);
    public static final ItemEntry<Item> LOCO_ROUTE_ENTRY = new ItemEntry<>(createRegistrate, ModItems.LOCO_ROUTE);
    public static final ItemEntry<Item> CONTRAPTION_BARGE_ENTRY = new ItemEntry<>(createRegistrate, LCItems.CONTRAPTION_BARGE_ITEM);

    public static void register() {}
}
