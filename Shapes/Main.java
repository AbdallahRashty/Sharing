package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Point n1 = new Point(1,3);
		Point n2 = new Point(5,7);
		Point n3 = new Point(2,3);
		Point n4 = new Point(6,7);
		System.out.println(n2.Manhattan(n1));
		System.out.println(n2.Euclidean(n1));
		
		//part2
		Line l1 = new Line(n1,n2);
		Line l2 = new Line(n3,n4);
		System.out.println(n2.getSlope(n1));
		System.out.println(n4.getSlope(n3));
		
		System.out.println(l1.parallel(l2));
		
		//part3 
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rectangles: ");
		int n = sc.nextInt();
		
		for (int i=0 ; i<=n ; i++) {
			System.out.println("Enter width: ");
			double w = sc.nextDouble();
			System.out.println("Enter height: ");
			double h = sc.nextDouble();
			
			Rectangle r = new Rectangle(w,h);
			rectangles.add(r);
			double area = w*h;
			if (w>area || h>area) {
				
			}
		}
	}

}
