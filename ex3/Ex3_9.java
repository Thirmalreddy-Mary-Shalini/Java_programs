package ex3;

import java.util.Scanner;

public class Ex3_9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a text ");
		String s=sc.nextLine();
		char c[]=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			c[i]=s.charAt(i);
		}
		String d="";
		for(int i=0;i<s.length()-1;i++) {
			char f=c[i+1];
			if((c[i]=='a'|| c[i]=='e' ||c[i]=='i' ||c[i]=='o' ||c[i]=='u')&&(f=='a'||f=='e'||f=='i'||f=='o'||f=='u') ){
				d+=c[i];
				d+=f+" ";
						}
		}
		System.out.println(d);
	}
}
