package factory.phoneFactory;

import factory.phones.Android;
import factory.phones.Iphone;
import factory.phones.Phone;
import factory.phones.Windows;
import factory.utils.PhoneType;

public class PhoneFactory {
	
	public static Phone getPhone(PhoneType type) {
		if(type.equals(PhoneType.IPHONE)) {
			return new Iphone();
		}else if(type.equals(PhoneType.ANDROID)) {
			return new Android();
		}else if(type.equals(PhoneType.WINDOWS)) {
			return new Windows();
		}
		return null;
	}

}
