package adapter;

import adapter.adapters.BirdAdapter;
import adapter.bird.Bird;
import adapter.bird.Sparrow;
import adapter.duck.Duck;
import adapter.duck.RubberDuck;

public class AdapterDesignPattern {

	public static void main(String[] args) {
		Duck duck = new RubberDuck();
		duck.sqeek();
		
		System.out.println();
		Bird bird = new Sparrow();
		bird.fly();
		bird.makeSound();
		
		System.out.println("Bird adapter to use bird");
		BirdAdapter adapter = new BirdAdapter(bird);
		adapter.sqeek();
		
	}

}
