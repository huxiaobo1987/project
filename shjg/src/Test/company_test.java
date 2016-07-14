package Test;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.thoughtworks.selenium.Selenium;

import Page.loginPage;
import Page.mainPage;
import Variable.Global;

public class company_test {
  @Test
  public void f() 
  {
	  try {
		loginPage.login("luoxy2345", "123456");
		mainPage.turnCompanyPage();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Global.dr =new FirefoxDriver();
      Global.dr.get("http://192.168.1.251:9099");
      Global.dr.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod()
  {
	 // Global.dr.quit();
  }

}
