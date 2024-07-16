package ex3;

import java.util.Scanner;

public class Ex3_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a text ");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int sp=0;
		int w=0;
		for(int i=0;i<s.length();i++) {
			if(ch[i]==' ') {
				sp+=1;
		}
		}
		System.out.println("No of spaces : "+sp);
		String s1[]=s.split(" ");
		System.out.println("No of words : "+(s1.length));
		System.out.println("No of characters : "+(s.length()-sp));
		
	}

}
