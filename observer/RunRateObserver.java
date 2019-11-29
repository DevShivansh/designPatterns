package observer;

public class RunRateObserver implements Observer {

	private float runrate;
	private int predictedScore;
	
	@Override
	public void update(int runs, int wickets, float overs) {
		// TODO Auto-generated method stub
		this.runrate = runs/ overs;
		this.predictedScore = (int) (50 * this.runrate);
		StringBuilder str = new StringBuilder();
		str.append("\nRun Rate : ").append(runrate).append("\nPredicted Score : ").append(predictedScore);
		System.out.println(str.toString());
	}

}
