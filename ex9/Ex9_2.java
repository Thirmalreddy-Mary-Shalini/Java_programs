package ex9;

import java.io.File;
import java.nio.file.Files;

public class Ex9_2 {

	public static void main(String[] args) throws Exception {
		File f=new File("Myprofile4.txt");
		f.createNewFile();
		File f1=new File("C:\\Users\\Beniz\\eclipse-workspace\\EX_DDD\\jenulin.txt");
		Files.copy(f.toPath(), f1.toPath());
		f.delete();
	}

}
