package PropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		
		
		Properties properties =new Properties();
		
		
		String filePath=System.getProperty("/Users/arpitasarangi/git/JavaCodingQuestions")+"\\src\\main\\resources\\data\\propertyExample.properties";
		
		FileInputStream file=new FileInputStream(filePath);
		
		properties.load(file);
		
		file.close();
		
		//Read the properties file
		String name=properties.getProperty("Name");
		String email=properties.getProperty("Email");
		String org=properties.getProperty("Organization");
		
		
		System.out.println(name+" "+email+" "+org);

	}

}
