@ui @footerHealthcheck
Feature: Test the footer of landing page healthcheck of shopping website


	  
	
@footer	
Scenario: Validate the footer links of landing  Website page
	Given User navigate the landing page URL
	And User scroll down the landing website page 
	When User is able to see 4 links on the footer of website landing page
	And the options in footer of landing page are "Get to Know Us","Connect with Us","Make Money with Us","Let Us Help You"
	Then validate under Get to Know Us option category below options are visible 
	|About Us      |
	|Careers       |
	|Press Releases|
	|Amazon Science|
	
	And validate under Connect with Us option category below options are visible
	|Facebook |
	|Twitter  |
	|Instagram|
	
	And validate under Make Money with Us option category below options are visible
	|Sell on Amazon               |
	|Sell under Amazon Accelerator|
	|Protect and Build Your Brand |
	|Amazon Global Selling        |
	|Become an Affiliate          |
	|Fulfilment by Amazon         |
	|Advertise Your Products      |
	|Amazon Pay on Merchants      |
	
	And validate under Let Us Help You option category below options are visible	
	|COVID-19 and Amazon		 |
	|Your Account       		 |
	|Returns Centre    		 	 |
	|100% Purchase Protection|
	|Amazon App Download		 |
	|Help										 |
	