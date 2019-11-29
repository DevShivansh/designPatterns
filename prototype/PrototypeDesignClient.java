package prototype;

import prototype.colors.Color;

public class PrototypeDesignClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		Color color = ColorStore.getColor(ColorType.BLACK);
		color.showColor();
		
		Color color2 = ColorStore.getColor(ColorType.BLACK);
		color2.showColor();
		
		System.out.println(color == color2);

	}

}
