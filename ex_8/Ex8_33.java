package ex_8;

import java.util.Scanner;
class Add extends Thread{
	int l[][];
	int m[][];
	int r[][]=new int[2][2];
	Add(int a[][],int b[][]){
		l=a;
		m=b;
		start();
	}
	public void run() {
		 for(int i=0;i<2;i++) {
		    	for(int j=0;j<2;j++) {
		    		r[i][j]=l[i][j]+m[i][j];
		    	}
		    }
		 System.out.println();
		 for(int i=0;i<2;i++) {
		    	for(int j=0;j<2;j++) {
		    		System.out.print(	r[i][j]);
		    	}
		    	System.out.println();
		    }
		 System.out.println();
	}
	
}
class sub extends Thread{
	int l[][];
	int m[][];
	int r[][]=new int[2][2];
	sub(int a[][],int b[][]){
		l=a;
		m=b;
		start();
	}
	public void run() {
		 for(int i=0;i<2;i++) {
		    	for(int j=0;j<2;j++) {
		    		r[i][j]=l[i][j]-m[i][j];
		    	}
		    }
		 System.out.println();
		 for(int i=0;i<2;i++) {
		    	for(int j=0;j<2;j++) {
		    		System.out.print(r[i][j]);
		    	}
		    	System.out.println();
		    }
		 System.out.println();
}
}
class Mul extends Thread{
	int l[][];
	int m[][];
	int r[][]=new int[2][2];
	Mul(int a[][],int b[][]){
		l=a;
		m=b;
		start();
	}
	public void run() {
		
		 for(int i=0;i<2;i++) {
		    	for(int j=0;j<2;j++) {
		    		for(int k=0;k<2;k++) {
		    			r[i][j]+=l[i][k]*m[k][j];
		    	}
		    	}
		    	System.out.println();
		    }
		 System.out.println();
		 for(int i=0;i<2;i++) {
		    	for(int j=0;j<2;j++) {
		    		System.out.print(r[i][j]);
		    	}
		    	System.out.println();
		    }
		 System.out.println();
}
}
public class Ex8_33 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[2][2];
    int b[][]=new int[2][2];
    System.out.println("Enter 1st matrix :");
    for(int i=0;i<2;i++) {
    	for(int j=0;j<2;j++) {
    		a[i][j]=sc.nextInt();
    	}
    }
    System.out.println();
    System.out.println("Enter 2nd matrix :");
    for(int i=0;i<2;i++) {
    	for(int j=0;j<2;j++) {
    		b[i][j]=sc.nextInt();
    	}
    }
    System.out.println();
    Add v=new Add(a,b);
    sub s=new sub(a,b);
    Mul m=new Mul(a,b);
    
	}

}
