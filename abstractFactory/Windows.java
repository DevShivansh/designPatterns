package abstractFactory;

public abstract class Windows extends Phone {
	
	
	public Windows(String processor, PhoneBrand brand) {
		// TODO Auto-generated constructor stub
		configure(OS.WINDOWS, processor, brand);
	}

	@Override
	public void configure(OS os, String processor, PhoneBrand brand) {
		// TODO Auto-generated method stub
		this.os = os;
		this.processor = processor;
		this.brand = brand;
		
	}
}
