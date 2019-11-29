package prototype;

import java.util.HashMap;
import java.util.Map;

import prototype.colors.Black;
import prototype.colors.Blue;
import prototype.colors.Color;

public class ColorStore {

	private static Map<ColorType, Color> colors;
	
	static {
		colors = new HashMap<ColorType, Color>();
		colors.put(ColorType.BLACK, new Black());
		colors.put(ColorType.BLUE, new Blue());
	}
	
	
	public static Color getColor(ColorType color) throws CloneNotSupportedException {
		if(colors.containsKey(color)) {
			return (Color) colors.get(color).clone();
		}
		return null;
	}
}
