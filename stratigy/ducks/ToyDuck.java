package stratigy.ducks;

import stratigy.behaviors.FlyNoWay;
import stratigy.behaviors.MuteQuack;

public class ToyDuck extends Duck{

	public ToyDuck() {
		super(new FlyNoWay(), new MuteQuack());
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Wooden duck");
	}
}
