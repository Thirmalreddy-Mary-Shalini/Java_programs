package ex7;

import java.util.Scanner;

class vowels extends Exception{
	vowels(){
		System.out.println("No vowels exception");
	}
}
public class Ex7_1 {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String a=sc.next();
int c=0;
for(int i=0;i<a.length();i++) {
	if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
		c+=1;
	}
	else {
		continue;
	}
}
try {
if(c==0) {
	throw new vowels();
}
	}
	catch(Exception e) {
		System.out.println();
	}

}
}
