package testcasesORG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Coding extends Reusedmethod {
	public void login() {
	driver.get(pro.getProperty("Url"));
	  xp("xu").sendKeys(pro.getProperty("u"));
	 xp("xp").sendKeys(pro.getProperty("p"));
	 xp("xs").click();
	}
	public void oneemp() throws InterruptedException, AWTException
	{
		T(1);
		Actions a =new Actions(driver);
		a.moveToElement(xp("XPIM")).perform();
		T(1);
		xp("XADD").click();
		T(1);
		
		//frame
		driver.switchTo().frame(xp("Xframe"));
		T(1);
		xp("Xid").clear();
		T(1);
		xp("Xid").sendKeys("999");
		xp("Xlast").sendKeys("usa");
		xp("XFirst").sendKeys("p");
		xp("Xmiddle").sendKeys("pula");
		xp("Xnick").sendKeys("sweety");
		T(1);
		a.moveToElement(xp("Xpho")).click().perform();
		StringSelection s=new StringSelection("C:\\Users\\admin\\Pictures\\hospital9.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		T(1);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		T(1);
		xp("Xsave").click();
		T(1);
	driver.switchTo().defaultContent();
	xp("Xback").click();
	}
	
	public void oneempexcel()
	{
		driver.get(pro.getProperty("Url"));
		xp("xu").sendKeys(pro.getProperty("u"));
		xp("xp").sendKeys(pro.getProperty("p"));
		
	}
}
