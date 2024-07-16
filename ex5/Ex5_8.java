package ex5;

import java.util.Scanner;

class Book{
	Scanner sc=new Scanner(System.in); 
	String bt;
	String a;
	int c;
	int av;
	int ed;
	int pub;
	Book(String t){
		bt=t;
	}
	void details(){

System.out.println("Enter author");
String s1=sc.next();
a=s1;
System.out.println("Enter pub");
int p=sc.nextInt();
pub=p;
System.out.println("Enter copies");
int c=sc.nextInt();
c=c;
System.out.println("Enter edition");
int e=sc.nextInt();
ed=e;


	}
	void borrow() {
		if(c>0) {
			System.out.println("Enter no of copies");
		    int f=sc.nextInt();
		    if(c<f) {
		    	System.out.println("Insufficent copies");
		    }
		    else {
		    c-=f;
		}
		}
	}
	void retur() {
		System.out.println("Enter no of copies being returned :");
		 int f=sc.nextInt();
		 c+=f;
	}
}
class Rachu extends Book{
	Rachu(String h){
		super(h);
	}
	void details(){
		super.details();
	}
	void borrow() {
		super.borrow();
	}
	void retur() {
		super.retur();
	}
}
class Jenu extends Book{
	Jenu(String h){
		super(h);

	}
	void details(){
		super.details();
	}
	void borrow() {
		super.borrow();
	}
	void retur() {
		super.retur();
	}
}
class Shalu extends Book{
	Shalu(String h){
		super(h);

	}
	void details(){
		super.details();
	}
	void borrow() {
		super.borrow();
	}
	void retur() {
		super.retur();
	}
}
public class Ex5_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
Book b[]=new Book[3];
b[0]=new Rachu("Wings");
b[1]=new Jenu("of");
b[2]=new Shalu("fire");
while(true) {
	System.out.println("1.wings  2.of  3.fire");
	int g=sc.nextInt();
	Book selected =null;
	if(g==1) {
		System.out.println("Enter book name:");
		String j=sc.next();
		for(Book n:b) {
		if(n.bt.equals(j)) {
			selected=n;
			n.details();
			System.out.println("1.Borrow  2.Return " );
			int l=sc.nextInt();
			
			if(l==1) {
				n.borrow();
			}
			else if(l==2) {
				n.retur();
			}
		}
		}
	}
	else if(g==2) {
		System.out.println("Enter book name:");
		String j=sc.next();
		for(Book n:b) {
		if(n.bt.equals(j)) {
			selected=n;
			n.details();
			System.out.println("1.Borrow  2.Return " );
			int l=sc.nextInt();
		
			if(l==1) {
				n.borrow();
			}
			else if(l==2) {
				n.retur();
			}
		}
		}
	}
		else if(g==3) {
			System.out.println("Enter book name:");
			String j=sc.next();
			for(Book n:b) {
			if(n.bt.equals(j)) {
				selected=n;
				n.details();
				System.out.println("1.Borrow  2.Return " );
				int l=sc.nextInt();
				
				if(l==1) {
					n.borrow();
				}
				else if(l==2) {
					n.retur();
				}
			}
			}
		}
		else {
			break;
		}
	}
}
	}


