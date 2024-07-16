package ex5;

import java.util.Scanner;

class student{
	Scanner sc=new Scanner(System.in);
	String name;
	int regno;
	String dpt;
	String spe;
	int cgpa;
	String hst;
	String mn;
	int arr;
	student(int r){
		regno=r;
	}
	void details() {
		System.out.println(" Enter name: ");
	String n=sc.next();
	name=n;
	System.out.println(" Enter dpt: ");
	String d=sc.next();
	dpt=d;
	System.out.println(" Enter hst: ");
	String h=sc.next();
	hst=h;
	System.out.println(" Enter Mentor name: ");
	String m=sc.next();
	mn=m;
//System.out.println(" Enter reg no: ");
//	int r=sc.nextInt();
	System.out.println(" Enter cgpa: ");
	int c=sc.nextInt();
	cgpa=c;
	System.out.println(" Enter arrears: ");
	int e=sc.nextInt();
	arr=e;
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Department : "+dpt);
		System.out.println("reg no : "+regno);
		System.out.println("Hostel name : "+hst);
		System.out.println("Mentor name : "+mn);
		System.out.println("Cgpa : "+cgpa);
		System.out.println("Arrears : "+arr);
	}
}
class UG extends student{
	UG(int r){
		super(r);
	}
	void details() {
		super.details();
		System.out.println();
		
	}
	void dispaly() {
		super.display();
	}
}
class PG extends student{
	PG(int r){
		super(r);
	}
	void details() {
		System.out.println("Enter spe");
		String d=sc.next();
	spe=d;
	super.details();
	System.out.println();
	}
	
	void dispaly() {
		super.display();
		System.out.println("Specialization : "+spe);
	}
	}

public class Ex5_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		student s[]=new student[2];
		 s[0]=new UG(7070);
		 s[1]=new PG(500);
		 s[0].details();
		 s[1].details();
		 System.out.println("1.UG  2.PG");
		 int a=sc.nextInt();
		student seleted=null;
		 if(a==1) {
	    int b=sc.nextInt();
		 for(student f:s) {
			 if(f.regno==b) {
				 seleted=f; 
				 f.display();
				 break;
			 }
			 }
		 }
			 else if(a==2) {
				 int b=sc.nextInt();
				 for(student f:s) {
					 if(f.regno==b) {
						 seleted=f; 
						 f.display();
						 break;
					 }
				 } 
		}
	}

}
