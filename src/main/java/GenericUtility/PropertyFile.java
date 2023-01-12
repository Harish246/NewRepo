package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public  static String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis= new FileInputStream("./commonData.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

	}

}
