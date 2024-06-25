package GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyfileUtility {
	public String readDataFromPf(String key) throws Throwable {
		FileInputStream fis=new FileInputStream(IconstantUtilities.propertypath);
        Properties p=new Properties();
        p.load(fis);
        return p.getProperty(key);
}
}