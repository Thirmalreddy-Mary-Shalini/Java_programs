package ex_1;

import java.util.Scanner;

public class Ex1_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit ");
		int sum=0;
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("sum is "+sum);

	}

}
