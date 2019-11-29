package stratigy.ducks;

import stratigy.behaviors.FlyWithWings;
import stratigy.behaviors.Quack;

public class MalardDuck extends Duck{

	public MalardDuck() {
		// TODO Auto-generated constructor stub
		super(new FlyWithWings(), new Quack());
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Looks like malard duck!");
		
	}

}
