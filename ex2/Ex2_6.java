package ex2;

import java.util.Scanner;

public class Ex2_6 {

	public static void main(String[] args) {
		int a[]=new int[4];
		Scanner sc=new Scanner(System.in);
for(int i=0;i<4;i++) {
	a[i]=sc.nextInt();
}
System.out.println("Enter element");
int b=sc.nextInt();
for(int i=0;i<4;i++) {
	if(a[i]==b) {
		System.out.println(a[i]+" is at position "+i);
	}
}
	}

}
