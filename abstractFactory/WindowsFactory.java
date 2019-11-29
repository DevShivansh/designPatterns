package abstractFactory;

import java.util.ArrayList;
import java.util.List;

public class WindowsFactory implements PhoneContract{
	
	private static List<Phone> phones = null;
	
	private volatile static WindowsFactory factory;
	
	private WindowsFactory() {
		// TODO Auto-generated constructor stub
		phones = new ArrayList<Phone>();
		phones.add(new NokiaN72());
		phones.add(new NokiaN73());
	}
	
	public static WindowsFactory getInstance() {
		
		synchronized (AndroidFactory.class) {
			if( factory == null )
				factory = new WindowsFactory();
			
		}
		return factory;
	}
	
	

	public Phone getWindowsPhone(PhoneBrand brand) {
		
		for( Phone p : phones ) {
			if ( p.brand == brand ) {
				try {
					return (Phone) p.clone();
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					System.out.println("Unable to get phone");
				}
			}
		}
		System.out.println("Phone not present in " + brand + " factory");
		return null;
	}



	

	@Override
	public void registerPhone(Phone p) {
		// TODO Auto-generated method stub
		phones.add(p);
		
	}



	@Override
	public void unregisterPhone(Phone p) {
		// TODO Auto-generated method stub
		phones.remove(p);
		
	}


}
