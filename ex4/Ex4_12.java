package ex4;

import java.util.Scanner;

class Fuel{
	Scanner sc=new Scanner(System.in);
	private int fn;
	private String dest;
	private float dist;
	private float fuel;
	
	private void calfuel() {
		if(dist<=1000) {
			//System.out.println("500");
			fuel=500;
		}
		else if((dist>1000)&&(dist<=2000)) {
			//System.out.println("1100");
			fuel=1100;
		}
		else {
			//System.out.println("2200");
			fuel=2200;
		}
	}
	public void feedinfo() {
	
		System.out.println("Enter flight no :");
		int a=sc.nextInt();
		fn=a;
		System.out.println("Enter distance :");
		int b=sc.nextInt();
		dist=b;
		System.out.println("Enter destination :");
		String h=sc.next();
		dest=h;
		calfuel();
		
	}
	public void showinfo() {
		System.out.println("flight no : "+fn);
        System.out.println("Destination : "+dest);
        System.out.println("distance : "+dist);
        System.out.println("fuel : "+fuel);
	}
}
public class Ex4_12 {

	public static void main(String[] args) {
		Fuel f=new Fuel();
		f.feedinfo();
		f.showinfo();
		
	}

}
