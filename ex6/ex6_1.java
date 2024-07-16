package ex6;
import java.util.Scanner;
interface mathoperable{
	void add();
	void sub();
	void mul();
	void div();
}
interface trignometricoperable{
	void sine(double an);
	void cos(double an);
	void tan(double an);
}
abstract class calculator{
	int num1;
	int num2;
	calculator(int no1,int no2){
	num1=no1;
	num2=no2;
	}
	abstract void display();
}
 class op extends calculator implements mathoperable,trignometricoperable{
	op(int n1,int n2){
		super(n1,n2);
	}
	public void display() {
		System.out.println("your result is :");
	}
public void sine(double an) {
	System.out.println("Your answer for sin : ");
	
System.out.println(Math.sin(an));	
}
public void cos(double an) {
	System.out.println("Your answer for cos : ");
	System.out.println(Math.cos(an));
}
public void tan(double an) {
	System.out.println("Your answer for tan : ");
	System.out.println(Math.tan(an));
}
public void add() {
	int s=num1+num2;
System.out.println("sum:"+s);	
}
public void sub() {
	int d=num1-num2;
System.out.println("difference:"+d);
	
}
public void mul() {
	int p=num1*num2;
System.out.println("product:"+p);
	
}
public void div() {
	int div=num1/num2;
System.out.println("division:"+div);
	
}
 }
public class ex6_1{
public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
op e=new op(23,12);
e.add();
e.sub();
e.mul();
e.div();
System.out.println("enter your angle in radians");
double a=sc.nextDouble();
e.sine(a);
e.cos(a);
e.tan(a);
}
}



