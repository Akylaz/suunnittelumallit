package teht15Adapter;

import java.util.Random;

public class EnemyRobot {
	Random rng = new Random();

	public void punch() {
		int dmg = rng.nextInt(10) + 1;
		System.out.println("Robot punch does " + dmg + " damage");
	}

	public void walk() {
		int distance = rng.nextInt(10) + 1;
		System.out.println("Robot moves " + distance + " meters");
	}

}
