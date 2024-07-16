package ex2;
//import java.util.Scanner;
//public class Ex2_7 {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int a[]=new int[100];
//		for(int i=0;i<100;i++) {
//			a[i]=i+1;
//		}
//		for(int i=1;i<100;i++) {
//			for(int j=i+1;j<100;j++) {
//				if(a[i]==0) {
//					continue;
//				}
//				if(a[j]%a[i]==0) {
//					a[j]=0;
//				}
//			}
//		}
//		for(int i=0;i<100;i++) {
//			System.out.println(a[i]);
//		}
//	}
//}

import java.util.*;
public class Ex2_7{
	public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	int ar[]=new int[5];
	System.out.println("enter elements");
	for(int i=0;i<5;i++) {
		ar[i]=sc.nextInt();
	}
	int max=0;
	for(int i=0;i<5;i++) {
		if(ar[i]>max) {
			max=ar[i];
		}
	}
	System.out.println(max);
	}
}




















