package Test.Shopping.Website.pageObjects.landingPageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterLandingPageLinks { 
	Logger looger=LogManager.getLogger("FooterLandingPageLinks.class");
	WebDriver driver;
	WebDriverWait wait;
	
	private By footerLandingpage=By.xpath("//div[text()='Get to Know Us']");
	
	public FooterLandingPageLinks(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait=wait;
		
	}
	
	public void scroll_Landing_page() throws InterruptedException {
		WebElement landingPageFooter=driver.findElement(footerLandingpage);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",landingPageFooter);
		Thread.sleep(2000);
		
	}
}
