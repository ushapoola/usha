package kosmik_basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class basic_class {
	public static WebDriver driver;
	public static Properties pro;
  @Test
  public void login() throws IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  FileInputStream fil=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\kosmik_maven\\src\\data\\java\\TestdataORG\\mydata");
	  pro =new Properties();
	  pro.load(fil);
	  
	  
	  System.out.println(pro.getProperty("check"));
	  
	  
  }
}
