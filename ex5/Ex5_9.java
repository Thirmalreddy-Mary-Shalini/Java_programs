package ex5;

import java.util.Scanner;

class Cst{
	Scanner sc=new Scanner(System.in);
	String dn;
	String hn;
	int nf;
	int ns;
	int np;
	Cst(String hod){
		hn=hod;
	}
	void details() {
		System.out.println("enter dept name : ");
		String d=sc.next();
		dn=d;
		System.out.println("Enter no of fac : ");
		int f=sc.nextInt();
		nf=f;
		System.out.println("Enter no of stu : ");
		int s=sc.nextInt();
		ns=s;
		System.out.println("Enter no of pro : ");
		int p=sc.nextInt();
		np=p;
	}
	void display() {
		System.out.println("Dept name : "+dn);
		System.out.println("No of fac : "+nf);
		System.out.println("No of stu : "+ns);
		System.out.println("No of fac : "+np);
	}
}
	class Cse extends Cst{
		Cse(String h){
			super(h);
		}
		void details() {
			super.details();
			super.display();
		}
	}
	class Ce extends Cst{
		Ce(String h){
			super(h);
		}
		void details() {
			super.details();
			super.display();
		}
	}
	class Aids extends Cst{
		Aids(String h){
			super(h);
		}
		void details() {
			super.details();
			super.display();
		}
	}

public class Ex5_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
Cst t[]=new Cst[3];
t[0]=new Cse("raj");
t[1]=new Aids("sam");
t[2]=new Ce("ram");
while(true) {
	System.out.println("1.Cse  2.Ce  3.Aids");
int a=sc.nextInt();
Cst selected=null;
if(a==1) {
	String f=sc.next();
for(Cst d:t) {
	if(d.hn.equals(f)) {
		selected=d;
		d.details();
	}
}
}
else if(a==2) {
	String f=sc.next();
	for(Cst d:t) {
		if(d.hn==f) {
			selected=d;
			d.details();
		}
	}
}
else if(a==3) {
	String f=sc.next();
	for(Cst d:t) {
		if(d.hn==f) {
			selected=d;
			d.details();
		}
	}
}

}
	}
	}


