package ex_1;

import java.util.Scanner;

public class Ex1_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (true){
			System.out.println("1.Basics 2.kids 3.Sports 4.English");
			int a=sc.nextInt();
			if(a==1) {
				System.out.println("499");
				break;
			}
			else if(a==2){
				System.out.println("699");
				break;
			}
			else if(a==3){
				System.out.println("1199");
				break;
			}
			else if(a==4){
				System.out.println("799");
				break;
			}
			else {
				System.out.println("Invalid");
				break;
			}
		}
	}
}
