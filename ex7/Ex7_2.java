package ex7;

import java.util.Scanner;
class length extends Exception{
	length(){
		System.out.println("Length of name is greater than 7");
	}
}
class avg extends Exception{
	avg(){
		System.out.println("Failed exception");
	}
}
class NotFirstClass extends Exception{
	NotFirstClass(){
		System.out.println("NotFirstClassException");
	}
}
class FirstClass extends Exception{
	FirstClass(){
		System.out.println("FirstClassException");
	}
}
public class Ex7_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter your name : ");
String s=sc.next();
System.out.println("Enter 1st mark");
int d=sc.nextInt();
System.out.println("Enter 2nd mark");
int r=sc.nextInt();
System.out.println("Enter 3rd mark");
int f=sc.nextInt();
int avg=(d+r+f)/3;
if(avg<50) {
	try {
		throw new avg();
	}
	catch(Exception e) {
		
	}
}
else if(avg>75) {
	try {
		throw new FirstClass();
	}
	catch(Exception e) {
		
	}
}
else if((avg>50)&&(avg<75)) {
	try {
		throw new NotFirstClass();
	}
	catch(Exception e) {
		
	}
}
if(s.length()>7) {
	try {
		throw new length();
	}
	catch(Exception e) {
		
	}
}
	}
}
