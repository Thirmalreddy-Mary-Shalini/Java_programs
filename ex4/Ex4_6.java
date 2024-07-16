package ex4;

import java.util.Scanner;

class Student{
			String name;
			int id;
			String dpt;
			String sep;
			int cgpa;
			int bs;
			int da;
			int gp;
			int pp;
			int itax;
			int pt;
			int epf;
			void display(){
				name=null;
				dpt=null;
				sep=null;
				id=0;
				cgpa=0;
			}
			String getname() {
				return name;
			}
			void setname(String n) {
				name=n;
			}
			String getdpt() {
				return dpt;
			}
			void setdpt(String d) {
				dpt=d;
			}
			String getsep() {
				return sep;
			}
			void setsep(String f) {
				sep=f;
			}
			int getid() {
				return id;
			}
			void setid(int i) {
				id=i;
			}
			int getcgpa() {
				return cgpa;
			}
			void setcgpa(int b) {
				cgpa=b;
			}
		}
public class Ex4_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student e=new Student();
		while(true) {
			System.out.println("1.add 2.edit 3.delete 4.display");
		int a=sc.nextInt();
		if(a==1) {
			System.out.println("enter name : ");
			String n=sc.next();
			e.setname(n);
			System.out.println("enter department : ");
			String d=sc.next();
			e.setdpt(d);
			System.out.println("enter specialization : ");
			String f=sc.next();
			e.setsep(f);
			System.out.println("enter id no : ");
		    int c=sc.nextInt();
			e.setid(c);
			System.out.println("enter cgpa : ");
		    int x=sc.nextInt();
			e.setcgpa(x);
			System.out.println();
		}
		else if(a==2) {
			e.display();
			System.out.println("enter name : ");
			String n=sc.next();
			e.setname(n);
			System.out.println("enter department : ");
			String d=sc.next();
			e.setdpt(d);
			System.out.println("enter Designation : ");
			String f=sc.next();
			e.setsep(f);
			System.out.println("enter id no : ");
		    int c=sc.nextInt();
			e.setid(c);
			System.out.println("enter bs : ");
		    int x=sc.nextInt();
			e.setcgpa(x);
			System.out.println();
		}
		else if(a==3) {
			e.display();
		}
		else if(a==4) {
			System.out.println("name :"+e.name);
			System.out.println("dpt :"+e.dpt);
			System.out.println("desig :"+e.sep);
			System.out.println("id :"+e.id);
			System.out.println("bs :"+e.cgpa);
		}
		else {
			break;
		}
		}
	}

}
