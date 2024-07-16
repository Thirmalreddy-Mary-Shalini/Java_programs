package ex2;

import java.util.Arrays;
import java.util.Scanner;
public class Ex2_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two words : ");
		String a=sc.next();
		String b=sc.next();
		if(a.length()==b.length()) {
			char ch[]=a.toCharArray();
			char c[]=b.toCharArray();
	        Arrays.sort(ch);
	        Arrays.sort(c);
	        if(Arrays.equals(ch, c)) {
	        	System.out.println("Anagram");
	        }
	        else {
	        	System.out.println("Not anagram");
	        }
		}
	}
}
