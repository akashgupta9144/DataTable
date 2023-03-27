package Test.Shopping.Website.Stepdefs;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.Shopping.Website.core.WebDriverFactory;
import Test.Shopping.Website.pageObjects.landingPageObject.FooterLandingPageLinks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class footerStepdefs {
	String base_url = "https://www.amazon.in/";
	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;
	//stepdefs commonFile;
	FooterLandingPageLinks footer;

	@Before(order = 1)
	public void Setup(Scenario scen) throws Exception {
		this.scn = scen;
		//commonFile = new stepdefs();
		//commonFile.Setup(scn);

		String browserName = WebDriverFactory.getBrowserName();
		driver = WebDriverFactory.getWebDriverForBrowser(browserName);
		scn.log("user setup the browser: " + browserName);
		WebDriverFactory.navigateToTheUrl(base_url);
		wait = new WebDriverWait(driver, 20);
		scn.log("webDriverWait is 20 second ");
		footer = new FooterLandingPageLinks(driver, wait);
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

	}

	@Given("User scroll down the landing website page")
	public void user_scroll_down_the_landing_website_page() throws InterruptedException {
		footer.scroll_Landing_page();

	}

	@When("User is able to see {int} links on the footer of website landing page")
	public void user_is_able_to_see_links_on_the_footer_of_website_landing_page(Integer int1) {
	}

	@When("the options in footer of landing page are {string},{string},{string},{string}")
	public void the_options_in_footer_of_landing_page_are(String string, String string2, String string3,
			String string4) {

	}

	@Then("validate under Get to Know Us option category below options are visible")
	public void validate_under_get_to_know_us_option_category_below_options_are_visible(
			io.cucumber.datatable.DataTable dataTable) {
	}

	@Then("validate under Connect with Us option category below options are visible")
	public void validate_under_connect_with_us_option_category_below_options_are_visible(
			io.cucumber.datatable.DataTable dataTable) {
	}

	@Then("validate under Make Money with Us option category below options are visible")
	public void validate_under_make_money_with_us_option_category_below_options_are_visible(
			io.cucumber.datatable.DataTable dataTable) {

	}

	@Then("validate under Let Us Help You option category below options are visible")
	public void validate_under_let_us_help_you_option_category_below_options_are_visible(
			io.cucumber.datatable.DataTable dataTable) {
	}

}
