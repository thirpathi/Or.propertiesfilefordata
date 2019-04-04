package oR.propertiesFileFORreadingdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ORFileRead {
	
	public static void main(String[] args) throws IOException {
		
		
		//specifying loc of a file   (where the file is stored)
	    FileInputStream fip = new FileInputStream("D:\\rameshsoft\\workspace\\2OR.propertiesFileforData\\src\\oR\\propertiesFileFOR1writingdata\\thiru.properties");
		
		//loading file from loc to java prog
		Properties pr = new Properties();
		pr.load(fip);
		
		String name = pr.getProperty("name");
		System.out.println(name);
		
		String name1 = pr.getProperty("name1");
		System.out.println(name1);
		
		String name2 = pr.getProperty("name2");
		System.out.println(name2);
		
		String name3 = pr.getProperty("name3");
		System.out.println(name3);
	}

}


/*o/p:--  ok
thiru
raju
tejas
vivan
*/