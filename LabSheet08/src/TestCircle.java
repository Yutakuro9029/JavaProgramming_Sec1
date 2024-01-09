
public class TestCircle {

	public static void main(String[] args) {
		//declare two objects. reference from class circle.
		Circle_1 c1 = new Circle_1();
		Circle_1 c2 = new Circle_1();
		Circle_1 c3 = new Circle_1();
		
		c1.setRadius(2.0);
		c1.setColor("blue");
		System.out.printf("Circle c1's area = %.2f",c1.getArea());
		System.out.println(", and color is "+c1.getColor());
		
		c2.setRadius(2.0);
		c2.setColor("red");
		System.out.printf("Circle c2's area = %.2f",c2.getArea());
		System.out.println(", and color is "+c2.getColor());
		
		c3.setRadius(1.0);
		System.out.printf("Circle c3's area = %.2f",c3.getArea());

	}
	
	public static String showColor(String color) {
		return "The color is "+color;
	}

}
