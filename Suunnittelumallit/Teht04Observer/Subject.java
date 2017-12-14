package Teht04Observer;

import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class Subject extends Observable {
	Set<Observer> observers = new HashSet();

	public void attach(Observer o) {
		observers.add(o);
	}

	public void detach(Observer o) {
		observers.remove(o);
	}

	protected void notifyOthers() {
		for(Observer o : observers) {
			o.update(this, null);
		}
	}

}
