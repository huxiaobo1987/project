package Excel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Log 
{
	 public static void snapshot(TakesScreenshot drivername, String filename)
	   {
	        // this method will take screen shot ,require two parameters ,one is driver name, another is file name
	        
	        
	      File scrFile = drivername.getScreenshotAs(OutputType.FILE);
	          // Now you can do whatever you need to do with it, for example copy somewhere
	          try {
	              System.out.println("save snapshot path is:E:/"+filename);
	              FileUtils.copyFile(scrFile, new File("./screenshot/"+filename));
	          } catch (IOException e) {
	              // TODO Auto-generated catch block
	              System.out.println("Can't save screenshot");
	              e.printStackTrace();
	          } 
	          finally
	          {
	              System.out.println("screen shot finished");
	          }
	   }
}
