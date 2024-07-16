package ex5;

import java.util.Scanner;

class  Cashtree{
	Scanner sc=new Scanner(System.in);
	String name;
	int codeno;
	String loc;
	int wamt;
	int damt;
	int bal;
	void Viewbal() {
	System.out.println("Balance : "+bal);	
	}
	void withdraw() {
		System.out.println("Enter amt to withdraw");
		int x=sc.nextInt();
		wamt=x;
	}
	void deposit() {
		System.out.println("Enter amt to deposit");
		int damt=sc.nextInt();
		bal+=damt;
	}
}
class SBI extends Cashtree{
	int minbal;
	void Viewbal() {
		super.Viewbal();
	}
	void withdraw() {
		super.withdraw();
		if(bal<500) {
			System.out.println("Cant withdaw");
		}
		else {
			bal-=wamt;
		}
		
	}
	void deposit() {
		super.deposit();
	}
}
class HDFC extends Cashtree{
	void Viewbal() {
		super.Viewbal();
	}
	void withdraw() {
		super.withdraw();
		if(bal<1000) {
			System.out.println("Cant withdaw");
		}
		else {
			bal-=wamt;
		}
		
	}
	void deposit() {
		super.deposit();
	}
}
public class Ex5_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Cashtree c=new Cashtree();
		 SBI s=new SBI();
		 HDFC h=new HDFC();
		 while (true) {
				System.out.println("1.SBI  2.HDFC");
				int g=sc.nextInt();
				if(g==1) {
					c=s;
					c.deposit();
					c.Viewbal();
					c.withdraw();
					c.Viewbal();
				}
				else if(g==2) {
					c=h;
					c.deposit();
					c.Viewbal();
					c.withdraw();
					c.Viewbal();
				}
				else {
					break;
				}

	}
		 }
}
