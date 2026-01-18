package net.luningor.littlecontraptions.setup;

import net.createmod.ponder.foundation.PonderIndex;
import net.luningor.littlecontraptions.LCMod;
import dev.murad.shipping.entity.custom.vessel.VesselEntity;
import net.luningor.littlecontraptions.setup.ponder.LCPonderPlugin;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = LCMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class LCModBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(LCEntityTypes.CONTRAPTION_BARGE.get(), VesselEntity.setCustomAttributes().build());
    }

    @SubscribeEvent
    public void setup(final FMLClientSetupEvent event) {
        PonderIndex.addPlugin(new LCPonderPlugin());
    }
}
