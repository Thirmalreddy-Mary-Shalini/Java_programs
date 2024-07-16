package ex9;

import java.io.File;
import java.io.*;

public class Ex9_3 {

	public static void main(String[] args) throws Exception {
		File f=new File("Sample.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		fw.write("We have exams! in the, next upcoming weeks.");
		fw.flush();
		FileInputStream f0=new FileInputStream("Sample.txt");
	    byte b[]=new byte[f0.available()];
	    f0.read(b);
String s=new String(b);
int c=0;
int p=0;
String s1[]=new String[s.length()];
s1=s.split(" ");
System.out.println("No of words : "+s1.length);
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)==' ') {
		c+=1;
	}
	if(s.charAt(i)==','||s.charAt(i)==';'||s.charAt(i)==':'||s.charAt(i)=='?'||s.charAt(i)=='/'||s.charAt(i)=='!' ||s.charAt(i)=='.') {
p+=1;
	}
}
System.out.println("No of spaces : "+c);
System.out.println("No of punctuations : "+p);
	}

}

