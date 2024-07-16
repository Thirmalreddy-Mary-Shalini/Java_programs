package ex5;

import java.util.Scanner;

class Train{
	Scanner sc=new Scanner(System.in);
	String tn;
	int tno;
	String s;
	String d;
	int tickets;
	int tt;
	int cost;
	Train(String trn,int trno,String sr,String dst,int tot){
		tn=trn;
		tno=trno;
		s=sr;
		d=dst;
		tt=tot;
	}
	void display() {
		System.out.println("Train name : "+tn);
		System.out.println("Train no : "+tno);
		System.out.println("Source : "+s);
		System.out.println("Destination : "+d);
		System.out.println("Total no of tickets : "+tt);
	}
	void seatavailable() {
		System.out.println("Enter no.of seats required");
		int y=sc.nextInt();
		if(tt<y) {
			System.out.println("Sorry Required No of seats are not available");
		}
		else {
			System.out.println("Seats are available");;
		}
		
	}
	void bookticket() {
		System.out.println("Enter no.of seats required");
		int y=sc.nextInt();
		if(tt<y) {
			System.out.println("There are no sufficient tickets ");
		}
		else {
			tt-=y;
			System.out.println("Tickets are booked");
		}
	}
}
class chennaiexp extends Train{
	chennaiexp(String trn,int trno,String sr,String dst,int tot){
		super(trn, trno,sr,dst, tot);
	}
void seatavailable() {
		super.seatavailable();
	}
	void bookticket() {
		super.bookticket();
	}
}
class coimbexp extends Train{
	coimbexp(String trn,int trno,String sr,String dst,int tot){
		super(trn, trno,sr,dst, tot);
	}
void seatavailable() {
		super.seatavailable();
	}
	void bookticket() {
		super.bookticket();
	}
}

public class Ex5_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Train t1[]=new Train[3];
	t1[0]=new coimbexp("Coimbexp",7070,"hyd","coimb",80);
	t1[1]=new chennaiexp("keralaexp",7102,"kerala","delhi",120);
	t1[2]=new coimbexp("mumbiabexp",710,"mumbai","goa",240);
	while (true) {
		System.out.println("1.display  2.seat available  3.book ticktes  4.exit");
		int a=sc.nextInt();
		if(a==4) {
			break;
		}
		Train st=null;
		System.out.println("Enter train number");
		int v=sc.nextInt();
		for(Train r:t1) {
			if(r.tno==v) {
				st=r;
				if(a==1) {
					st.display();
				}
				else if(a==2) {
					st.seatavailable();
				}
				else if(a==3) {
					st.bookticket();
				}
			}
		}
	}
	
	}

}
