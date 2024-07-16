package ex_1;

import java.util.Scanner;

public class Ex1_7 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your marks");
	int ch=sc.nextInt();
	int phy=sc.nextInt();
	int math=sc.nextInt();
	int bio=sc.nextInt();
	int comp=sc.nextInt();
int avg=(ch+phy+math+bio+comp)/5;

if(avg>=90) {
	System.out.println("A");
}
else if(avg>=80) {
	System.out.println("B");
}
else if(avg>=70) {
	System.out.println("C");
}
else if(avg>=60) {
	System.out.println("D");
}
else if(avg>=40) {
	System.out.println("E");
}
else if(avg<40) {
	System.out.println("F");
}
else {
	System.out.println("Invalid");
}
	}

}
