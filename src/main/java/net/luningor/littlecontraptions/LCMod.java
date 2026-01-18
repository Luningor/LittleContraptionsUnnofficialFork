package net.luningor.littlecontraptions;

import net.createmod.ponder.foundation.PonderIndex;
import net.luningor.littlecontraptions.setup.Registration;
import net.luningor.littlecontraptions.setup.ponder.LCPonderPlugin;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LCMod.MOD_ID)
public class LCMod
{
    public static final String MOD_ID = "littlecontraptions";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public LCMod() {
        Registration.register();

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static ResourceLocation asResource(String name) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, name);
    }

    public static String asLocalization(String key) {
        return MOD_ID + "." + key;
    }
}
