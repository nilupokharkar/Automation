package FilesProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   FileInputStream file=new FileInputStream("D:\\BasicCorejava\\src\\FilesProperties\\objectrepo.properties");
   
   Properties or=new Properties();
   or.load(file);
   
   System.out.println(or.getProperty("username"));
   System.out.println(or.getProperty("password"));
   System.out.println(or.getProperty("login"));
   
	}

}
