package mainTest;

import java.util.HashMap;
import java.util.Map;

import Excel.ReadExcel;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadExcel r=new ReadExcel("./Data.xls");
		
		while(r.hasNext())
		{
			Map tmp = (Map) r.next()[0];
			System.out.print(tmp.get("ÓÃ»§Ãû"));
		}
	}

}
