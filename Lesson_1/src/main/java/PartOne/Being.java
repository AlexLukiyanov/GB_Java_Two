package PartOne;

import PartTwo.Let;
import PartTwo.Treadmill;
import PartTwo.Wall;

public interface Being {

    String name = null;
    int jumpForce = 0;
    int runForce = 0;

    default void jump() {

    }

    default void run() {

    }

    default void passingObstacleWall(Wall wall) {

    }

    default void passingObstacleTreadmill(Treadmill treadmill) {

    }
}
