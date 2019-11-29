package factory;

import factory.phoneFactory.PhoneFactory;
import factory.phones.Phone;
import factory.utils.PhoneType;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Phone iphone = PhoneFactory.getPhone(PhoneType.IPHONE);
		System.out.println(iphone);
		
		Phone android = PhoneFactory.getPhone(PhoneType.ANDROID);
		System.out.println(android);
		
		Phone windows = PhoneFactory.getPhone(PhoneType.WINDOWS);
		System.out.println(windows);
		

	}

}
