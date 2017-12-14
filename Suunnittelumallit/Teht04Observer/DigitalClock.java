package Teht04Observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
	private ClockTimer timer;

	public DigitalClock(ClockTimer timer) {
		this.timer = timer;
	}

	private void printTime() {
		int second = timer.getSecond();
		int minute = timer.getMinute();
		int hour = timer.getHour();
		System.out.printf("Kello on %02d:%02d:%02d \n", hour,minute,second);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o == timer) {
			printTime();
		}

	}
}
