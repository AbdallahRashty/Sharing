package test1;

public class Rectangle extends Shape {
	public double height;
	public double width;
	public Rectangle(double height,double width,double X,double Y){
		super(X,Y);
		this.height=height;
		this.width=width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getWidth() {
		return width;
	}
	public double calculateArea() {
		double area=width*height;
		return area;
	}
	public double calculateCircumference() {
		double Circumference = 2*(height+width);
		return Circumference;
	}}
