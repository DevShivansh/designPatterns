package facade;

import facade.menus.Menu;

public class FacadeDesignPattern {

	public static void main(String[] args) {
		HotelKeeper hotelKeeper = new HotelKeeper();
		Menu menu = hotelKeeper.getVegMenu();
		displayMenu(menu);
		menu = hotelKeeper.getNonVegMenu();
		displayMenu(menu);
		menu = hotelKeeper.getCommonMenu();
		displayMenu(menu);
	}
	
	public static void displayMenu(Menu menu) {
		menu.displayMenu();
	}

}
