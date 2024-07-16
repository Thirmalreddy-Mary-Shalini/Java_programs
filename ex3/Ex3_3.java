package ex3;

import java.util.Scanner;

public class Ex3_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String");
		String s=sc.next();
		System.out.println("Enter 2nd String");
		String s1=sc.next();
		System.out.println("Enter 3rd String");
		String s2=sc.next();
		char ch[]=s.toCharArray();
		char c[]=s1.toCharArray();
		char chh[]=s2.toCharArray();
		System.out.println("Enter element to search");
		char q=sc.next().charAt(0);
		int w=0;
		int r=0;
		int h=0;
		for(int i=0;i<s.length();i++) {
			if (ch[i]==q) {
				w+=1;
			}
		}
		
		for(int i=0;i<s1.length();i++) {
			if (c[i]==q) {
				r+=1;
			}
		}
		
		for(int i=0;i<s2.length();i++) {
			if (chh[i]==q) {
				h+=1;
			}
		}
		
		if((w>r) && (w>h)) {
			System.out.println("1st sequence" );
		}
		else if((r>w)&&(r>h)){
			System.out.println("2nd sequence");
		}
		else {
			System.out.println("3rd sequence");
		}
	}
	

}
