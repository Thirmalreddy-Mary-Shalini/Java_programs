package ex6;
import java.util.Scanner;
interface Academic{
	void calAcademicCredit(int a);
	void registerSub();
	void assignfac();
}
interface Nonacademic{
	void calNonAcademicCredit(int a);
	void registerClub();
	void non_acad_club();
}
abstract class course{
	String name;
	int regno;
	String s1,s2;
	String fac;
	String nonacad;
	course(String n,int r1){
		name=n;
		regno=r1;
	}
	abstract void display(); 
}
class student extends course implements Academic,Nonacademic{
	student(String n,int r1){
		super(n,r1);
	}
	int x;

	
	public void registerClub() {
System.out.println("these are few clubs you can register :");
System.out.println("1.AIML "+" 2.AIDS "+" 3.AI "+" 4.none");
	}
	public void calNonAcademicCredit(int a) {
		System.out.println("You can earn your non academic credits");
		int t=a*2;
		System.out.println("you have earned "+t+" credits");
		
	}
	public void calAcademicCredit(int a) {
		System.out.println("You can earn your  academic credits");
		int t=a*2;
		System.out.println("you have earned "+t+" credits");
	}

	public void registerSub() {
		System.out.println("register your subject");
		System.out.println("DSA "+" OOPs "+" maths");
	}

	public void assignfac() {
		System.out.println("here you can select your faculty");
		System.out.println("A "+" B "+" C "+" D ");
	}
	void display() {
		System.out.println("name :"+name);
		System.out.println("regno :"+regno);
	}
	public void non_acad_club() {
		System.out.println("regiser your club");
		System.out.println("NSS "+" NCC "+" Rotarat");
	}
		
	}
	

public class ex6_3 {

	public static void main(String[] args) {
		student s1=new student("shalini",7070);
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.display "+" 2.faculty "+" 3.subjects "+" 4.academic "+" 5.non acad "+" 6.cal credit ");
			int a=sc.nextInt();
			if(a==1) {
		s1.display();
		System.out.println();
			}
			else if(a==2) {
		s1.assignfac();
		System.out.println();
			}
			else if(a==3) {
		s1.registerSub();
		System.out.println();
			}
			else if(a==4) {
		s1.calAcademicCredit(3);
		System.out.println();
			}
			else if(a==5) {
		s1.non_acad_club();
		System.out.println();
			}
			else if(a==6) {
		s1.calNonAcademicCredit(2);
		}
		else {
			break;
		}
	}
	}
}

