package facade.restaurants;

import facade.menus.BothMenu;
import facade.menus.Menu;

public class CommonRestaurant implements Hotel{

	@Override
	public Menu getMenu() {
		// TODO Auto-generated method stub
		return new BothMenu();
	}

}
