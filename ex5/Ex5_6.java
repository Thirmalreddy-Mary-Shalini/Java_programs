package ex5;

import java.util.Scanner;

class Incometax
{ 
	Scanner sc=new Scanner(System.in);
	String n;
	int a;
	int ai;
	double tax;

	void findtax() {
		System.out.println("Tax to be paid : ");
	}
	void details() {
		System.out.println("Enter name : ");
		String f=sc.next();
		n=f;
		System.out.println("Enter age : ");
		int a=sc.nextInt();
		System.out.println("Enter annual income : ");
		int i=sc.nextInt();
	    ai=i;
	}
}
class Resident extends Incometax {
	void findtax() {
		super.details();
		super.findtax();
		if(ai<=250000) {
			tax=0;
			System.out.println("Tax : "+tax);
		}
		else if(ai>250001 && ai<=500000) {
			tax=ai*0.05;
			System.out.println("Tax : "+tax);
		}
		else if(ai>500001 && ai<=750000) {
			tax=(ai*0.1)+12500;
			System.out.println("Tax : "+tax);
		}
		else if(ai>750001 && ai<=1000000) {
			tax=(ai*0.15)+37500;
			System.out.println("Tax : "+tax);
		}
		else {
			tax=(ai*2)+75000;
			System.out.println("Tax : "+tax);	
		}
	}
}
class Citizen extends Incometax {
	void findtax() {
		super.details();
		super.findtax();
		if(ai<=250000) {
			tax=0;
			System.out.println("Tax : "+tax);
		}
		else if(ai>250001 && ai<=500000) {
			tax=0;
			System.out.println("Tax : "+tax);
		}
		else if(ai>500001 && ai<=750000) {
			tax=(ai*0.05)+12500;
			System.out.println("Tax : "+tax);
		}
		else if(ai>750001 && ai<=1000000) {
			tax=(ai*0.15)+37500;
			System.out.println("Tax : "+tax);
		}
		else {
			tax=(ai*2)+75000;
			System.out.println("Tax : "+tax);	
		}
	}
}
public class Ex5_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Incometax u=new Incometax();
	Resident r=new Resident();
	Citizen c=new Citizen();
	while(true) {
		System.out.println("1.Resident  2.Citizen");
	int a=sc.nextInt();
	if(a==1) {
		u=r;
		u.findtax();
	}
	else if(a==2) {
		u=c;
		u.findtax();
	}
	else {
		break;
	}
	}

	}

}
