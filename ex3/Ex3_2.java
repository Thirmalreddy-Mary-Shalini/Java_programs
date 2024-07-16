package ex3;

import java.util.Scanner;

public class Ex3_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s="";
		int c1=0;
		for(int i=0;i<s1.length();i++) {
			c1=0;
			char c=s1.charAt(i);
			for(int j=0;j<s2.length();j++) {
				char d=s2.charAt(j);
				if(c==d) {
					c1++;
					continue;
				}
			}
			if(c1==0) {
			s+=c;
		}
		
	}
		
		System.out.println(s);



	}

}
