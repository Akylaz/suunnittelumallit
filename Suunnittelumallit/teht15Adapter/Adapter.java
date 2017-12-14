package teht15Adapter;

public class Adapter implements Attacker {
	EnemyRobot robo;

	public Adapter(EnemyRobot robot) {
		this.robo = robot;
	}

	@Override
	public void shoot() {
		robo.punch();
	}

	@Override
	public void drive() {
		robo.walk();
	}

}
