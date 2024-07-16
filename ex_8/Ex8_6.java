package ex_8;

import java.util.Scanner;

class bank2{
	Scanner sc=new Scanner(System.in);
	int aacno;
	int bal;
	int wamt;
	int damt;
	void deposit() {
		System.out.println("Enter amt to deposit : ");
		int a=sc.nextInt();
		bal+=a;
	}
	void withdraw() {
		System.out.println("Enter amt to withdraw : ");
		int a=sc.nextInt();
		bal-=a;
	}
	void display() {
		System.out.println("balance : "+bal);
	}
}
public class Ex8_6 {

	public static void main(String[] args)throws Exception {
		bank2 b=new bank2();
		class deposit extends Thread{
			deposit(){
				start();
			}
			synchronized public void run() {
			b.deposit();	
			b.display();
			}
			}
		class Withdraw extends Thread{
			Withdraw(){
				start();
			}
			synchronized public void run() {
			b.withdraw();
			b.display();
			}
			}
		deposit d=new deposit();
		d.join();
		Withdraw w=new Withdraw();
		w.join();
	}

}
