package abstractFactory;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PhoneFactory.getInstance().getPhone(PhoneBrand.IPHONE_X));
		System.out.println(PhoneFactory.getInstance().getPhone(PhoneBrand.IPHONE_XI));
		System.out.println(PhoneFactory.getInstance().getPhone(PhoneBrand.NOKIA_N72));
		System.out.println(PhoneFactory.getInstance().getPhone(PhoneBrand.NOKIA_N73));
		System.out.println(PhoneFactory.getInstance().getPhone(PhoneBrand.ONEPLUS_7));
		System.out.println(PhoneFactory.getInstance().getPhone(PhoneBrand.SAMSUNG_S9));

	}

}
