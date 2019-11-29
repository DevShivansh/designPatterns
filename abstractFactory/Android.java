package abstractFactory;

public abstract class Android extends Phone {

	public Android(String processor, PhoneBrand brand) {
		// TODO Auto-generated constructor stub
		configure(OS.ANDROID, processor, brand);
	}
	
	@Override
	public void configure(OS os, String processor, PhoneBrand brand) {
		// TODO Auto-generated method stub
		this.os = os;
		this.processor = processor;
		this.brand = brand;
		
	}
}
