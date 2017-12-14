package teht15Adapter;

import java.util.Random;

public class EnemyTank implements Attacker{
	Random rng = new Random();

	@Override
	public void shoot() {
		int dmg = rng.nextInt(50) + 20;
		System.out.println("Tank's gun does " + dmg + " damage");
	}

	@Override
	public void drive() {
		int distance = rng.nextInt(20) + 10;
		System.out.println("Tank moves " + distance + " meters");

	}

}
