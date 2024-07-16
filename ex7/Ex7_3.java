package ex7;

import java.util.Scanner;

class namenum extends Exception{
	namenum(){
		System.out.println("Name exception");
	}
}
class age extends Exception{
	age(){
		System.out.println("age exception");
	}
}
public class Ex7_3 {

	public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name : ");
	String s=sc.next();
	System.out.println("Enter age");
	int d=sc.nextInt();
	if(d>50) {
		try {
			throw new age();
		}
		catch(Exception e) {
			
		}
	}
	else {
		age a=new age();
	}
	char ch[]=new char[s.length()];
	for(int i=0;i<s.length();i++) {
	ch[i]=s.charAt(i);
	}
	for(int i=0;i<s.length();i++) {
	if(!Character.isLetter(ch[i])) {
try {
	throw new namenum();
}
catch(Exception e) {
	
}
break;

	}
	}

	}

}
