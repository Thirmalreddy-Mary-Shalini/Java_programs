package ex9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex9_4 {

	public static void main(String[] args) throws IOException {
		File f=new File("lab.txt");
		FileWriter fw=new FileWriter(f);
        fw.write("jenulin is jenulin good girl");
        fw.flush();
        FileInputStream f0=new FileInputStream(f);
        byte b[]=new byte[f0.available()];
        f0.read(b);
       
        int max=0;
        String q="";
        String s=new String(b);
        String s1[]=s.split(" ");
        String r="";
        for(int i=0;i<s1.length;i++) {
        	 int c=0;
        	for(int j=i+1;j<s1.length;j++) {
        	if(s1[i].equals(s1[j])) {
        		c+=1;
        	}
        }
        	if(c>max) {
        		max=c;
        		q+=s1[i];
        	 r+=s.replace(s1[i], "*");
        	}
        }
        System.out.println(r);

	}

}
