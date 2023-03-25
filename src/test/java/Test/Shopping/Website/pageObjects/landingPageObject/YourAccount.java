package Test.Shopping.Website.pageObjects.landingPageObject;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class YourAccount {

	Logger logger = LogManager.getLogger("YourAccount.class");
	WebDriver driver;
	private By yourAccountOptions = By.xpath("//div[@id='nav-al-your-account']//span");

	public YourAccount(WebDriver driver) {
		this.driver = driver;
	}

	public void validation_yourAccount_option(List<String> expectedOptions) {
		List<WebElement> yourAccount = driver.findElements(yourAccountOptions);
		for (int i = 0; i < expectedOptions.size(); i++) {
			if (expectedOptions.get(i).equals(yourAccount.get(i).getText())) {
				Assert.assertTrue(true);
				logger.info("validation of expected option and your Account present on website passed: ");
				logger.info(""+expectedOptions.get(i) + " -> " + yourAccount.get(i).getText());
			} else {
				Assert.fail();
				logger.info("validation of expected option and your Account present on website are failed: ");
				logger.info(""+expectedOptions.get(i) + " -> " + yourAccount.get(i).getText());
			}

		}
	}

}
