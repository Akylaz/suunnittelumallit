package Teht04Observer;

import java.util.Observer;

public class Main {

	public static void main(String[] args) {
		ClockTimer timer = new ClockTimer();
		Observer digi = new DigitalClock(timer);

		timer.addObserver(digi);
		new Thread(timer).start();
	}

}
