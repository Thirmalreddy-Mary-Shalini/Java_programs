package ex7;

import java.util.Scanner;

class NameNotValid extends Exception{
	NameNotValid(){
		System.out.println("not valid name");
	}
}
class  AgeNotWithinRange extends Exception{
	 AgeNotWithinRange(){
		 System.out.println("age out of range");
	 }
}
public class Ex7_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int age=sc.nextInt();
		char ch[]=new char[s.length()];
		for(int i=0;i<s.length();i++) {
		ch[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++) {
		if(!Character.isLetter(ch[i])) {
	try {
		throw new NameNotValid();
	}
	catch(Exception e) {
		
	}
	break;

		}
		}
		if(age<15 || age>21) {
			try {
				throw new age();
			}
			catch(Exception e) {
				
			}
		}
	}

}
