package facade;

import facade.menus.Menu;
import facade.restaurants.CommonRestaurant;
import facade.restaurants.NonVegRestaurant;
import facade.restaurants.VegRestaurant;

public class HotelKeeper {

	private VegRestaurant vegRestaurant;
	private NonVegRestaurant nonVegRestaurant;
	private CommonRestaurant commonRestaurant;
	
	public HotelKeeper() {
		vegRestaurant = new VegRestaurant();
		nonVegRestaurant = new NonVegRestaurant();
		commonRestaurant = new CommonRestaurant();
	}
	
	public Menu getVegMenu() {
		return vegRestaurant.getMenu();
	}
	
	public Menu getNonVegMenu() {
		return nonVegRestaurant.getMenu();
	}
	
	public Menu getCommonMenu() {
		return commonRestaurant.getMenu();
	}
}
