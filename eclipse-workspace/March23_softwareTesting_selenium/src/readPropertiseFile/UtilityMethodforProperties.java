package readPropertiseFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityMethodforProperties
{
    public static String readDataFromProertyFile(String Key) throws IOException
    {
    	FileInputStream myfile=new FileInputStream(System.getProperty("user.dir")+"//FBsignUP.properties");
    	Properties prop=new Properties();
    	prop.load(myfile);
    	String value = prop.getProperty(Key);
    	return value;
    }
    
}
