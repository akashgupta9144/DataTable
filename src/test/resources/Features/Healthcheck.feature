@ui @healthcheck
Feature: Test the healthcheck of shopping website


Background: The common feature is running in all test
	
	Given User navigate the landing page URL 
  When signin Account and List options is available on landing page website            
	 Then user mousehover on hello signin Accounts and lists

@yourList
Scenario: Validate the Your List Options on Landing Page under Account and list section
                               
  And under Your Lists section following options are availabel                        
	|Create a Wish List   |
	|Wish from Any Website|
	|Baby Wishlist        |
	|Discover Your Style  |
	|Explore Showroom     |

@yourAccount	
Scenario: Validate the Your Account Options on Landing Page under Account and list section
	
	And under Your Account section following options are availabel
	|Your Account                     |
	|Your Orders                      |
	|Your Wish List                   |
	|Your Recommendations             |
	|Your Prime Membership            |
	|Your Prime Video                 |
	|Your Subscribe & Save Items      |
	|Memberships & Subscriptions      |
	|Your Free Amazon Business Account|
	|Your Seller Account              |
	|Manage Your Content and Devices  |

