package Page;

import org.openqa.selenium.By;

public class CompanyManager 
{
	public static By btnAdd=By.id("btnAdd");
	public static By btnEdit=By.id("btnEdit");
	public static By btnDel=By.id("btnDel");
	//新增公司的页面元素
	public static class addCompanyPage
	{
		//有无上级单位
		public static By IsHasUP=By.id("IsHasUp");
		//上级单位名称
		public static By Upname=By.className("d-combo-input");
		
		public static By CompanyName=By.id("CompanyName");
		//是否绑定
		public static By IsSiteHolder=By.id("IsSiteHolder");
		//保存
		public static By save=By.className("ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only");
		//关闭
		public static By close=By.className("ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only");
	}
}
