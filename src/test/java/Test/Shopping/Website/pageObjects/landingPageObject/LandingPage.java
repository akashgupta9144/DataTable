package Test.Shopping.Website.pageObjects.landingPageObject;

import org.apache.logging.log4j.LogManager ;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import junit.framework.Assert;

public class LandingPage {
	Logger logger=LogManager.getLogger(LandingPage.class);
	WebDriver driver;
	WebDriverWait wait;
	
	By option=By.xpath("//span[@class='nav-line-2 ']");
	//By option=By.xpath("//a[@id='nav-link-accountList']");
	public LandingPage(WebDriver driver,WebDriverWait wait) {
		// TODO Auto-generated constructor stub
		this.driver =driver;
		this.wait=wait;
	}
	
	public void validate_website_LandingPage(String base_url) {
		String expected=base_url;
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(expected, actual);
		logger.info("validate website LandingPage is successfull"); 
	}
	
	public void validate_Signin_And_List_Option_on_LandingPage() {
		WebElement signin_List_Option=wait.until(ExpectedConditions.elementToBeClickable(option));
		Assert.assertEquals(true,signin_List_Option.isDisplayed());
		logger.info("Hello,Signin And List Option is available on LandingPage  ");
	}
	
	public void mouseHover_Action_on_Signin_List_option(){
		Actions action=new Actions(driver);
		WebElement signin_List_Option=wait.until(ExpectedConditions.elementToBeClickable(option));
		action.moveToElement(signin_List_Option).build().perform();
		}
	

}
