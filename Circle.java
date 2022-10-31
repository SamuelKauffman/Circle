
public class Circle {
	private int radius;
//Constructor
	public Circle(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius=radius;
	}
	public double CircleArea() {
		double area=(Math.PI*Math.pow(radius, 2));
		return area;
	}
	public double CirclePeri() {
		double peri=(2*Math.PI*radius);
		return peri;
	}
	public static void main(String[] args) {
		Circle circle1= new Circle(10);
		System.out.println("Area is:"+ circle1.CircleArea());
		System.out.println("perimeter is:"+ circle1.CirclePeri());
	}
	
}
