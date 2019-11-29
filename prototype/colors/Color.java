package prototype.colors;

import prototype.ColorType;

public abstract class Color implements Cloneable{
	
	private ColorType colortype;
	
	public Color(ColorType colorType) {
		this.colortype = colorType;
	}
	
	public void showColor() {
		System.out.println(colortype.toString());
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
