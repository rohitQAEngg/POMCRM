package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CRMobjectMethods.LoginAction;
import ObjectRepository.LoginPage;
/*
 * 
 * Login to cRM application with valid credential* 
 * 
 * 
 * 
 * Author-Rohit L.* */
import browser.BrowserAction;

public class LoginCRMApplication {

	@Test(dependsOnMethods={"VerifyForgetPassword"})
	public void LoginWithValidCredential() throws InterruptedException {
		LoginPage lp = new LoginPage();
		System.out.println(BrowserAction.driver.getTitle());
		System.out.println(BrowserAction.driver.getCurrentUrl());
	
		lp.LoginCRMApplication("rohit", "R@hit123");
		Thread.sleep(3000);
		System.out.println(BrowserAction.driver.getTitle());
		System.out.println(BrowserAction.driver.getCurrentUrl());
	}
	
	@Test
	public void OpenCRMApp() {
		BrowserAction ba = new BrowserAction();
		WebDriver driver = ba.openBrowser("CHROMe");
		driver.get("http://www.sugarcrm.cyberdroid.biz");		
	}
	
	@Test(dependsOnMethods={"OpenCRMApp"})
	public void VerifyForgetPassword() {		
		
		LoginPage lp = new LoginPage();
		lp.verifyForgetPassword();
		
	}
	
	

}
