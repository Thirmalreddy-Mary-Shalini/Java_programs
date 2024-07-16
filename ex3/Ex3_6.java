package ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3_6 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s[]=new String[5];
	for(int i=0;i<5;i++) {
	System.out.println("Enter customer name");
		s[i]=sc.next();
	}
	Arrays.sort(s);
	for(int i=0;i<5;i++) {
			System.out.println(s[i]);
		}
	System.out.println(Arrays.toString(s));
	}

}
