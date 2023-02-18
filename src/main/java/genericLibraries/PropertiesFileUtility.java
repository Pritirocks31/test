package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * This class contains all reusable method to perform operations 
 * @author priti
 *
 */


public class PropertiesFileUtility {
	Properties property;
	/**
	 * This method is used to initialize properties file
	 * @param filePath
	 */
	
	public void propertyFileInitialization(String filePath) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(filePath);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		property=new Properties();
		
		
		
		
			
	}
	

}
