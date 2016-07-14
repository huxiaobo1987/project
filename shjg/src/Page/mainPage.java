package Page;

import org.openqa.selenium.By;

import Variable.Global;

public class mainPage 
{
	public static String title="ÎÄ×Ö°æÊ×Ò³";
	public static By sta_botton=By.id("start_menu");
	public static By sta_user_config=By.id("f_ac1eff0d-ff17-4153-bd45-5b995be6aa00");
	public static By sta_user_conifg_company=By.id("s_5a05bbc4-3354-42da-ad63-c931e158a40b");
	public static By sta_dep_Manager=By.id("s_d67a4a6a-3f11-455d-9ae2-df0b864c4651");
	public static By sta_user_Manager=By.id("s_f229c189-4147-4139-aaf3-feef4c89caac");
	public static By sta_resetPwd=By.id("s_38840e30-1aa8-4841-9db1-d09fb6887708");
	
	public static boolean getTitle()
	{
		if(Global.dr.getTitle().equals(title))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void turnCompanyPage()
	{
		Global.dr.findElement(sta_botton).click();
		Global.dr.findElement(sta_user_config).click();
		Global.dr.findElement(sta_user_conifg_company).click();
		
	}
	public static void turnDepartmentManager()
	{
		Global.dr.findElement(sta_botton).click();
		Global.dr.findElement(sta_user_config).click();
		Global.dr.findElement(sta_dep_Manager).click();
	}
	public static void turnUserManager()
	{
		Global.dr.findElement(sta_botton).click();
		Global.dr.findElement(sta_user_config).click();
		Global.dr.findElement(sta_user_Manager).click();
	}
	public static void reserPwd()
	{
		Global.dr.findElement(sta_botton).click();
		Global.dr.findElement(sta_user_config).click();
		Global.dr.findElement(sta_resetPwd).click();
	}
	
}
