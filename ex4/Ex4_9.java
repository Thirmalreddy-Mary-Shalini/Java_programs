package ex4;

import java.util.Scanner;

class Phone{
	String pn;
	String os;
	int ds;
	int m;
	void display(){
		pn=null;
		os=null;
		ds=0;
		m=0;
}
	String getpn() {
		return pn;
	}
	void setpn(String hn) {
		pn=hn;
	}
	String getos() {
		return os;
	}
	void setos(String n) {
		os=n;
	}
	int getm() {
		return m;
	}
	void setm(int i) {
		m=i;
	}
	int getds() {
		return ds;
	}
	void setds(int j) {
		ds=j;
	}
}
public class Ex4_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Phone e=new Phone();
		while(true) {
			System.out.println("1.add 2.edit 3.delete 4.display");
		int a=sc.nextInt();
		if(a==1) {
			System.out.println("enter product name : ");
			String n=sc.next();
			e.setpn(n);
			System.out.println("enter os name : ");
			String d=sc.next();
			e.setos(d);
			System.out.println("memory : ");
			int c=sc.nextInt();
			e.setm(c);
			System.out.println("enter ds : ");
		    int x=sc.nextInt();
			e.setds(x);
			System.out.println();
	}
		else if(a==2) {
			e.display();
			System.out.println("enter product name : ");
			String n=sc.next();
			e.setpn(n);
			System.out.println("enter os name : ");
			String d=sc.next();
			e.setos(d);
			System.out.println("memory : ");
			int c=sc.nextInt();
			e.setm(c);
			System.out.println("enter ds : ");
		    int x=sc.nextInt();
			e.setds(x);
			
		}
		else if(a==3) {
			e.display();
		}
		else if(a==4) {
			System.out.println(" pro name :"+e.pn);
			System.out.println("os :"+e.os);
			System.out.println("dislay size :"+e.ds);
			System.out.println("memory :"+e.m);

		}
		else {
			break;
		}
		}

	}

}
