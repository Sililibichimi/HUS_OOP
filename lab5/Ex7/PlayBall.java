package oop_hus.lab5.Ex7;

public class PlayBall {

    public static void main(String[] args) {
        Player player = new Player(5, 0);
        Player goalie = new Player(20, 90);
        Ball ball = new Ball(5, 0, 0, 5);

        float xLimit = 40.0f;
        float yLimit = 90.0f;
        float zLimit = 30.0f;

        // position the goal(the goal is in the end of the field(goalY = yLimit))

        float height = 15.0f;
        float width = 20.0f;
        float goalX = 10.0f;
        float goalY = 90.0f;

        // Time to play the game
        int time = 1000;
        // Start the game
        player.kick(ball);
        while (true) {
            --time;
            if (time == 0) {
                System.out.println("Time out!");
                break;
            }
            ball.move();
            System.out.println(ball);
            if (goalie.near(ball)) {
                System.out.println("Goalie wins!");
                break;
            }
            if (ball.getX() > xLimit || ball.getX() < 0) {
                ball.reflectHorizontal();
            }
            if (ball.getY() > yLimit || ball.getY() < 0) {
                ball.reflectVertical();
            }
            if (ball.getZ() > zLimit || ball.getZ() < 0) {
                ball.reflectDepth();
            }
            if (ball.getX() > goalX && ball.getX() < goalX + width && ball.getY() >= goalY && ball.getZ() < height) {
                System.out.println("Player wins!");
                break;
            }
        }
    }
}
