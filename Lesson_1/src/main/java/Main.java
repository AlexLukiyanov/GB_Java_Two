import PartOne.Being;
import PartOne.Cat;
import PartOne.Human;
import PartOne.Robot;
import PartTwo.Let;
import PartTwo.Treadmill;
import PartTwo.Wall;

public class Main {

    public static void main(String[] args) {

        Being[] beingArray = new Being[3];
        Treadmill[] treadmillArray = new Treadmill[3];
        Wall[] wallArray = new Wall[3];

        Being human = new Human("Александр", 10, 20);
        Being robot = new Robot("BostonDynamics", 100, 200);
        Being cat = new Cat("Александр", 50, 30);

        Treadmill treadmill = new Treadmill(10);
        Wall wall = new Wall(5);


        beingArray[0] = human;
        beingArray[1] = robot;
        beingArray[2] = cat;

        wallArray[0] = wall;
        wallArray[1] = wall;
        wallArray[2] = wall;
        treadmillArray[0] = treadmill;
        treadmillArray[1] = treadmill;
        treadmillArray[2] = treadmill;


       for (int i = 0; i < beingArray.length; i++) {
           for (int j = 0; j < wallArray.length; j++) {
               beingArray[i].passingObstacleWall(wall);
           }
       }
        for (int i = 0; i < beingArray.length; i++) {
            for (int j = 0; j < treadmillArray.length; j++) {
                beingArray[i].passingObstacleTreadmill(treadmill);
            }
        }
    }
}
