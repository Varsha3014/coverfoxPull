package readPropertiseFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData
{
	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir")+"//FBsignUP.properties";
		FileInputStream myfile=new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(myfile);
		String value = prop.getProperty("lastName");
		System.out.println(value);
		
}
}