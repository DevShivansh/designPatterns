package adapter.adapters;

import adapter.bird.Bird;
import adapter.duck.Duck;

public class DuckAdapter implements Bird {
	
	private Duck duck;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}

	@Override
	public void fly() {
		System.out.println("Cant fly!");
		
	}

	@Override
	public void makeSound() {
		duck.sqeek();
		
	}

}
