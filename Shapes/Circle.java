package test1;

public class Circle extends Shape {
	public double radius;
	public Circle(double radius,double X,double Y){
		super(X,Y);
		this.radius=radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public double calculateArea() {
		Double area = Math.PI * radius * radius;
		return area;
	}
	public double calculateCircumference() {
		double circumference= Math.PI * 2*radius;
		return circumference;
	}
}
