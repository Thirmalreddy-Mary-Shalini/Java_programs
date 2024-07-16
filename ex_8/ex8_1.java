package ex_8;

class thread extends Thread{
	int tno;
	thread(int tno){
		this.tno=tno;
	}
	public void run() {
	 
		for(int i=50;i>=1;i--) {
			System.out.println("Hello from Thread "+i);
			tno++;
			thread t=new thread(tno);
		}
	}
}
public class ex8_1 {

	public static void main(String[] args) {
	thread t1=new thread(1);
	t1.start();
	}

}
