package abstractFactory;


public abstract class Phone implements Cloneable {
	
	protected OS os;
	protected String processor;
	protected PhoneBrand brand;
	
	public abstract void configure(OS os, String processor, PhoneBrand brand);

	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", brand=" + brand + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
