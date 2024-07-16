package ex_8;

import java.util.Scanner;

class Airport extends Thread{
	boolean status;
	Airport(boolean s){
		status=s;
	}
		public void takeoff() {
			if(status==true) {
				System.out.println("you can takeoff");
				status=false;
			}
			else {
				System.out.println("Cant take off");
			}
		}
		public void Land() {
			if(status==false) {
				System.out.println("you can Land");
				status=true;
			}
			else {
				System.out.println("Cant land");
			}
		}
	}
public class Ex8_5 {

	public static void main(String[] args) throws Exception {
	
Airport a=new Airport(true);

class Land extends Airport{
	Land(boolean s){
		super(s);
		start();
	}
	public void run() {
		a.Land();
	}
}
	class Takeoff extends Airport{
		Takeoff(boolean s){
		super(s);
		start();
		}
		public void run() {
			a.Land();
		}
	}
	Takeoff t=new Takeoff(true);
	Land l=new Land(false);
	Scanner sc =new Scanner(System.in);
	while(true) {
		System.out.println("1.Land  2.Takeoff 3.exit");
		int d=sc.nextInt();
		if(d==1) {
			l.Land();
			l.join();
		}
		else if(d==2) {
			t.takeoff();
			t.join();
		}
		else {
			break;
		}
	}

	}

}
