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

/*package net.luningor.littlecontraptions.setup.ponder;

import com.tterrag.registrate.util.entry.RegistryEntry;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.luningor.littlecontraptions.LCMod;
import dev.murad.shipping.setup.ModItems;
import net.minecraft.resources.ResourceLocation;

public class LCPonderTags {
    public static final ResourceLocation LC_TUGS = LCMod.asResource("tugs");

    public static final ResourceLocation LC_LOCOS = LCMod.asResource("trains");

    public static void register(PonderTagRegistrationHelper<ResourceLocation> helper) {
        PonderTagRegistrationHelper<RegistryEntry<?>> entryHelper = helper.withKeyFunction(RegistryEntry::getId);

        helper.registerTag(LC_TUGS)
                .addToIndex()
                .item(ModItems.STEAM_TUG.get(), true, false)
                .title("Little Logistics Tugs")
                .description("Water trains with pathfinding!")
                .register();

        helper.registerTag(LC_LOCOS)
                .addToIndex()
                .item(ModItems.STEAM_LOCOMOTIVE.get(), true, false)
                .title("Little Logistics Trains")
                .description("Small but smart locomotives!")
                .register();
    }
}