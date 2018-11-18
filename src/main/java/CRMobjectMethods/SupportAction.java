package CRMobjectMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import CoreClasses.SeleniumProUtility;
import ObjectRepository.HomePage;
import ObjectRepository.SupportPage;
import browser.BrowserAction;
import browser.SeleniumAction;

public class SupportAction {
	/*public void Calender1(int year, String month, String date) throws InterruptedException {
		HomePage hp = new HomePage();
		SupportPage sp = new SupportPage();
		SeleniumAction sa = new SeleniumAction();
		WebDriver driver = BrowserAction.driver;
		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath(hp.support))).build().perform();
		sa.click(sp.prject);
		sa.click(sp.createProject);
		sa.click(sp.startDateCalenderIMG);
		String CurrentmonthYear = sa.getText(sp.CurrentmonthYear);
		CurrentmonthYear.length();
		String currentYear = CurrentmonthYear.substring(CurrentmonthYear.length() - 4, CurrentmonthYear.length());
		String currentMonth = CurrentmonthYear.substring(0, CurrentmonthYear.length() - 5);
		int yeardiff = Integer.parseInt(currentYear) - year;
		if (yeardiff > 0) {
			for (int i = 1; i <= (yeardiff * 12); i++) {
				sa.click(sp.previousMonth);
			}
		}

		else if (yeardiff < 0) {
			int positive = Math.abs(yeardiff);

			for (int i = 1; i <= (positive * 12); i++) {
				sa.click(sp.nextMonth);
			}

		}

		int monthcount = SeleniumProUtility.getNoOfMonth(currentMonth) - SeleniumProUtility.getNoOfMonth(month);

		if (monthcount > 0) {
			for (int i = 1; i <= monthcount; i++) {
				sa.click(sp.previousMonth);
			}

		} else if (monthcount < 0) {
			for (int i = 1; i <= Math.abs(monthcount); i++) {
				sa.click(sp.nextMonth);
			}
		}
		sa.click(sp.Date1 + date + sp.Date2);

	}*/
}
