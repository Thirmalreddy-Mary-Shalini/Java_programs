package ex5;

import java.util.Scanner;

class Employee{
	Scanner sc=new Scanner(System.in);
	double bs;
	double gs;
	double ns;
	double tax;
	
	void gscal(){
		System.out.println("Enter basic salary : ");
		double a=sc.nextDouble();
		bs=a;
	}
	void display() {
	System.out.println("Your Salary details");
	}
}
class Manager extends Employee{
	void gscal(){
		super.gscal();
		gs=bs+3500+((20/100)*bs)+((95/100)*bs);
		System.out.println("Gross salary : "+gs);
	}
	void netcal() {
		ns=gs-(25/100);
		System.out.println("Net salary : "+ns);
	}
	void taxcal() {
		tax=bs-gs;
		System.out.println("Tax : "+tax);
	}
	void display() {
		super.display();
		gscal();
		netcal();
		taxcal();
	}
}
class Engineer extends Employee{
	void gscal(){
		super.gscal();
		gs=bs+2500+((15/100)*bs)+((80/100)*bs);
		System.out.println("Gross salary : "+gs);
	}
	void netcal() {
		ns=gs-(15/100);
		System.out.println("Net salary : "+ns);
	}
	void taxcal() {
		tax=bs-gs;
		System.out.println("Tax : "+tax);
	}
	void display() {
		super.display();
		gscal();
		netcal();
		taxcal();
	}
}
public class Ex5_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
Employee e=new Employee();
Manager m=new Manager();
Engineer n=new Engineer();
while (true) {
	System.out.println("1.Manger  2.Enginner");
	int g=sc.nextInt();
	if(g==1) {
		System.out.println("1.gs  2.ns  3.tax  4.print");
		int h=sc.nextInt();
		e=m;
		if(h==1) {
			m.gscal();
		}
	   if(h==2) {
			m.netcal();
		}
		 if(h==3) {
			m.taxcal();
		}
		 if(h==4) {
			m.display();
		}
		else{
			break;
		}
	}
	else if(g==2) {
		System.out.println("1.gs  2.ns  3.tax  4.print");
		int h=sc.nextInt();
		e=n;
		if(h==1) {
			n.gscal();
		}
		else if(h==2) {
			n.netcal();
		}
		else if(h==3) {
			n.taxcal();
		}
		else if(h==4) {
			n.display();
		}
		else{
			break;
		}
	}
}
	}


}
