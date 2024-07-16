package ex3;

import java.util.Scanner;

public class Ex3_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c[]=new char[s.length()];
		c=s.toCharArray();
		String f=" ";
		for(int i=0;i<s.length()-1;i++) {
			char w=c[i];
			char e=c[i+1];
			if((w==' ')&&(e==' ')){
				continue;
			}
			else {
				f+=c[i];
			}
		}
System.out.println(f);
	}

}
