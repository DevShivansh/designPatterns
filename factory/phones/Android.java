package factory.phones;

public class Android extends Phone{

	public Android() {
		// TODO Auto-generated constructor stub
		setBrand("Google");
		setOS("Android");
		setPrice(50000);
		setProcessor("snapdragon 850");
	}
	
	@Override
	public void setBrand(String brand) {
		// TODO Auto-generated method stub
		this.brand = brand;
	}

	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub
		this.price = price;
	}

	@Override
	public void setOS(String OS) {
		// TODO Auto-generated method stub
		this.OS = OS;
	}

	@Override
	public void setProcessor(String processor) {
		// TODO Auto-generated method stub
		this.processor = processor;
	}


}
