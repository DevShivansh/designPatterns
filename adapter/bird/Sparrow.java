package adapter.bird;

public class Sparrow implements Bird{

	@Override
	public void fly() {
		System.out.println("Can fly!");
		
	}

	@Override
	public void makeSound() {
		System.out.println("chrip chrip!");
		
	}

}
