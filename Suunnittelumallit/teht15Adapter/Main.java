
package teht15Adapter;

public class Main {

	public static void main(String[] args) {
		EnemyTank tank = new EnemyTank();
		EnemyRobot robot = new EnemyRobot();
		Attacker adapter = new Adapter(robot);

		System.out.println("Robot");
		robot.punch();
		robot.walk();

		System.out.println("\nTank");
		tank.shoot();
		tank.drive();

		System.out.println("\nAdapter");
		adapter.shoot();
		adapter.drive();

	}

}
