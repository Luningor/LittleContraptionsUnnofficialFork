/*package net.luningor.littlecontraptions.ponder.element;

import net.createmod.ponder.api.element.ElementLink;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.foundation.instruction.FadeIntoSceneInstruction;
import net.createmod.ponder.foundation.instruction.FadeOutOfSceneInstruction;
import com.simibubi.create.foundation.ponder.CreateSceneBuilder;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;

public class VehicleInstructions {

    public static class FadeInVehicleInstruction extends FadeIntoSceneInstruction<VehicleElement> {
        public FadeInVehicleInstruction(int fadeInTicks, Direction fadeInFrom, VehicleElement element) {
            super(fadeInTicks, fadeInFrom, element);
        }

        protected Class<VehicleElement> getElementClass() {
            return VehicleElement.class;
        }
    }


    public static class FadeOutVehicleInstruction extends FadeOutOfSceneInstruction<VehicleElement> {
        public FadeOutVehicleInstruction(int fadeInTicks, Direction fadeInFrom, ElementLink element) {
            super(fadeInTicks, fadeInFrom, element);
        }

        protected Class<VehicleElement> getElementClass() {
            return VehicleElement.class;
        }
    }


    private SceneBuilder builder;

    public VehicleInstructions(SceneBuilder builder) {
        this.builder = builder;
    }

    public <T extends Entity> ElementLink<VehicleElement<T>> createVehicle(Vec3 location, float angle, VehicleElement.EntityConstructor<T> type) {
        VehicleElement<T> cart = new VehicleElement<>(location.subtract(0, 0.5, 0), angle, type);
        @SuppressWarnings("unchecked")
        final ElementLink<VehicleElement<T>>[] linkHolder = new ElementLink[1];
        builder.addInstruction(new FadeInVehicleInstruction(10, Direction.DOWN, cart));
        builder.addInstruction((scene) -> {
            scene.linkElement(cart, linkHolder[0]);
        });
        return linkHolder[0];
    }

    public <T extends Entity> void rotateVehicle(ElementLink<VehicleElement<T>> link, float yRotation, int duration) {
        builder.addInstruction(AnimateVehicleInstructions.rotate(link, yRotation, duration));
    }

    public <T extends Entity> void moveVehicle(ElementLink<VehicleElement<T>> link, Vec3 offset, int duration) {
        builder.addInstruction(AnimateVehicleInstructions.move(link, offset, duration));
    }

    public <T extends Entity> void removeVehicle(ElementLink<VehicleElement<T>> elem) {
        builder.addInstruction(new FadeOutVehicleInstruction(10, Direction.DOWN, elem));
    }
}
