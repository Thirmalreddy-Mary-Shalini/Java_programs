package ex2;

import java.util.Scanner;
public class Ex2_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		int b[]=new int[4];
		for(int i=0;i<4;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println();
		for(int i=0;i<4;i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
