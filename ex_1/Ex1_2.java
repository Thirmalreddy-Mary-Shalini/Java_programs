package ex_1;

import java.util.Scanner;

public class Ex1_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number :");
		int num2=sc.nextInt();
		System.out.println("Enter 3rd number :");
		int num3=sc.nextInt();
		
		int x=num1>num2?num1:num2;
		int y=x>num3?x:num3;
	System.out.println(y);
	}

}
