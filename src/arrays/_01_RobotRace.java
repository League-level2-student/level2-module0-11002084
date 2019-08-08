package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method

	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[8];
		// 3. use a for loop to initialize the robots.

		for (int i = 0; i < 8; i++) {
			robots[i] = new Robot();
		}

		// 4. make each robot start at the bottom of the screen, side by side, facing up

//		robots[0].setX(100);
//		robots[0].setY(600);
//		robots[1].setX(200);
//		robots[1].setY(600);
//		robots[2].setX(300);
//		robots[2].setY(600);
//		robots[3].setX(400);
//		robots[3].setY(600);
//		robots[4].setX(500);
//		robots[4].setY(600);
//		robots[5].setX(600);
//		robots[5].setY(600);
//		robots[6].setX(700);
//		robots[6].setY(600);
//		robots[7].setX(800);
//		robots[7].setY(600);

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
//
//		int lowestY = 1000;
//
//		while (lowestY > 50) {
//			for (int i = 0; i < 8; i++) {
//				Random rand = new Random();
//				int num = rand.nextInt(50);
//				robots[i].setY(robots[i].getY() - num);
//				if (robots[i].getY() < lowestY) {
//					lowestY = robots[i].getY();
//				}
//				if (lowestY <= 50) {
//					for (int e = 0; e < 8; e++) {
//						robots[e].hide();
//					}
//					robots[i].setX(450);
//					robots[i].setY(300);
//					robots[i].sleep(3000);
//					robots[i].show();
//					System.out.println("Robot "+ i + " is the winner!");
//					robots[i].setSpeed(20);
//					while (lowestY <= 50) {
//						robots[i].turn(360);
//						robots[i].sparkle();
//						robots[i].turn(360);
//						robots[i].unSparkle();
//					}
//				}
//
//				robots[i].sleep(1000);
//			}
//		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

		robots[0].setX(100);
		robots[0].setY(300);
		robots[1].setX(100);
		robots[1].setY(300);
		robots[2].setX(100);
		robots[2].setY(300);
		robots[3].setX(100);
		robots[3].setY(300);
		robots[4].setX(100);
		robots[4].setY(300);
		robots[5].setX(100);
		robots[5].setY(300);
		robots[6].setX(100);
		robots[6].setY(300);
		robots[7].setX(100);
		robots[7].setY(300);

		int lowestX = 1000;

		while (lowestX == 1000) {
			for (int i = 0; i < 8; i++) {
				Random rand = new Random();
				int num = rand.nextInt(10);
				for (int j = 0; j < num; j++) {
					robots[i].setSpeed(1500);
					robots[i].turn(1);
					robots[i].move(5);
				}
//					if (robots[i].getX() < lowestX) {
//						lowestX = robots[i].getY();
//					}
//				if (lowestX <= 50) {
//					for (int e = 0; e < 8; e++) {
//						robots[e].hide();
//					}
//					robots[i].setX(450);
//					robots[i].setY(300);
//					robots[i].sleep(3000);
//					robots[i].show();
//					System.out.println("Robot " + i + " is the winner!");
//					robots[i].setSpeed(20);
//					while (lowestX <= 50) {
//						robots[i].turn(360);
//						robots[i].sparkle();
//						robots[i].turn(360);
//						robots[i].unSparkle();
//					}
//				}

				robots[i].sleep(200);
			}
		}
	}
}
