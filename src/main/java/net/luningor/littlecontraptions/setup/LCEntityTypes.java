package net.luningor.littlecontraptions.setup;

import net.luningor.littlecontraptions.entity.ContraptionBargeEntity;
import net.luningor.littlecontraptions.LCMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.RegistryObject;

public class LCEntityTypes {

    public static final RegistryObject<EntityType<ContraptionBargeEntity>> CONTRAPTION_BARGE =
            Registration.ENTITIES.register("contraption_barge",
                    () -> EntityType.Builder.<ContraptionBargeEntity>of(ContraptionBargeEntity::new, MobCategory.MISC).sized(0.6f, 0.9f)
                            .build(new ResourceLocation(LCMod.MOD_ID, "contraption_barge").toString()));

    public static void register () {

    }
}
