package ex6;

import java.util.Scanner;

class Dept1{
	String deptn;
	String hod;
	int fac;
	int stu;
	int pro;
	void display1() {
		deptn=null;
		hod=null;
		fac=0;
		stu=0;
		pro=0;
	}
	void setdeptn(String a) {
		deptn=a;
	}
String getdeptn() {
		return deptn;
	}
void sethod(String b) {
	hod=b;
}
String gethod() {
	return hod;
}
void setfac(int c) {
	fac=c;
}
int getfac() {
	return fac;
}
void setstu(int d) {
	stu=d;
}
int getstu() {
	return stu;
}
void setpro(int e) {
	pro=e;
}
int getpro() {
	return pro;
}
}
public class ex4_6 {
	public static void main(String arg[]) {
		Dept1 d=new Dept1();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.add "+" 2.edit "+" 3.delete "+" 4.display");
		    int a=sc.nextInt();
		    if(a==1) {
		    	System.out.println("enter your dept name");
		    	String n=sc.next();
		    	d.setdeptn(n);
		    	System.out.println("enter your hod name");
		    	String d1=sc.next();
		    	d.sethod(d1);
		    	System.out.println("enter no of fac");
		    	int se=sc.nextInt();
		    	d.setfac(se);
		    	System.out.println("enter no of students");
		    	int m=sc.nextInt();
		    	d.setstu(m);
		    	
		    	System.out.println("enter no of programs");
		    	int r=sc.nextInt();
		    	d.setpro(r);
		    	
		    }
		    else if(a==2) {
		    	d.display1();
		    	System.out.println("enter your dept name");
		    	String n=sc.next();
		    	d.setdeptn(n);
		    	System.out.println("enter your hod name");
		    	String d1=sc.next();
		    	d.sethod(d1);
		    	System.out.println("enter no of fac");
		    	int se=sc.nextInt();
		    	d.setfac(se);
		    	System.out.println("enter no of students");
		    	int m=sc.nextInt();
		    	d.setstu(m);
		    	
		    	System.out.println("enter no of programs");
		    	int r=sc.nextInt();
		    	d.setpro(r);
		    }
		    else  if(a==3) {
		    	d.display1();
		    	{
		    		System.out.println("dept name :"+d.deptn);
		    		System.out.println("hod : "+d.hod);
		    		System.out.println("faculty : "+d.fac);
		    		System.out.println("students : "+d.stu);
		    		System.out.println("programs : "+d.pro);
		    }
		    }
		    else if(a==4) {
		    	System.out.println(d.getdeptn());
		    	System.out.println(d.gethod());
		    	System.out.println(d.getfac());
		    	System.out.println(d.getstu());
		    	System.out.println(d.getpro());
		    }
		    else {
		    	break;
		    }
		}
	}
}
