package ex2;

import java.util.Scanner;
public class Ex2_10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		int d=0;
		int b=0;
		for(int i=0;i<a.length;i++) {
			int c=0;
			for(int j=i;j<a.length;j++) {
				if(a[i]==a[j]) {
					c+=1;
				}
			}
			//System.out.println(a[i]+" occured "+c+" times");
			if(c>b) {
				b=c;
				d=a[i];
			}
		}
		System.out.println(d+" occured "+b+" times");
	}
}
