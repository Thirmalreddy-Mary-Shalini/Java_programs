package ex5;

import java.util.Scanner;

class Fuel{
	 Scanner sc=new Scanner(System.in);
	String fn;
	String state;
	int cost;
	String cn;
	int nl;
void calcost() {
	System.out.println("Amount to be paid : ");
}
void display() {
	System.out.println("Customer name : "+cn);
	System.out.println("State : "+state);
	System.out.println("No of liters : "+nl);
}
}
interface lkh{ 
void details();
}
class petrol extends Fuel implements lkh{
	public void details() {
		System.out.println("Enter name : ");
		String s=sc.next();
		cn=s;
		System.out.println("No of litres required : ");
		int d=sc.nextInt();
		nl=d;
		System.out.println("Enter state name : ");
		String q=sc.next();
		state=q;
		super.display();
	}
	void calcost() {
		super.calcost();
		if(state.equals("T")) {
			int c=nl*97;
			cost=c;
			System.out.println("Cost : "+cost);
			
		}
		else if(state=="K") {
			int c=nl*98;
			cost=c;
			System.out.println("Cost : "+cost);
			
		}
		else if(state=="Ka") {
			int c=nl*99;
			cost=c;
			System.out.println("Cost : "+cost);
			
		}
	}
	
}
class diesel extends Fuel implements lkh{
	public void details() {
		System.out.println("Enter name : ");
		String s=sc.next();
		cn=s;
		System.out.println("No of litres required : ");
		int d=sc.nextInt();
		nl=d;
		System.out.println("Enter state name : ");
		String q=sc.next();
		state=q;
		super.display();
	}
	void calcost() {
		super.calcost();
		if(state=="T") {
			int c=nl*96;
			System.out.println("Cost : "+cost);
			cost=c;
		}
		else if(state=="K") {
			int c=nl*97;
			System.out.println("Cost : "+cost);
			cost=c;
		}
		else if(state=="Ka") {
			int c=nl*98;
			System.out.println("Cost : "+cost);
			cost=c;
		}
	}
	
}
class Kerosene extends Fuel implements lkh{
	public void details() {
		System.out.println("Enter name : ");
		String s=sc.next();
		cn=s;
		System.out.println("No of litres required : ");
		int d=sc.nextInt();
		nl=d;
		System.out.println("Enter state name : ");
		String q=sc.next();
		state=q;
		super.display();
	}
	void calcost() {
		super.calcost();
		if(state=="T") {
			int c=nl*25;
			System.out.println("Cost : "+cost);
			cost=c;
		}
		else if(state=="K") {
			int c=nl*26;
			System.out.println("Cost : "+cost);
			cost=c;
		}
		else if(state=="Ka") {
			int c=nl*27;
			System.out.println("Cost : "+cost);
			cost=c;
		}
	}
	
}
class Lpg extends Fuel implements lkh{
	public void details() {
		
		System.out.println("Enter name : ");
		String s=sc.next();
		cn=s;
		System.out.println("No of litres required : ");
		int d=sc.nextInt();
		nl=d;
		System.out.println("Enter state name : ");
		String q=sc.next();
		state=q;
		super.display();
	}
	void calcost() {
		super.calcost();
		if(state=="T") {
			int c=nl*70;
			System.out.println("Cost : "+cost);
			cost=c;
		}
		else if(state=="K") {
			int c=nl*71;
			System.out.println("Cost : "+cost);
			cost=c;
		}
		else if(state=="Ka") {
			int c=nl*72;
			System.out.println("Cost : "+cost);
			cost=c;
		}
	}
	
}
public class Ex5_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fuel f=new Fuel();
		petrol p=new petrol();
		diesel d=new diesel();
		Kerosene k=new Kerosene();
		Lpg l=new Lpg();
		while(true) {
			System.out.println("1.Petrol  2.Diesel  3.Kerosene  4.LPg");
			int a=sc.nextInt();
			if(a==1) {
				f=p;
				p.details();
				p.calcost();
			}
			else if(a==2) {
				f=d;
				d.details();
				d.calcost();
			}
			else if(a==3) {
				f=k;
				k.details();
				k.calcost();
			}
			else if(a==4) {
				f=l;
				l.details();
				l.calcost();
			}
			else {
				break;
			}
		}
	}

}
