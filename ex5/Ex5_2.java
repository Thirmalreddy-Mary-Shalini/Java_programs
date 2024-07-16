package ex5;

import java.util.Scanner;

class Shape{
	double d1;
	double d2;
	double area;
	public double getd1() {
		return d1;
	}
	void setd1(double x) {
		d1=x;
	}
	public double getd2() {
		return d2;
	}
	void setd2(double z) {
		d2=z;
	}
 public void calarea() {
		System.out.println("Area : ");
	}
}
class Triangle extends Shape{
	public void calarea() {
    super.calarea();
    area=0.5*d1*d2;
    System.out.println(area);
	}
}
	class Rectangle extends Shape{
		public void calarea() {
	    super.calarea();
	    area=d1*d2;
	    System.out.println(area);
		}
	}
public class Ex5_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Shape s;
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		while (true) {
			System.out.println("1.Triangle  2.Retangle");
			int g=sc.nextInt();
			if(g==1) {
				s=t;
				System.out.println("Enter base value");
				double x=sc.nextDouble();
				s.setd1(x);
				System.out.println("Enter height value");
				double z=sc.nextDouble();
				s.setd2(z);
				s.calarea();
	}
			else if(g==2) {
				s=r;
				System.out.println("Enter base value");
				double x=sc.nextDouble();
				s.setd1(x);
				System.out.println("Enter height value");
				double z=sc.nextDouble();
				s.setd2(z);
				s.calarea();
			}
			else {
				break;
			}
		}
	}
}
