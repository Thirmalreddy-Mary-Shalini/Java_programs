package ex_1;

import java.util.Scanner;

public class Ex1_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bs=sc.nextInt();
		double gs;
		if(bs<=10000) {
			gs=(bs+0.2+0.8);
			System.out.println(gs);
		}
		else if(bs<=20000) {
			gs=bs+0.25+0.9;
			System.out.println(gs);
		}
		else if(bs>20000) {
			gs=bs+0.3+0.95;
		}
		else {
			System.out.println("Invalid");
		}
	}

}
