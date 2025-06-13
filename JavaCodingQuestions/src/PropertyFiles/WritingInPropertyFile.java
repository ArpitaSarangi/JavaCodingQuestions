package PropertyFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingInPropertyFile {

	public static void main(String[] args) throws IOException {
		
		Properties properties=new Properties();
		
		FileOutputStream file=null;
		try {
		
		properties.setProperty("Name", "Arpita");
		properties.setProperty("Email", "arpita@coforge.com");
		properties.setProperty("Org", "Coforge");
		properties.setProperty("URL", "http://www.google.co.in");
		
		String filepath="./src/main\\resources\\data\\propertyExample.properties";
		
		file=new FileOutputStream(filepath);
		properties.store(file, "Sample data in to property file.....");
				
		}catch(FileNotFoundException e) {
			System.out.println("File is not there");
		}finally {
			file.close();
		}
		

	}

}
