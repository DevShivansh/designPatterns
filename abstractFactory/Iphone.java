package abstractFactory;

public abstract class Iphone extends Phone {

	public Iphone(String processor, PhoneBrand brand) {
		// TODO Auto-generated constructor stub
		configure(OS.IOS, processor, brand);
	}

	@Override
	public void configure(OS os, String processor, PhoneBrand brand) {
		// TODO Auto-generated method stub
		this.os = os;
		this.processor = processor;
		this.brand = brand;
		
	}
}
