package engine.render.game;

import org.lwjgl.util.vector.Vector3f;

public class Camera {

    private Vector3f pos;

    // In 360 degrees
    private float pitch = 80;
    private float yaw = 0;
    private float roll = 0;

    public void create() {
        pos = new Vector3f(0,30,0);
    }

    /*
    public void update() {
        // Mouse movement
        pitch -= Mouse.getDY() * 0.3f;
        yaw += Mouse.getDX() * 0.3f;
        // Keyboard movement
        if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
            pos.z -= Math.sin(Math.toRadians(90-yaw));
            pos.x += Math.cos(Math.toRadians(90-yaw));
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_S)) {
            pos.z += Math.sin(Math.toRadians(90-yaw));
            pos.x -= Math.cos(Math.toRadians(90-yaw));
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_A)) {
            pos.z -= Math.sin(Math.toRadians(180-yaw));
            pos.x += Math.cos(Math.toRadians(180-yaw));
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
            pos.z += Math.sin(Math.toRadians(180-yaw));
            pos.x -= Math.cos(Math.toRadians(180-yaw));
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_SPACE))
            pos.y += 1;
        if (Keyboard.isKeyDown(Keyboard.KEY_X))
            pos.y -= 1;

            pos.x = playerPos.x;
            pos.y = playerPos.y + 2.5f;
            pos.z = playerPos.z;
    }
    */

    // Getters and setters

    public Vector3f getPos() {
        return pos;
    }

    public void setPos(Vector3f pos) {
        this.pos = pos;
    }

    public float getPitch() {
        return pitch;
    }

    public void changePitch(float dp) {
        this.pitch += dp;
    }

    public float getYaw() {
        return yaw;
    }

    public void changeYaw(float dy) {
        this.yaw += dy;
    }

    public float getRoll() {
        return roll;
    }

    public void setRoll(float dr) {
        this.roll += dr;
    }

}