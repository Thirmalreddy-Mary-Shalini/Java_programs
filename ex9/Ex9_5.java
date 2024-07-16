package ex9;

import java.io.*;

public class Ex9_5 {

	public static void main(String[] args) throws Exception {
		File f=new File("mypro.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("This is question 5 and i am from mypro file ");
		fw.flush();
		File f1=new File("profile.txt");
		FileWriter fw1=new FileWriter(f1);
		fw1.write("This is question 5 and i am from profile file");
		fw1.flush();
		FileInputStream fr=new FileInputStream(f);
		byte b[]=new byte[fr.available()];
		fr.read(b);
		String s=new String(b);
		FileInputStream fr1=new FileInputStream(f1);
		byte b1[]=new byte[fr1.available()];
		fr1.read(b1);
		String s1=new String(b1);
		File f2=new File("Sample.txt");
		FileWriter fw2=new FileWriter(f2);
		fw2.write(s+s1);
		fw2.flush();

	}

}
