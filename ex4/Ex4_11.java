package ex4;

import java.util.Scanner;

class bank1{
	int bal;
	int accno;
	int damt;
	int wamt;
	int pin;
	bank1(){
		bal=0;
		accno=0;
		damt=0;
		wamt=0;
		pin=0;
	}
	int getaccono() {
		return accno;
	}
	void setaccno(int a) {
		accno=a;
	}
	int getbal() {
		return bal;
	}
	void setbal(int b) {
		bal=b;
	}
	int getpin() {
		return pin;
	}
	void setpin(int p) {
		pin=p;
	}
	void acct( ) {
		System.out.println("Welcome ");
		System.out.println("accno: "+accno);
		System.out.println("balance : "+bal);
		System.out.println("Pin : "+pin);
	}
	void balance() {
		System.out.println("Your balance is"+bal);
	}
	int getdamt() {
		return damt;
	}
	void setdamt(int c) {
		damt=c;
	}
	void deposit() {
		bal+=damt;
		System.out.println("amt deposited");
	}
	int getwamt() {
		return wamt;
	}
	void setwamt(int d) {
		wamt=d;
	}
	void withdraw() {
		if(bal<=500 || wamt%100!=0) {
			System.out.println("Cant withdraw");
		}
		else {
		bal-=wamt;
		System.out.println("amt withdrawed");
	}
	}
	void pin() {
		System.out.println("Enter your new pin");
	}
	void display() {
		System.out.println("Welcome ");
		System.out.println("accno: "+accno);
		System.out.println("balance : "+bal);
		System.out.println("Pin : "+pin);
	}
}
public class Ex4_11 {

	public static void main(String[] args) {
		bank1 b=new bank1();
		Scanner sc=new Scanner(System.in);
		while (true){
			System.out.println("1.acc creation  2.balance  3.deposit  4.withdraw  5.pin change  6.display");
		    int a=sc.nextInt();
		    if(a==1) {
		    	System.out.println("enter your acc no");
		    	int l=sc.nextInt();
		    	System.out.println("enter your balance");
		    	int m=sc.nextInt();
		    	System.out.println("enter your pin");
		    	int n=sc.nextInt();
		    	b.setaccno(l);
		    	b.setbal(m);
		    	b.setpin(n);
		    	b.acct();
		    }
		    else if(a==2) {
		    	b.balance();
		    }
		    else if(a==3) {
		    	System.out.println("Enter amt to deposit: ");
		    	int y=sc.nextInt();
		    	b.setdamt(y);
		    	b.deposit();
		    }
		    else if(a==4) {
		    	System.out.println("Enter amt to withdraw: ");
		    	int y=sc.nextInt();
		    	b.setwamt(y);
		    	b.withdraw();
		    }
		    else if(a==5) {
		    	b.pin();
		    	int f=sc.nextInt();
		    	b.setpin(f);
		    }
		    else if(a==6) {
		    	b.display();
		    }
		    else {
		    	break;
		    }
		}
		

	}

}
