package ex2;

import java.util.Scanner;

public class Ex2_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch[]=s.toCharArray();
		int c=0;
		for(int i=0;i<s.length();i++) {
			c=0;
			for(int j=0;j<s.length();j++) {
			if(ch[i]==ch[j]) {
				c+=1;
			}
			for(int k=i-1;k>0;k--) {
				if(ch[i]==ch[k]) {
					c+=1;
				}
			}
			if(c==0) {
				System.out.println(ch[i]);
				break;
			}
			}
		}
	}
}
