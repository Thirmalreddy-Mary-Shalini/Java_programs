package ex_8;
import java.util.Scanner;
import java.util.Arrays;
class test_bankers{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of processes : ");
int p=sc.nextInt();
System.out.println("Enter no of resources : ");
int r=sc.nextInt();
int alloc[][]=new int[p][r];
int max[][]=new int[p][r];
int need[][]=new int[p][r];
int work[]=new int[r];
boolean finish[]=new boolean[p];
int avai[]=new int[r];
int[] arr=new int[p];
System.out.println("Enter number of resourses for each :");
for(int i=0;i<p;i++){
for(int j=0;j<r;j++){
alloc[i][j]=sc.nextInt();
}

}
System.out.println("resourses for each :");
System.out.println(Arrays.deepToString(alloc));
System.out.println("Enter number of max resourses for each :");
for(int i=0;i<p;i++){
for(int j=0;j<r;j++){
max[i][j]=sc.nextInt();
}}
System.out.println("");
System.out.println("max resourses for each :");
System.out.println(Arrays.deepToString(max));
System.out.println("Enter number of available resourses :");
for(int i=0;i<r;i++){
avai[i]=sc.nextInt();
}
System.out.println(Arrays.toString(avai));
//System.out.println("Need matrix calculation");
for(int i=0;i<p;i++){
for(int j=0;j<r;j++){
need[i][j]=max[i][j]-alloc[i][j];
}}
System.out.println("need matrix");
System.out.println(Arrays.deepToString(need));
for(int i=0;i<r;i++){
work[i]=avai[i];
}
System.out.println(Arrays.toString(work));
System.out.println("");
for(int i=0;i<p;i++){
finish[i]=false;
}
int count = 0;
boolean flag = false;
while (count < p) {
for (int i = 0; i < p; i++) {
for (int j = 0; j < r; j++) {
if (finish[i] == false) {
if (need[i][j] <= work[j]) {
work[j] = work[j] + alloc[i][j];
System.out.println("process " + i + " is completed");
finish[i] = true;
arr[count] = i;
count++;
break;
} else {
System.out.println("process " + i + " is waiting");
break;
}}}}
}
for(int i=0;i<p;i++) {
	if (finish[i]==false) {
		System.out.println("deadlock");
	}
}
System.out.println();
System.out.print("Safe state sequence ");
for(int i=0;i<p;i++){
System.out.print(arr[i]+" ");
}
}
}