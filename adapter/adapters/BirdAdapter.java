package adapter.adapters;

import adapter.bird.Bird;
import adapter.duck.Duck;

public class BirdAdapter implements Duck{

	private Bird bird;
	
	public BirdAdapter(Bird bird) {
		this.bird = bird;
	}
	
	@Override
	public void sqeek() {
		bird.makeSound();
	}

}
