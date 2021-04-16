package PartOne;

import PartTwo.Treadmill;
import PartTwo.Wall;

public class Robot implements Being {

    String name;
    int jumpForce;
    int runForce;

    public Robot(String name, int jumpForce, int runForce) {
        this.name = name;
        this.jumpForce = jumpForce;
        this.runForce = runForce;
    }


    @Override
    public void jump() {
        System.out.println("Робот прыгает!");
    }

    @Override
    public void run() {
        System.out.println("Робот бежит!");
    }

    @Override
    public void passingObstacleWall(Wall wall) {
        if (wall.obstacleHeight < this.jumpForce) {
            this.jumpForce = this.jumpForce - wall.obstacleHeight;
            System.out.println("Робот перепрыгнул. Силы прыжка осталось: " + jumpForce);
        } else {
            System.out.println("Робот не перепрыгнул. Силы прыжка осталось: " + jumpForce);
        }
    }

    @Override
    public void passingObstacleTreadmill(Treadmill treadmill) {
        if (treadmill.obstacleLength < this.runForce) {
            this.runForce = this.runForce - treadmill.obstacleLength;
            System.out.println("Робот перепрыгнул. Силы бега осталось: " + runForce);
        } else {
            System.out.println("Робот не перепрыгнул. Силы бега осталось: " + runForce);
        }
    }
}
