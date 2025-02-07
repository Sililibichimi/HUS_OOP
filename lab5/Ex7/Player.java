package oop_hus.lab5.Ex7;

import java.util.Random;

public class Player {
    // number of the player
    int number;
    // position of the player
    private float x;
    private float y;
    private float z;

    // constructor
    public Player(int number, float x) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = 0.0f;
    }

    // Move the player
    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }

    // Jump the player
    public void jump(float zDisp) {
        z += zDisp;
    }

    // Check if the player is near the ball
    public boolean near(Ball ball) {
        return Math.sqrt((x - ball.getX()) * (x - ball.getX()) + (y - ball.getY()) * (y - ball.getY()) + (z - ball.getZ()) * (z - ball.getZ())) < 5;
    }

    // Kick the ball by head
    public void kick(Ball ball) {
        final float KICK_FORCE = 3.0f;
        Random random = new Random();
        float direcX = random.nextFloat();
        float direcY = random.nextFloat();
        float direcZ = random.nextFloat();
        float temp = (float) Math.sqrt(direcX * direcX + direcY * direcY + direcZ * direcZ);

        direcX /= temp;
        direcY /= temp;
        direcZ /= temp;

        float deltaX = KICK_FORCE * direcX;
        float deltaY = KICK_FORCE * direcY;
        float deltaZ = KICK_FORCE * direcZ;
        ball.setSpeed(deltaX, deltaY, deltaZ);
    }
}
