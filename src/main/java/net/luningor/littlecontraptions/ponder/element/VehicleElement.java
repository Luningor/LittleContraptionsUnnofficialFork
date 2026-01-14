package net.luningor.littlecontraptions.ponder.element;

import com.mojang.blaze3d.vertex.PoseStack;
import net.createmod.ponder.foundation.PonderScene;
import net.createmod.ponder.foundation.element.AnimatedSceneElementBase;
import net.createmod.catnip.animation.LerpedFloat;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;


public class VehicleElement<T extends Entity> extends AnimatedSceneElementBase {
    private Vec3 location;
    private LerpedFloat rotation;
    private T entity;
    private EntityConstructor<T> constructor;
    private float initialRotation;

    public VehicleElement(Vec3 location, float rotation, EntityConstructor<T> constructor) {
        //noinspection unchecked
        this.initialRotation = rotation;
        this.location = location.add(0.0D, 0.0625D, 0.0D);
        this.constructor = constructor;
        this.rotation = LerpedFloat.angular().startWithValue((double)rotation);
    }

    public void reset(PonderScene scene) {
        super.reset(scene);
        this.entity.setPosRaw(0.0D, 0.0D, 0.0D);
        this.entity.xo = 0.0D;
        this.entity.yo = 0.0D;
        this.entity.zo = 0.0D;
        this.entity.xOld = 0.0D;
        this.entity.yOld = 0.0D;
        this.entity.zOld = 0.0D;
        this.rotation.startWithValue((double)this.initialRotation);
    }

    public void tick(PonderScene scene) {
        super.tick(scene);
        if (this.entity == null) {
            this.entity = this.constructor.create(scene.getWorld(), 0.0D, 0.0D, 0.0D);
        }

        ++this.entity.tickCount;
        this.entity.setOnGround(true);
        this.entity.xo = this.entity.getX();
        this.entity.yo = this.entity.getY();
        this.entity.zo = this.entity.getZ();
        this.entity.xOld = this.entity.getX();
        this.entity.yOld = this.entity.getY();
        this.entity.zOld = this.entity.getZ();
    }

    public void setPositionOffset(Vec3 position, boolean immediate) {
        if (this.entity != null) {
            this.entity.setPos(position.x, position.y, position.z);
            if (immediate) {
                this.entity.xo = position.x;
                this.entity.yo = position.y;
                this.entity.zo = position.z;
            }
        }
    }

    public void setRotation(float angle, boolean immediate) {
        if (this.entity != null) {
            this.rotation.setValue((double)angle);
            if (immediate) {
                this.rotation.startWithValue((double)angle);
            }
        }
    }

    public Vec3 getPositionOffset() {
        return this.entity != null ? this.entity.position() : Vec3.ZERO;
    }

    public Vec3 getRotation() {
        return new Vec3(0.0D, (double)this.rotation.getValue(), 0.0D);
    }

    public interface EntityConstructor<T extends Entity> {
        T create(Level var1, double var2, double var4, double var6);
    }
}

