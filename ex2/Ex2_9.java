package ex2;

import java.util.Scanner;
public class Ex2_9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s=sc.next();
	char a[]=new char[s.length()];
		for(int i=0;i<a.length;i++) {
			a[i]=s.charAt(i);
		}
		System.out.println("Duplicate characters : ");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		int v=0;
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
				v+=1;
			}
			else {
				c+=1;
			}
		}
		System.out.println("vowels "+v);
		System.out.println("consonants "+c);
	}
}
