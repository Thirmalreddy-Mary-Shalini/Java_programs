package ex_8;
import java.util.Scanner;
class fun{
	int empty;
	int full;
	int mutex;
	fun(int m,int fu,int e){
		empty=e;
		full=fu;
		mutex=m;
	}
	public int wait_p_e(int e) {
		while(e<=0);
		empty--;
		return empty;
	}
	public int wait_mutex(int m) {
		while(m<=0);
		mutex--;
		return mutex;
	}
	public int wait_c_f(int fu) {
		while(fu<=0);
		full--;
		return full;
	}
	public int signal_p(int fu) {
		full++;
return full;	
	}
	public int signal_p_m(int m) {
		mutex++;
		return mutex;
	}
	public int signal_c(int e) {
		empty++;
		return empty;
	}
	public int signal_c_m(int m) {
		mutex++;
		return mutex;
	}
}
class p_c extends fun{
	
	p_c(int mutex,int full,int empty){
		super(mutex,full,empty);
	}
	synchronized public void produce() {
		fun f=new fun(mutex, full,empty);
	    empty=f.wait_p_e(empty);
		mutex=f.wait_mutex(mutex);
		System.out.println("Producer produced");
		System.out.println("empty after produce : "+empty);
		System.out.println("mutex after produce : "+mutex);
		full=f.signal_p(full);
		mutex=f.signal_p_m(mutex);
		System.out.println("empty after signal : "+empty);
		System.out.println("full after signal : "+full);
		System.out.println("mutex after signal : "+mutex);
	}
	synchronized public void consume() {
		fun f=new fun(mutex, full,empty);
	    full=f.wait_c_f(full);
		mutex=f.wait_mutex(mutex);
		System.out.println(" ");
		System.out.println("consumer consumed");
		System.out.println("full after consumed : "+full);
		System.out.println("mutex after consumed : "+mutex);
		empty=f.signal_c(empty);
		mutex=f.signal_c_m(mutex);
		System.out.println("empty after signal : "+empty);
		System.out.println("full after signal : "+full);
		System.out.println("mutex after signal : "+mutex);
	}
}
public class os_rw {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mutex=1,full=0,empty=4;
        p_c	p=new p_c(mutex, full, empty);
        while(true) {
        	System.out.println("1.producer 2.consumer 3.exit");
            int a=sc.nextInt();
            if(a==1) {
            	p.produce();
            }
            else if(a==2) {
            	p.consume();
            }
            else {
            	break;
            }
        }
	}
}
