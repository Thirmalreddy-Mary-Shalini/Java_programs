package ex2;


import java.util.Scanner;
public class Ex2_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[3];
		for(int i=0;i<3;i++) {
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			for(int j=i+1;j<3;j++) {
				if(ar[j]<ar[i]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}}}
		for(int i=0;i<3;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			for(int j=i+1;j<3;j++) {
				if(ar[j]>ar[i]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}}}
		for(int i=0;i<3;i++) {
			System.out.print(ar[i]+" ");
		}}}
