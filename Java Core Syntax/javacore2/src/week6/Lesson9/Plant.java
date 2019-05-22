package week6.Lesson9;

public class Plant {

	private int size;
	private Color color;
	private Type type;

	public Plant(int size, String color, String type) throws ColorException, TypeException {
		
		this.size = size;
		this.color = fromStringToEnumColor(color);
		this.type = fromStringToEnumType(type);
	}

	private Color fromStringToEnumColor(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "red":
			return Color.RED;
			
		case "green":
			return Color.GREEN;
			
		case "white":
			return Color.WHITE;
			

		default:
			throw new ColorException("You entered wrong color: should choose beetween RED, GREEN, white");
			
		}
		
	}
	
	private Type fromStringToEnumType(String type) throws TypeException{
		switch (type.toLowerCase()) {
		case "long":
			return Type.LONG;
			
		case "wide":
			return Type.WIDE;
			
		case "short":
			return Type.SHORT;
			

		default:
			throw new TypeException("You entered wrong Type: should choose beetween wide, short, long");
			
		}
		
	}

	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	}
	
	
	
	

}
