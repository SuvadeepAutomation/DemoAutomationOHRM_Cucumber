package com.rough;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.implementation.utilities.XLUtils;

public class ExcelTesting {

	public static void main(String[] args) throws IOException {
	
		String path="C:\\Suvadeep_Workspace\\OrangeHRDemo\\src\\test\\resources\\excelFiles\\TestData.xlsx";
		
		Map<String,String> testData=new HashMap<String,String>();
		
		int rowcount=XLUtils.getRowCount(path, "Data");
		for(int i=1;i<=rowcount;i++)
		{
			String username=(XLUtils.getCellData(path,"Data",i, 0));
			String password=(XLUtils.getCellData(path,"Data",i, 1));
			testData.put(username,password);
		Set sm=testData.entrySet();
		Iterator it=sm.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}
}
}
