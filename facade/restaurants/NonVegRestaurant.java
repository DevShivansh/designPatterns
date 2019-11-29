package facade.restaurants;

import facade.menus.Menu;
import facade.menus.NonVegMenu;

public class NonVegRestaurant implements Hotel{

	@Override
	public Menu getMenu() {
		// TODO Auto-generated method stub
		return new NonVegMenu();
	}

}