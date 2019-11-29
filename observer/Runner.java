package observer;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer currentRunObserver = new CurrentRunObserver();
		Observer runRateObserver = new RunRateObserver();
		
		CricketData data = new CricketData();
		data.registerObserver(runRateObserver);
		data.registerObserver(currentRunObserver);
		
		data.updateScores();

	}

}
