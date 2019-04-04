package oR.propertiesFileFOR1writingdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ORFlleWrite {
	
	public static void main(String[] args) throws IOException {
		
		//specifying loc of a file   (before we need to create a file and pass the exact file path)
		FileInputStream fip = new FileInputStream("D:\\rameshsoft\\workspace\\2OR.propertiesFileforData\\src\\oR\\propertiesFileFOR1writingdata\\thiru.properties");
		
		//loading file from loc to java prog
		Properties pr = new Properties();
		pr.load(fip);
		// write data
		pr.setProperty("name", "thiru");
		pr.setProperty("name1", "raju");
		pr.setProperty("name2", "tejas");
		pr.setProperty("name3", "vivan");
		
		//store the file into a specific location
		FileOutputStream fop = new FileOutputStream("D:\\rameshsoft\\workspace\\2OR.propertiesFileforData\\src\\oR\\propertiesFileFOR1writingdata\\thiru.properties");
		pr.store(fop,"successfully added the data into a properties file");
		
	}

}

/*o/p:-- ok
#successfully added data into a properties file
#Mon Mar 18 16:36:45 IST 2019
name=thiru
name3=vivan
name2=tejas
name1=raju
*/
