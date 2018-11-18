package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectRepository.LoginPage;
import browser.BrowserAction;

public class NewTest {
  
	public static String getExceldata(String path, int SheetNo, int rowno, int cellNo) throws IOException	
	{
		File file = new File(path);		
		FileInputStream fis = new FileInputStream(file);		
		Workbook wb=new XSSFWorkbook(fis);		
		org.apache.poi.ss.usermodel.Sheet s=wb.getSheetAt(SheetNo);
		String ValueOfcall=null;
		if(s.getRow(rowno).getCell(cellNo).getCellType()==0)
		{
			ValueOfcall =String.valueOf(s.getRow(rowno).getCell(cellNo).getNumericCellValue());
			ValueOfcall =ValueOfcall.replaceFirst(ValueOfcall.substring(ValueOfcall.indexOf(".")), "");
		}
		else if(s.getRow(rowno).getCell(cellNo).getCellType()==1)
		{			
			ValueOfcall =s.getRow(rowno).getCell(cellNo).getStringCellValue();
		}
		fis.close();
		return ValueOfcall;
		}
	
	
	public static void setExceldata(String path, int SheetNo, int rowno, int cellNo, String Value) throws IOException	
	{
		File file = new File(path);		
		FileInputStream fis = new FileInputStream(file);		
		Workbook wb=new XSSFWorkbook(fis);		
		org.apache.poi.ss.usermodel.Sheet s=wb.getSheetAt(SheetNo);
		s.getRow(rowno).createCell(cellNo).setCellValue(Value);
		fis.close();
		FileOutputStream  fos = new FileOutputStream(file);
		wb.write(fos);
		fos.close();
			
	}	
	
	
	@Test
  public void f() throws IOException {
		LoginPage lp = new LoginPage();
		  setExceldata("F:\\Automation123\\Rohit66\\CRM_Sugar_PageFactory\\DataFiles\\demo.xlsx", 0, 1, 3, "excel method data check");
			
		
	for(int i =1; i<=3;i++)
	{
		BrowserAction ba = new BrowserAction();
		WebDriver driver = ba.openBrowser("CHROMe");
		driver.get("http://www.sugarcrm.cyberdroid.biz");		
	
	lp.LoginCRMApplication(getExceldata("F:\\Automation123\\Rohit66\\CRM_Sugar_PageFactory\\DataFiles\\demo.xlsx", 0, i, 0), getExceldata("F:\\Automation123\\Rohit66\\CRM_Sugar_PageFactory\\DataFiles\\demo.xlsx", 0, i, 1));
	
	if(BrowserAction.driver.getCurrentUrl().contains("index.php?module=Home&action=index"))
	{
	  setExceldata("F:\\Automation123\\Rohit66\\CRM_Sugar_PageFactory\\DataFiles\\demo.xlsx", 0, i, 3, "pass");
			
	}
	else{
		setExceldata("F:\\Automation123\\Rohit66\\CRM_Sugar_PageFactory\\DataFiles\\demo.xlsx", 0, i, 3, "Fail");	
	}
	
	
	driver.close();
	
	}
  }
}
