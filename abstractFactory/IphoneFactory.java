package abstractFactory;

import java.util.ArrayList;
import java.util.List;

public class IphoneFactory implements PhoneContract {

	private static List<Phone> phones = null;
	
	private volatile static IphoneFactory factory;
	
	private IphoneFactory() {
		// TODO Auto-generated constructor stub
		phones = new ArrayList<Phone>();
		phones.add(new IphoneX());
		phones.add(new IphoneXI());
	}
	
	public static IphoneFactory getInstance() {
		
		synchronized (AndroidFactory.class) {
			if( factory == null )
				factory = new IphoneFactory();
			
		}
		return factory;
	}
	
	

	public Phone getIPhone(PhoneBrand brand) {
		
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
