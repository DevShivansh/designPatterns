package stratigy.ducks;

import stratigy.behaviors.FlyNoWay;
import stratigy.behaviors.Sqeek;

public class RubberDuck extends Duck{

	public RubberDuck() {
		super(new FlyNoWay(), new Sqeek());
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Rubber duck");
		
	}

}
