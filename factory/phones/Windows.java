package factory.phones;

public class Windows extends Phone{
	
	public Windows() {
		// TODO Auto-generated constructor stub
		setBrand("Microsoft");
		setOS("windows");
		setPrice(20000);
		setProcessor("hiliox 520");
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
