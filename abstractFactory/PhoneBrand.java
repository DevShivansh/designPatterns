package abstractFactory;

public enum PhoneBrand {

	IPHONE_X(OS.IOS),IPHONE_XI(OS.IOS),
	NOKIA_N72(OS.WINDOWS),NOKIA_N73(OS.WINDOWS),
	ONEPLUS_7(OS.ANDROID), SAMSUNG_S9(OS.ANDROID);
	
	private PhoneBrand(OS os) {
		// TODO Auto-generated constructor stub
		this.os = os;
	}
	
	private OS os;
	
	public OS getOS() {
		return os;
	}
}
