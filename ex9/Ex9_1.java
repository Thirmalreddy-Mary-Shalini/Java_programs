package ex9;

import java.io.File;

public class Ex9_1 {

	public static void main(String[] args) throws Exception {
		File f=new File("mypro.txt");
		f.createNewFile();
		File f1=new File("lab1.txt");
		System.out.println(f.renameTo(f1));
		File f2=new File("oops.txt");
		System.out.println(f2.delete());
		File f3=new File("direc");
		f3.mkdir();
		System.out.println(f.getAbsoluteFile());
		}

}
