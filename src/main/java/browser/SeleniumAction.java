package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAction {
	WebDriver driver = null;

	public SeleniumAction() {
		this.driver = BrowserAction.driver;
	}

	public void click(WebElement e) {
		e.isDisplayed();
		e.isEnabled();
		e.click();
	}

	public void sendkey(WebElement e, String Value) {
		e.isDisplayed();
		e.isEnabled();
		e.clear();
		e.sendKeys(Value);
	}

	public String getText(WebElement e) {
		e.isDisplayed();
		e.isEnabled();
		return e.getText();

	}

	public void selectDropDown(WebElement e, String SelectByVisibletext) {
		e.isDisplayed();
		e.isEnabled();
		Select s = new Select(e);
		s.selectByVisibleText(SelectByVisibletext);

	}

}
