package robot;

import org.jointheleague.graphical.robot.Robot;


public class RobotSquare {
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
Robot liza = new Robot();

        // 3. Put the robot's pen down
liza.penDown();

        // 6. Make the robot move as fast as possible

liza.setSpeed(500);
        // 5. Do everything below here 4 times
for (int i = 0; i < 4; i++) {
	


        //         2. Move your robot 200 pixels
liza.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
liza.turn(90);
}
    }
}
