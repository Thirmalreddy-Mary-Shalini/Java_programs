package ex_8;
import java.util.Scanner;
class tired{
	int ar[];
	tired(int arr[]){
		ar=arr;
	}
	public int wait(int i) {
		ar[i]=0;
		return ar[i];
	}
	public int wait_(int i) {
		ar[(i+1)%5]=0;
		return ar[(i+1)%5];
	}
	public int signal(int i) {
		ar[i]=1;
		return ar[i];
	}
	public int signal_(int i) {
		ar[(i+1)%5]=1;
		return ar[(i+1)%5];
		}}
class Dp extends tired{
	Dp(int ar[]){
		super(ar);
	}
	public void chopstick(int i){
		int x=wait(i+1);
		int s=(i+2)%5;
		int y=wait(s);
		System.out.println(x+" "+y);
		System.out.println("Philospher "+i+" is eating ");
		int p=signal(i+1);
		int q=signal(s);
		System.out.println(p+" "+q);
	}}
public  class os_dp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int arr[]=new int[6];
arr[0]=1;
arr[1]=1;
arr[2]=1;
arr[3]=1;
arr[4]=1;
Dp d=new Dp(arr);
while(true) {
	System.out.println("1.thinking 2.eating 3.exit");
	int a=sc.nextInt();
	if(a==1) {
		System.out.println("The philospher is thinking");
	}
	else if(a==2) {
		System.out.println("Enter You Are Which Philospher Number");
		int b=sc.nextInt();
		d.chopstick(b);
	}
	else {
		break;
	}}}}