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

public class LCPonderScenes {
    public static void register(GenericPonderSceneRegistrationHelper<ResourceLocation> helper) {
        GenericPonderSceneRegistrationHelper<RegistryObject<Item>> HELPER = helper.withKeyFunction(RegistryObject<Item>::getId);

        AllItems.register();
        HELPER.forComponents(LCItems.BARGE_ASSEMBLER)
                .addStoryBoard("basic_assembler", AssemblerScenes::basicAssemblerScene);

    }
}