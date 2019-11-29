package stratigy;

import stratigy.ducks.Duck;
import stratigy.ducks.MalardDuck;
import stratigy.ducks.RubberDuck;
import stratigy.ducks.ToyDuck;

public class StrategyDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new MalardDuck();
		duck.showDuck();
		System.out.println();
		duck = new RubberDuck();
		duck.showDuck();
		System.out.println();
		duck = new ToyDuck();
		duck.showDuck();

	}

}
