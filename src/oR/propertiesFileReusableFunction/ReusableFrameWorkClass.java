package oR.propertiesFileReusableFunction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReusableFrameWorkClass {
	
	String fileName;
	String value;
	static Properties pr = new Properties();
	
	public ReusableFrameWorkClass(String fileName)
	{
		this.fileName = fileName;
	}
	
	public String getProperty(String key) throws IOException 
	{
		File f = new File(fileName);
		FileInputStream fip = new FileInputStream(f);
		pr.load(fip);
		value = pr.getProperty(key);
		return value;
	}

	public void setProperty(String key,String value) throws IOException 
	{
		File f = new File(fileName);
		FileInputStream fip = new FileInputStream(f);
		pr.load(fip);
	    pr.setProperty(key, value);
	    pr.store(new FileOutputStream(fileName) , null);
	}

	public void removeProperty(String key) throws IOException 
	{
		File f = new File(fileName);
		FileInputStream fip = new FileInputStream(f);
		pr.load(fip);
	    pr.remove(key);
	    pr.store(new FileOutputStream(fileName) , null);
	}


}
