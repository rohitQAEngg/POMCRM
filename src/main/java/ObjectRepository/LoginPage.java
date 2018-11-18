package ObjectRepository;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import browser.BrowserAction;
import browser.SeleniumAction;

public class LoginPage {
	
	@FindBy(xpath="//input[@id='user_name']")
	static WebElement username;
	
	@FindBy(xpath="//input[@id='user_password']")
	static WebElement passWord;
	
	@FindBy(xpath="//input[@id='login_button']")
	static WebElement submit;
	
	@FindBy(xpath="//img[@id='forgot_password_dialog_options']/parent::a")
	static WebElement ForgetPassord;
	
	
	
	
	//********************************************************************************************************************************************************
	
	
	
	
	public void LoginCRMApplication(String usr, String psd)
	{
		 PageFactory.initElements(BrowserAction.driver, LoginPage.class);
		 username.clear();
		 username.sendKeys(usr);
		 passWord.clear();
		 passWord.sendKeys(psd);
		 submit.click();
		 
		 
		 }
	
	
	public void verifyForgetPassword()
	{
		PageFactory.initElements(BrowserAction.driver, LoginPage.class);		 
		LoginPage lp = new LoginPage();
		SeleniumAction sa = new SeleniumAction();
		System.out.println(ForgetPassord.getText());		
		sa.getText(ForgetPassord);
		assertEquals(sa.getText(ForgetPassord), "Forgot Password?");
	}
	
	
	
	
	
	
	/*
	public String userName = ;
	public String passWord = "//input[@id='user_password']";
	public String submit = "//input[@id='login_button']";
	public String ForgetPassord = "//img[@id='forgot_password_dialog_options']/parent::a";
	*/
}
