package ex4;
class Tollbooth{
	int cars;
	double amt;
	Tollbooth(){
		cars=0;
		amt=0;
	}
	void paycar(int c) {
		cars+=c;
		amt=amt+(c*50);
	}
	void nopaycar(int c) {
		cars+=c;
	}
	void display() {
		System.out.println("Total cars :" +cars);
		System.out.println("Total amt : "+amt);
	}
}
public class Ex4_2 {

	public static void main(String[] args) {
		Tollbooth t=new Tollbooth();
		t.paycar(6);
		t.nopaycar(4);
		t.display();

	}

}
