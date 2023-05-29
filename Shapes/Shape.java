package test1;

public abstract class Shape {
	public double X;
	public double Y;
	public Shape(double X,double Y) {
		this.X=X;
		this.Y=Y;
	}
	public void setX(double X) {
		this.X=X;
	}
	public double getX() {
		return X;
	}
	public void setY(double Y) {
		this.Y=Y;
	}
	public double getY() {
		return Y;
	}
	public abstract double calculateArea();
	public abstract double calculateCircumference();
}
