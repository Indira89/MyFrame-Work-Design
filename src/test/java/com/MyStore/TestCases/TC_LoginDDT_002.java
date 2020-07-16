package com.MyStore.TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MyStore.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
	
	@Test
	public void loginDDT() {
		
	}
	
	@DataProvider(name="LoginData")
	getData(){
		String path=System.getProperty("user.dir")+"/src/test/java/com/MyStore/TestData/LoginData.xlsx";
		int rowNum=XLUtils.getRowCount(path, "Sheet1");
		int colCount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		
	}

}
