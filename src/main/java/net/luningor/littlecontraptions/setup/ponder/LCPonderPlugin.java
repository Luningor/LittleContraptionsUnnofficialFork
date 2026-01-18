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

import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.foundation.registration.GenericPonderSceneRegistrationHelper;
import net.createmod.ponder.foundation.registration.GenericPonderTagRegistrationHelper;
import net.luningor.littlecontraptions.LCMod;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.resources.ResourceLocation;
import javax.annotation.ParametersAreNonnullByDefault;

public class LCPonderPlugin implements PonderPlugin {
    @Override
    @MethodsReturnNonnullByDefault
    public String getModId() {
        return LCMod.MOD_ID;
    }

    static {
        System.out.println("LC PONDER PLUGIN LOADED");
    }

    @ParametersAreNonnullByDefault
    public void registerScenes(GenericPonderSceneRegistrationHelper<ResourceLocation> helper) {
        LCPonderScenes.register(helper);
    }

    @ParametersAreNonnullByDefault
    public void registerTags(GenericPonderTagRegistrationHelper<ResourceLocation> helper) {
        LCPonderTags.register(helper);
    }
}