package com.crm.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * @author : Naveen K Pathak
 */

public class FileUtility {
	/*
	 * 	This method is used to read data from property file
	 * 	This method takes key as a parameter and returns value
	 * 	@parameter key
	 * 	@return
	 *  @throws IOException
	 */
	
	public String getDataFromProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

	

}



	


