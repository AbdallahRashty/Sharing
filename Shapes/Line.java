package test1;

public class Line {
	private Point X;
	private Point Y;
	public Line(Point n1, Point n2) {
		this.X=n1;
		this.Y=n2;
	}
	public void setX(Point x) {
		this.X=x;
	}
	public void setY(Point y) {
		this.Y=y;
	}
	public Point getX()
	{
	return X;
	}
	public Point getY()
	{
	return Y;
	}
	//public double makeLines(Point p) {
		//return double m=(this.p.getY)/
	//}
	public boolean parallel(double a,double b) {
		if(a==b)
			return true;
		else
			return false;
	}
}
