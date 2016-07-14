package Page;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;

import Excel.ReadExcel;
import Variable.Global;;
public class loginPage 
{
	public static By UserName=By.id("UserName");
	public static By Password=By.id("Password");
	public static By Login=By.className("login_btn");
	public static String username;
	public static String password;
	public static By Msg=By.id("divMsg");
	/*public loginPage(String username,String password)
	{
		this.username=username;
		this.password=password;
	}*/
	
	public  static void setUssername(String username) throws IndexOutOfBoundsException, BiffException, IOException
	{
		
		Global.dr.findElement(UserName).sendKeys(username);
	}
	public  static void setPassword(String password)
	{
		Global.dr.findElement(Password).sendKeys(password);
	}
	public static void click()
	{
		Global.dr.findElement(Login).click();
	}
	public  static void login(String username,String password) throws IndexOutOfBoundsException, BiffException, IOException
	{
		setUssername(username);
		setPassword(password);
		click();
	}
	public static boolean showMsg()
	{
		return Global.dr.findElement(Msg).isDisplayed();
	}
}
