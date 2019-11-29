package factory.phones;

public abstract class Phone {

	protected String brand;
	protected int price;
	protected String OS;
	protected String processor;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void setBrand(String brand);
	
	public abstract void setPrice(int price);
	
	public abstract void setOS(String OS);
	
	public abstract void setProcessor(String processor);

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", price=" + price + ", OS=" + OS + ", processor=" + processor + "]";
	}
	
	
	
	
	
}
