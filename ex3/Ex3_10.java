package ex3;

import java.util.Scanner;

public class Ex3_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a text ");
		String s=sc.nextLine();
		char c[]=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			c[i]=s.charAt(i);
		}
		String w=" ";
		for(int i=0;i<s.length()-1;i++) {
			if((c[i]=='a'|| c[i]=='e' ||c[i]=='i' ||c[i]=='o' ||c[i]=='u')) {
				continue;
			}
			else {
				w+=c[i];
			}

	}
		System.out.println(w);

}
	}

