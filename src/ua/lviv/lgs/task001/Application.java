package ua.lviv.lgs.task001;

public class Application {

	public static void main(String[] args) {

		Robot robot = new Robot("Robot", "просто працюю");
		robot.work();
		CoffeRobot coffeRobot = new CoffeRobot("CoffeRobot", "варю каву");
		coffeRobot.work();
		RobotDancer robotDancer = new RobotDancer("RobotDancer", "просто танцюю");
		robotDancer.work();
		RobotCoocker robotCoocker = new RobotCoocker("RobotCoocker", "просто готую");
		robotCoocker.work();

		System.out.println("");
		System.out.println("-----------------Class array------------------------");
		System.out.println("");

		Robot[] robots = new Robot[4];

		robots[0] = new Robot("Robot", "просто працюю");
		robots[1] = new CoffeRobot("CoffeRobot", "варю каву");
		robots[2] = new RobotDancer("RobotDancer", "просто танцюю");
		robots[3] = new RobotCoocker("RobotCoocker", "просто готую");

		for (int i = 0; i <= 3; i++) {
			robots[i].work();
		}
	}

}
