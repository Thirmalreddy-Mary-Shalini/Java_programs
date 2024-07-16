package ex3;

import java.util.Scanner;

public class Ex3_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a text ");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		System.out.println("Enter word to be searched");
		String s2=sc.next();
		int g=0;
		for(int i=0;i<s1.length;i++) {
			if(s1[i].equals(s2)) {
				g+=1;
			System.out.println(s1[i]+" occured at position"+i);
			}
		}
		System.out.println("The word occured "+g+" times");

	}

}
