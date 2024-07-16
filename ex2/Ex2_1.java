package ex2;

import java.util.Scanner;
public class Ex2_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];
		for(int i=0;i<5;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter number to search");
		int a=sc.nextInt();
		int c=0;
		for(int i=0;i<5;i++) {
			if(ar[i]==a) {
				c++;
			}
		}
		System.out.println("Element is present "+c+" times");
	}
}
