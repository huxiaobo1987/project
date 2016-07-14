package Test;
import static org.testng.AssertJUnit.assertTrue;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import jxl.read.biff.BiffException;
import Excel.*;
import Page.*;
import Variable.Global;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

//import com.netease.datadriver.ExcelDataProvider;

public class NewTest {
  

  @BeforeMethod
  public void beforeMethod() 
  {
	  Global.dr =new FirefoxDriver();
      Global.dr.get("http://192.168.1.251:9099");
      
  }

  @AfterMethod
  public void afterMethod() {
	  Global.dr.quit();
  }
  @DataProvider(name = "dp")
  public Iterator<Object[]> dataFortestMethod() throws IOException {
      return new ReadExcel("./Data.xls");
  }
  @Test(dataProvider = "dp" )
  public void search(Map<String,String> data) {
	  
      try {
    	  String a=data.get("ÓÃ»§Ãû");
    	  String b=data.get("ÃÜÂë");
    	  String status=data.get("×´Ì¬");
    	  loginPage.login(a, b);
    	  if(status.equals("1"))
    	  {
    		  assertTrue(mainPage.getTitle());
    		  System.out.println("true");
    		  Log.snapshot((TakesScreenshot)Global.dr, "sss.png");
    	  }
    	  else if(status.equals("0"))
    	  {
    		  assertTrue(loginPage.showMsg());
    		  Log.snapshot((TakesScreenshot)Global.dr, "aaa.png");
    	  }
    	  
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
  }
}
