package ex_1;

import java.util.Scanner;

public class Ex1_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if((num%7==0)||(num%10==7)) {
	System.out.println("Buzz number");
}
if(num%2==0) {
	System.out.println("Even number");
}
if(num%2!=0) {
	System.out.println("Odd number");
}
if(num>0) {
	System.out.println("Positive");
}
if(num<0) {
	System.out.println("Negative");
}
	}

}
