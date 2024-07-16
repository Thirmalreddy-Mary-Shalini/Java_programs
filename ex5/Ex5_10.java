package ex5;

import java.util.Scanner;

class Worker{
	Scanner sc=new Scanner(System.in);
	String name;
	int sr;
	void details() {
		System.out.println("Enter your name : ");
		String s=sc.next();
		name=s;
		System.out.println("Enter salaried rate : ");
		int r=sc.nextInt();
		sr=r;
	}
	void Compay(){
		System.out.println("Week pay : ");
	}
}
class dailyworker extends Worker{
	void details() {
		super.details();
	}
	void Compay(){
		System.out.println("Enter number of hours");
        int z=sc.nextInt();
		int p=sr*z;
		System.out.println(p);
	}
}
class Salriedworker extends Worker{
	void details() {
		super.details();
	}
	void Compay(){
		int p=sr*40;
		System.out.println(p);
	}
}
public class Ex5_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Worker w=new Worker();
	dailyworker d=new dailyworker();
	Salriedworker s=new Salriedworker();
	while(true) {
		System.out.println("1.dailyworker  2.Salriedworker");
	int x=sc.nextInt();
	if(x==1) {
		w=d;
		w.details();
        w.Compay();
	}
	else if(x==2) {
		w=s;
		w.details();
        w.Compay();
	}
	else {
		break;
	}
	}

	}

}
