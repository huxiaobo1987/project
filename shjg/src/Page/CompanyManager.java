package Page;

import org.openqa.selenium.By;

public class CompanyManager 
{
	public static By btnAdd=By.id("btnAdd");
	public static By btnEdit=By.id("btnEdit");
	public static By btnDel=By.id("btnDel");
	//������˾��ҳ��Ԫ��
	public static class addCompanyPage
	{
		//�����ϼ���λ
		public static By IsHasUP=By.id("IsHasUp");
		//�ϼ���λ����
		public static By Upname=By.className("d-combo-input");
		
		public static By CompanyName=By.id("CompanyName");
		//�Ƿ��
		public static By IsSiteHolder=By.id("IsSiteHolder");
		//����
		public static By save=By.className("ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only");
		//�ر�
		public static By close=By.className("ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only");
	}
}
