package oR.propertiesFileFOR1writingdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Realatime 
{
	private String filePath;
	private FileInputStream fip;
	private Properties properties;
	private String value;
	FileOutputStream fop;
	
	public Realatime(String filePath) throws IOException{
		 this.filePath=filePath;
		 fip = new FileInputStream(filePath);
		// fop = new FileOutputStream(filePath);
		 properties = new Properties();
		 properties.load(fip);
	}	
	
	public String getPropertyValue(String key,String defValue){
		 value=properties.getProperty(key);
		return value;
	}
	
	public void setPropertyKeyValue(String key,String value) throws IOException{
		properties.setProperty(key, value);
		fop = new FileOutputStream(filePath);
		properties.store(fop, "added succesfully");
	}
	
	public void removeKeyValue(String key) throws IOException{
		properties.remove(key);
		fop = new FileOutputStream(filePath);
		properties.store(fop, "added succesfully");
	}
		

}
