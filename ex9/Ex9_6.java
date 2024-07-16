package ex9;

import java.io.*;
import java.util.Scanner;

public class Ex9_6 {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		File f=new File("Myprofile2.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("Hello hi how are you");
		fw.flush();
		FileInputStream fr=new FileInputStream(f);
		byte b[]=new byte[fr.available()];
		fr.read(b);
		String s=new String(b);
		String s1[]=s.split(" ");
		System.out.println("Enter the letter");
		char c=sc.next().charAt(0);
		int y=0;
		for(int i=0;i<s1.length;i++){
//			for(int j=0;j<s1[i].length();j++) {
			if(s1[i].charAt(0)==c) {
				y+=1;
			}
			else {
				continue;
			}
			
		
	}
		System.out.println(y);
	}
}
