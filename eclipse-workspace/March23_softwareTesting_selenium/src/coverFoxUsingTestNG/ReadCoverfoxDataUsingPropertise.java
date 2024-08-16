package coverFoxUsingTestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadCoverfoxDataUsingPropertise {

	public static void main(String[] args) throws IOException {
		
		   String filePath = System.getProperty("user.dir")+"//CoverData.properties";
			FileInputStream myfile=new FileInputStream(filePath);
			Properties prop=new Properties();
			prop.load(myfile);
			String value = prop.getProperty("mobno");
			System.out.println(value);
	}

}
