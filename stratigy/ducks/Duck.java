package stratigy.ducks;

import stratigy.behaviors.FlyBehaviour;
import stratigy.behaviors.QuackBehavior;

public abstract class Duck {

	protected FlyBehaviour flyBehaviour;
	protected QuackBehavior quackBehavior;
	
	public Duck(FlyBehaviour flyBehaviour, QuackBehavior quackBehavior) {
		// TODO Auto-generated constructor stub
		this.flyBehaviour = flyBehaviour;
		this.quackBehavior = quackBehavior;
	}
	
	
	public void fly() {
		flyBehaviour.fly();
	}
	
	public void quack() {
		quackBehavior.quack();
	}
	
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void swim() {
		System.out.println("can swim");
	}
	
	public abstract void display();
	
	public void showDuck() {
		display();
		fly();
		quack();
		swim();
	}
}
