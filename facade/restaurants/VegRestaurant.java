package facade.restaurants;

import facade.menus.Menu;
import facade.menus.VegMenu;

public class VegRestaurant implements Hotel{

	@Override
	public Menu getMenu() {
		// TODO Auto-generated method stub
		return new VegMenu();
	}

}
