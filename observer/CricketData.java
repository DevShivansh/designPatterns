package observer;

import java.util.ArrayList;
import java.util.List;

public class CricketData  implements Subject{
	
	private int runs;
	private float overs;
	private int wickets;

	private List<Observer> observers;
	
	public CricketData() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<Observer>();
		
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void unregisterObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
		for(Observer o : observers ) {
			o.update(runs, wickets, overs);
		}
		
	}
	
	public void updateScores() {
		runs = 200;
		overs = 20.3f;
		wickets = 2;
		notifyObservers();
	}
	
	
	
}
