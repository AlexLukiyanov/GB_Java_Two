package PartOne;

import PartTwo.Let;
import PartTwo.Treadmill;
import PartTwo.Wall;

public class Cat implements Being {

    String name;
    int jumpForce;
    int runForce;

    public Cat(String name, int jumpForce, int runForce) {
        this.name = name;
        this.jumpForce = jumpForce;
        this.runForce = runForce;
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает!");
    }

    @Override
    public void run() {
        System.out.println("Кот бежит!");
    }

    @Override
    public void passingObstacleWall(Wall wall) {
        if (wall.obstacleHeight < this.jumpForce) {
            this.jumpForce = this.jumpForce - wall.obstacleHeight;
            System.out.println("Кот перепрыгнул. Силы прыжка осталось: " + jumpForce);
        } else {
            System.out.println("Кот не перепрыгнул. Силы прыжка осталось: " + jumpForce);
        }
    }

    @Override
    public void passingObstacleTreadmill(Treadmill treadmill) {
        if (treadmill.obstacleLength < this.runForce) {
            this.runForce = this.runForce - treadmill.obstacleLength;
            System.out.println("Кот перепрыгнул. Силы прыжка осталось: " + runForce);
        } else {
            System.out.println("Кот не перепрыгнул. Силы прыжка осталось: " + runForce);
        }
    }
}
