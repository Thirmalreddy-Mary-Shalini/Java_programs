package ex4;

import java.util.Scanner;

class University{
	String hodname;
	int ns;
	String dptn;
	String sep;
	int nf;
	int np;
	void display(){
		hodname=null;
		ns=0;
		nf=0;
		np=0;
		dptn=null;
		sep=null;
	}
	String gethodname() {
		return hodname;
	}
	void sethodname(String hn) {
		hodname=hn;
	}
	String getdptn() {
		return dptn;
	}
	void setdptn(String n) {
		dptn=n;
	}
	int getns() {
		return ns;
	}
	void setns(int i) {
		ns=i;
	}
	int getnf() {
		return nf;
	}
	void setnf(int j) {
		nf=j;
	}
	int getnp() {
		return np;
	}
	void setnp(int k) {
		np=k;
	}
}
public class Ex4_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		University e=new University();
		while(true) {
			System.out.println("1.add 2.edit 3.delete 4.display");
		int a=sc.nextInt();
		if(a==1) {
			System.out.println("enter hod name : ");
			String n=sc.next();
			e.sethodname(n);
			System.out.println("enter department name : ");
			String d=sc.next();
			e.setdptn(d);
			System.out.println("enter no of students : ");
			int c=sc.nextInt();
			e.setns(c);
			System.out.println("enter no of fac : ");
		    int x=sc.nextInt();
			e.setnf(x);
			System.out.println("enter no of programs : ");
		    int y=sc.nextInt();
			e.setnp(y);
			System.out.println();
	}
		else if(a==2) {
			e.display();
			System.out.println("enter hod name : ");
			String n=sc.next();
			e.sethodname(n);
			System.out.println("enter department name : ");
			String d=sc.next();
			e.setdptn(d);
			System.out.println("enter no of students : ");
			int c=sc.nextInt();
			e.setns(c);
			System.out.println("enter no of fac : ");
		    int x=sc.nextInt();
			e.setnf(x);
			System.out.println("enter no of programs : ");
		    int y=sc.nextInt();
			e.setnp(y);
			System.out.println();
		}
		else if(a==3) {
			e.display();
		}
		else if(a==4) {
			System.out.println(" hod name :"+e.hodname);
			System.out.println("dpt name :"+e.dptn);
			System.out.println("no of stu :"+e.ns);
			System.out.println("no of fac :"+e.nf);
			System.out.println("no of pro :"+e.np);
		}
		else {
			break;
		}
		}
	}
}
