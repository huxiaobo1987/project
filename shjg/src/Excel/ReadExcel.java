package Excel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import jxl.*;
import jxl.read.biff.BiffException;

public class ReadExcel implements Iterator<Object[]>
{
	 	private Workbook book         = null;
	    private Sheet    sheet        = null;
	    private int      rowNum       = 0;
	    private int      currentRowNo = 0;
	    private int      columnNum    = 0;
	    private String[] columnName;
	    public ReadExcel(String url)
	    {
	    	
	    	try {
	    		InputStream inputStream = new FileInputStream(url);
				this.book=Workbook.getWorkbook(inputStream);
				this.sheet=book.getSheet(0);
		    	this.rowNum=sheet.getRows();
		    	Cell [] cell=sheet.getRow(0);
		    	this.columnNum=cell.length;
		    	columnName =new String[cell.length];
		    	for(int i=0;i<cell.length;i++)
		    	{
		    		columnName[i]=cell[i].getContents().toString();
		    	}
			} catch (Exception e ) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	    	
	    	this.currentRowNo++;
	    	
	    }
	    public boolean hasNext()
	    {
	    	if(currentRowNo>=rowNum)
	    	{
	    		book.close();
	    		return false;
	    	}
	    	else
	    	{
	    		return true;
	    	}
	    }
	    public Object[] next()
	    {
	    	Cell[] c=sheet.getRow(currentRowNo);
	    	Map<String, String> data=new HashMap<String,String>(); 
	    	for(int i=0;i<this.columnNum;i++)
	    	{
	    		data.put(this.columnName[i], c[i].getContents().toString());
	    		//cell[i] c=sheet.getc
	    	}
	    	Object[] o=new Object[1];
	    	o[0]=data;
	    	this.currentRowNo++;
	    	return o;
	    	
	    }
}