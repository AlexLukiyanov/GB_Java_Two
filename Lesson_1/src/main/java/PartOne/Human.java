package PartOne;

import PartTwo.Treadmill;
import PartTwo.Wall;

public class Human implements Being {

    String name;
    int jumpForce;
    int runForce;

    public Human(String name, int jumpForce, int runForce) {
        this.name = name;
        this.jumpForce = jumpForce;
        this.runForce = runForce;
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает!");
    }

    @Override
    public void run() {
        System.out.println("Человек бежит!");
    }

    @Override
    public void passingObstacleWall(Wall wall) {
        if (wall.obstacleHeight < this.jumpForce) {
            this.jumpForce = this.jumpForce - wall.obstacleHeight;
            System.out.println("Человек перепрыгнул. Силы прыжка осталось: " + jumpForce);
        } else {
            System.out.println("Человек не перепрыгнул. Силы прыжка осталось: " + jumpForce);
        }
    }

    @Override
    public void passingObstacleTreadmill(Treadmill treadmill) {
        if (treadmill.obstacleLength < this.runForce) {
            this.runForce = this.runForce - treadmill.obstacleLength;
            System.out.println("Человек перепрыгнул. Силы бега осталось: " + runForce);
        } else {
            System.out.println("Человек не перепрыгнул. Силы бега осталось: " + runForce);
        }
    }
}
