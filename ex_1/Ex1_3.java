package ex_1;

public class Ex1_3 {

	public static void main(String[] args) {
		int c=0;
		for(int i=2;i<=30;i++) {
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					c+=1;
				}
				else {
				continue;	
				}
			}
			if(c==1) {
				System.out.println(i+" is prime number");
			}
			c=0;
		}

	}

}
