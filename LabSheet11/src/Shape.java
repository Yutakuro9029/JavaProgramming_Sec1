
public abstract class Shape {
	private String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	public Shape() {
		this.color = "";
	}
	
	//abstract method
	public abstract double getArea();
	
	public String toString() {
		return "Color = "+this.color;
	}
}
