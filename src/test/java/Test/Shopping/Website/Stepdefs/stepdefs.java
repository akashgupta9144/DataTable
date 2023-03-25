package Test.Shopping.Website.Stepdefs;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import Test.Shopping.Website.core.WebDriverFactory;
import Test.Shopping.Website.pageObjects.landingPageObject.LandingPage;
import Test.Shopping.Website.pageObjects.landingPageObject.YourAccount;
import Test.Shopping.Website.pageObjects.landingPageObject.YourList;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefs {
	static final Logger logger = LogManager.getLogger(stepdefs.class);

	String base_url = "https://www.amazon.in/";
	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;
	private List<String> expectedListOptions;
	private List<String> expectedAccountOptions;

	LandingPage landingPage;
	YourList yourList;
	YourAccount yourAccount;
	

	@Before
	public void Setup(Scenario scn) throws Exception {
		this.scn = scn;
		String browserName = WebDriverFactory.getBrowserName();
		driver = WebDriverFactory.getWebDriverForBrowser(browserName);
		scn.log("user setup the browser: " + browserName);
		wait = new WebDriverWait(driver, 20);
		scn.log("webDriverWait is 20 second ");

	}

	@After(order = 1)
	public void quitWindow() {
		driver.quit();
		scn.log("User quit the window ");
	}

	@After(order = 2)
	public void takeScreenShot(Scenario scn) {

		if (scn.isFailed()) {
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			byte[] screenShot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
			scn.attach(screenShot, "image/png", "the failed page Name is: " + scn.getName());
		}

		
		landingPage = new LandingPage(driver,wait);
		yourList = new YourList(driver);
		yourAccount = new YourAccount(driver);

	}

	@Given("User navigate the landing page URL")
	public void Given_User_navigate_the_landing_page_URL() {
		WebDriverFactory.navigateToTheUrl(base_url);
		landingPage.validate_website_LandingPage(base_url);
		scn.log("User navigate the landing page URL");
	}

	@When("signin Account and List options is available on landing page website")
	public void signin_account_and_list_options_is_available_on_landing_page_website() {
		landingPage.validate_Signin_And_List_Option_on_LandingPage();
		scn.log("signin Account and List options is available on landing page website");
	}

	@Then("user mousehover on hello signin Accounts and lists")
	public void user_mousehover_on_hello_signin_accounts_and_lists() {
		landingPage.mouseHover_Action_on_Signin_List_option();
		scn.log("user mousehover on hello signin Accounts and lists");
	}

	@Then("under Your Lists section following options are availabel")
	public void under_your_lists_section_following_optrions_are_availabel(List<String> expected_YourListOptions) {
		this.expectedListOptions = expected_YourListOptions;
		yourList.validation_yourList_option(expectedListOptions);
		scn.log("under Your Lists section following options are availabel" + yourList);

	}

	@Then("under Your Account section following options are availabel")
	public void under_your_account_section_following_optrions_are_availabel(List<String> expected_YourAccountOptions) {
		this.expectedAccountOptions = expected_YourAccountOptions;
		yourAccount.validation_yourAccount_option(expectedAccountOptions);
		scn.log("under Your Account section following options are availabel" + yourAccount);
	}

}
