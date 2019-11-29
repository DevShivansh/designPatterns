package abstractFactory;

public class PhoneFactory {

	private volatile static PhoneFactory factory;
	
	private PhoneFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static PhoneFactory getInstance() {
		
		synchronized (AndroidFactory.class) {
			if( factory == null )
				factory = new PhoneFactory();
			
		}
		return factory;
	}
	
	
	public Phone getPhone(PhoneBrand brand) {
		
		if(brand.getOS() == OS.ANDROID) {
			return AndroidFactory.getInstance().getAndroidPhone(brand);
		}else if ( brand.getOS() == OS.WINDOWS ) {
			return WindowsFactory.getInstance().getWindowsPhone(brand);
		}else if( brand.getOS() == OS.IOS ) {
			return IphoneFactory.getInstance().getIPhone(brand);
		}
		System.out.println("Unregistered brand " + brand);
		return null;
	}
}
