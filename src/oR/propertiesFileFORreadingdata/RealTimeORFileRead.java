package oR.propertiesFileFORreadingdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class RealTimeORFileRead 
{
	
	public static Map<String, String> getTotalPropertiesFileData(String fileName) throws IOException
	{
		FileInputStream fip = new FileInputStream(fileName);
		Map<String, String> propertyKeyValues = new HashMap<>();
		Properties properties = new Properties();
		properties.load(fip);
		Set<Object> keys = properties.keySet();
		for(Object k : keys)
		{
			String key = (String)k;
			String value=properties.getProperty(key);
			System.out.println(key + "........" + value);
			propertyKeyValues.put(key, value);
		}
		return propertyKeyValues;
	}
public static void main(String[] args) throws IOException {
	
	Map<String, String> m=getTotalPropertiesFileData("D:\\rameshsoft\\workspace\\2OR.propertiesFileforData\\src\\oR\\propertiesFileFOR1writingdata\\thiru.properties");
	System.out.println(m);
	
 }

}

/*o/p:--ok
name........thiru
name3........vivan
name2........tejas
name1........raju
{name3=vivan, name=thiru, name2=tejas, name1=raju}
*/