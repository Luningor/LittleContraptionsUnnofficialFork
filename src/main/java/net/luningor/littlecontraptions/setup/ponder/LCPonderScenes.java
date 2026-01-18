/*
 * Copyright (C) 2025  DragonsPlus
 * SPDX-License-Identifier: LGPL-3.0-or-later
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

// ^ Ya I took it from them. Thanks my goats I will never forget this
// Fuck everyone that refuses to make a wiki for ts tho, it shouldn't be this hard, man

package net.luningor.littlecontraptions.setup.ponder;

import com.simibubi.create.AllItems;
import com.simibubi.create.foundation.ponder.CreateSceneBuilder;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.infrastructure.ponder.AllCreatePonderTags;
import com.tterrag.registrate.util.entry.ItemProviderEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;
//import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.foundation.PonderTag;
import net.createmod.ponder.foundation.registration.GenericPonderSceneRegistrationHelper;
import net.luningor.littlecontraptions.ponder.AssemblerScenes;
import net.luningor.littlecontraptions.LCMod;
import net.luningor.littlecontraptions.setup.LCItems;
import net.luningor.littlecontraptions.setup.LCBlocks;
import dev.murad.shipping.setup.ModItems;
import dev.murad.shipping.setup.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import org.openjdk.nashorn.internal.ir.annotations.Ignore;

@SuppressWarnings("removal")
@Mod.EventBusSubscriber(modid = LCMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class LCPonderScenes {

    public static void register(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        PonderSceneRegistrationHelper<ItemProviderEntry<?>> HELPER = helper.withKeyFunction(RegistryEntry::getId);
        //helper.forComponents(LCBlocks.BARGE_ASSEMBLER.get())
        //        .addStoryBoard(
        //                new ResourceLocation(LCMod.MOD_ID, "my_item"),
        //                AssemblerScenes::basicAssemblerScene
        //        );

        HELPER.forComponents(AllItems.BAR_OF_CHOCOLATE)
            .addStoryBoard("basic_assembler", AssemblerScenes::basicAssemblerScene);
        /*HELPER.forComponents(BARGE_ASSEMBLER_ENTRY, CONTRAPTION_BARGE_ENTRY)
                .addStoryBoard("basic_assembler", AssemblerScenes::basicAssemblerScene);

        HELPER.forComponents(STEAM_TUG_ITEM_ENTRY, CORNER_GUIDE_RAIL_BLOCK_BLOCK_ENTRY, ENERGY_TUG_ITEM_ENTRY, TUG_ROUTE_ENTRY)
                .addStoryBoard("basic_tug", TugScenes::basicTugScene);

        HELPER.forComponents(BARGE_DOCK_ENTRY, TUG_DOCK_ENTRY, STEAM_TUG_ITEM_ENTRY, ENERGY_TUG_ITEM_ENTRY)
                .addStoryBoard("tug_dock", TugScenes::dockingScene);

        HELPER.forComponents(LOCO_DOCK_ENTRY, CAR_DOCK_ENTRY, STEAM_LOCOMOTIVE_ENTRY, ENERGY_LOCOMOTIVE_ITEM_ENTRY)
                .addStoryBoard("loco_dock", LocomotiveScenes::dockingScene);

        HELPER.forComponents(STEAM_LOCOMOTIVE_ENTRY, ENERGY_LOCOMOTIVE_ITEM_ENTRY, LOCO_ROUTE_ENTRY, AUTO_SWITCH, AUTO_TEE)
                .addStoryBoard("loco_route", LocomotiveScenes::routeScene);

        PonderRegistry.TAGS.forTag(AllPonderTags.MOVEMENT_ANCHOR)
                .add(BARGE_ASSEMBLER_ENTRY);

        PonderRegistry.TAGS.forTag(LC_LOCOS)
                .add(LOCO_DOCK_ENTRY)
                .add(LOCO_ROUTE_ENTRY)
                .add(STEAM_LOCOMOTIVE_ENTRY)
                .add(ENERGY_LOCOMOTIVE_ITEM_ENTRY)
                .add(AUTO_TEE)
                .add(AUTO_SWITCH)
                .add(CAR_DOCK_ENTRY);

        PonderRegistry.TAGS.forTag(LC_TUGS)
                .add(STEAM_TUG_ITEM_ENTRY)
                .add(CORNER_GUIDE_RAIL_BLOCK_BLOCK_ENTRY)
                .add(ENERGY_TUG_ITEM_ENTRY)
                .add(BARGE_ASSEMBLER_ENTRY)
                .add(CONTRAPTION_BARGE_ENTRY)
                .add(BARGE_DOCK_ENTRY)
                .add(TUG_DOCK_ENTRY)
                .add(TUG_ROUTE_ENTRY);*/
    }
}