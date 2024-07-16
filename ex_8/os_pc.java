package ex_8;

import java.util.Scanner;

class func{
	int rw_mutex;
	int readcount;
	int mutex;
	func(int rw,int rc,int m){
		rw_mutex=rw;
		readcount=rc;
		mutex=m;
	}
	public int wait_w(int rw) {
		while(rw<=0);
		rw_mutex--;
		return rw_mutex;
	}
	public int signal_rw(int rw) {
		rw_mutex++;
		return rw_mutex;
	}
	public int wait_r_mutex(int m) {
		while(m<=0);
		mutex--;
		return mutex;
	}
	public int signal_m(int m) {
		mutex++;
		return mutex;
	}
}
class w_r extends func{
	
	w_r(int rw_mutex,int readcount,int mutex){
		super(rw_mutex,readcount,mutex);
	}
	synchronized public void write() {
		func f=new func(rw_mutex,readcount ,mutex);
	    rw_mutex=f.wait_w(rw_mutex);
		System.out.println("Writer writing");
		System.out.println("rw_mutex after writing : "+rw_mutex);
		System.out.println("mutex after writing : "+mutex);
		rw_mutex=f.signal_rw(rw_mutex);
		System.out.println("rw_mutex after signal : "+rw_mutex);
		System.out.println("mutex after signal : "+mutex);
	}
	synchronized public void read() {
		func f=new func(rw_mutex,readcount ,mutex);
		mutex=f.wait_r_mutex(mutex);
		readcount=readcount++;
		if(readcount==1) {
	    rw_mutex=f.wait_w(rw_mutex);
	    System.out.println("rw_mutex after reading in: "+rw_mutex);
		}
		System.out.println("reader reading");
		System.out.println("rw_mutex after reading : "+rw_mutex);
		System.out.println("mutex after reading : "+mutex);
		mutex=f.signal_m(mutex);
		mutex=f.wait_r_mutex(mutex);
		readcount--;
		if(readcount==0) {
		rw_mutex=f.signal_rw(rw_mutex);
		}
		mutex=f.signal_m(mutex);
		System.out.println("rw_mutex after signal : "+rw_mutex);
		System.out.println("mutex after signal : "+mutex);
	}
}
public class os_pc {
    public static void main(String[] args)  {
    	Scanner sc=new Scanner(System.in);
		int mutex=1,readcount=0,rw_mutex=1;
        w_r	p=new w_r(rw_mutex,readcount, mutex);
        while(true) {
        	System.out.println("1.reader 2.writer 3.exit");
            int a=sc.nextInt();
            if(a==1) {
            	p.read();
            }
            else if(a==2) {
            	p.write();
            }
            else {
            	break;
            }
        }
    }
}
