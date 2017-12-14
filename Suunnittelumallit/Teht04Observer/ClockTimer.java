package Teht04Observer;

public class ClockTimer extends Subject implements Runnable {
	private int second = 0;
	private int minute = 0;
	private int hour = 0;

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	void tick() {
		second++;
		if(second>59) {
			second = 0;
			minute++;
			if(minute>59) {
				minute = 0;
				hour++;
				if(hour>23) {
					hour = 0;
				}
			}
		}
	}

	@Override
	public void run() {
		while(true) {
			tick();
			setChanged();
			notifyObservers(second);
		}

	}


}
