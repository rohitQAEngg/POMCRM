package CoreClasses;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import browser.BrowserAction;

public class SeleniumProUtility {
	WebDriver driver = null;

	public void TakeSnapSnot(String MethodName) throws IOException {
		WebDriver driver = BrowserAction.driver;
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination		
		SimpleDateFormat date = new SimpleDateFormat("yyyyMMddHHmmss");
		String path =System.getProperty("user.dir")+"\\Images\\FailedScreenShot\\";
		String TimeStamp = date.format(new Date());
		File DestFile = new File(path+MethodName+TimeStamp+".png");
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);

		
	}
	public static int getNoOfMonth(String NameOfMonth)
	{
		int countofmonth=0;
		if(NameOfMonth.equals("January"))
		{
			countofmonth=1;
		}
		else if(NameOfMonth.equals("February"))
		{
			countofmonth=2;
		}
		else if(NameOfMonth.equals("March"))
		{
			countofmonth=3;
		}
		else if(NameOfMonth.equals("April"))
		{
			countofmonth=4;
		}
		else if(NameOfMonth.equals("May"))
		{
			countofmonth=5;
		}
		else if(NameOfMonth.equals("June"))
		{
			countofmonth=6;
		}
		else if(NameOfMonth.equals("July"))
		{
			countofmonth=7;
		}
		else if(NameOfMonth.equals("August"))
		{
			countofmonth=8;
		}
		else if(NameOfMonth.equals("September"))
		{
			countofmonth=9;
		}
		else if(NameOfMonth.equals("October"))
		{
			countofmonth=10;
		}
		else if(NameOfMonth.equals("November"))
		{
			countofmonth=11;
		}
		else if(NameOfMonth.equals("December"))
		{
			countofmonth=12;
		}		
		
	     return countofmonth;
	}

}
