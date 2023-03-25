package Test.Shopping.Website.pageObjects.landingPageObject;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class YourList {
	Logger logger=LogManager.getLogger("YourList.class");
	WebDriver driver;
	private By yourListOptions=By.xpath("//div[@id='nav-al-wishlist']//span");
	
	public YourList(WebDriver driver) {
	
	this.driver=driver;
	}
public void validation_yourList_option(List<String> expectedOptions) {
	List<WebElement> yourList=driver.findElements(yourListOptions);
	for (int i = 0; i < expectedOptions.size(); i++) {
		if(expectedOptions.get(i).equals(yourList.get(i).getText())){
			Assert.assertTrue(true);
			logger.info("validation of expected list and your list present on website passed: "+expectedOptions.get(i)+"  "+yourList.get(i).getText());
			}
		else {
			Assert.fail();
		logger.info("validation of expected list and your list present on website are failed: "+expectedOptions.get(i)+"  "+yourList.get(i).getText());
		}
		
	}
}
}
