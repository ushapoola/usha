package testcasesORG;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import kosmik_basic.basic_class;

public class tcExecution extends basic_class {
  @Test
  public void testcase() throws InterruptedException, AWTException {
	  Coding c=new Coding();
	  c.login();
	  c.oneemp();
	  
  }
}
