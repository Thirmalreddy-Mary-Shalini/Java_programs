package ex2;

import java.util.Scanner;

public class Ex2_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]= {{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,4,3,2}};
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<4;j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println("Transpose : ");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}
