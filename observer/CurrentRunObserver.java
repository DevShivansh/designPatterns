package observer;

public class CurrentRunObserver implements Observer {

	@Override
	public void update(int runs, int wickets, float overs) {
		// TODO Auto-generated method stub
		StringBuilder score = new StringBuilder();
		score.append("Runs : ").append(runs).append("\nWickets : ").append(wickets).append("\nOvers : ").append(overs);
		System.out.println(score.toString());

	}

}
