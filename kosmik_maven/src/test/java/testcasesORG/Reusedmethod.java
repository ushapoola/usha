package testcasesORG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Reusedmethod extends tcExecution {
public WebElement xp(String a)
{
	 return driver.findElement(By.xpath(pro.getProperty(a)));
}

public void  T(int i) throws InterruptedException
{
	int b=i*1000;
	Thread.sleep(b);
}
	
}
