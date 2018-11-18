package CRMobjectMethods;

import static org.testng.Assert.assertEquals;

import org.apache.bcel.verifier.exc.AssertionViolatedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ObjectRepository.MarketingPage;
import browser.BrowserAction;
import browser.SeleniumAction;

public class MarketingActions {
/*
	public void createLead(String firstname, String lastname, String phoneNo, String Accountname,
			String StatusVisibletext) {
		MarketingPage mp = new MarketingPage();
		SeleniumAction sa = new SeleniumAction();
		sa.click(mp.leadmenu);
		sa.click(mp.createLead);
		sa.sendkey(mp.firstName, firstname);
		sa.sendkey(mp.lastName, lastname);
		sa.sendkey(mp.phoneNo, phoneNo);
		sa.sendkey(mp.Account, Accountname);
		sa.selectDropDown(mp.Status, StatusVisibletext);
		sa.click(mp.saveButton);

	}

	public void verifyLead(String firstname, String lastname, String phoneNo, String Accountname,
			String StatusVisibletext) {

		WebDriver driver = BrowserAction.driver;
		MarketingPage mp = new MarketingPage();
		SeleniumAction sa = new SeleniumAction();
		sa.click(mp.leadmenu);
		String actualName = firstname + " " + lastname;
		sa.sendkey(mp.searchTextBox, actualName );
		sa.click(mp.searchbutton);
		
		
			assertEquals(sa.getText(mp.noOfRows + "[3]/td[4]"), StatusVisibletext);
				System.out.println("Table Data  "+sa.getText(mp.noOfRows + "[3]/td[4]"));
				assertEquals(sa.getText(mp.noOfRows + "[3]/td[5]"), Accountname);
				System.out.println("Account name frome table "+sa.getText(mp.noOfRows + "[3]/td[5]") );
				assertEquals(sa.getText(mp.noOfRows + "[3]/td[6]"), phoneNo);
				
	}






*/



}
