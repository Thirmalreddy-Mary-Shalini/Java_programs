package ex7;
class Hello extends Thread{
	int tno;
	Hello(int tno){
		tno=this.tno;
		//start();
	}
	public void run() {
		for(int i=50;i>0;i--) {
			System.out.println("Hello from Thread "+i);
		tno+=1;
			Hello t=new Hello(tno);
		}
	}
}
public class Ex8_1 {

	public static void main(String[] args) {
		
Hello h=new Hello(1);
h.start();
	}

}
