package facade.menus;

public abstract class Menu {

	private String menu;
	
	public Menu(String menu) {
		this.menu = menu;
	}
	
	public void displayMenu() {
		System.out.println(menu);
	}
}
