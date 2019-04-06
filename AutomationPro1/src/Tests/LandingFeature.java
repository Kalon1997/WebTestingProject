package Tests;
import Data.TestData.LoginData;

import Data.TestData.HomePageData;
import Data.TestData.EmployeePageData;
import Data.TestData.LandingPageData;

import Pages.LoginPage;
import Pages.HomePage;
import Pages.EmployeePage;
import Pages.LandingPage;
import Configuration.Configuration;
import org.testng.annotations.Test;

public class LandingFeature extends Configuration {
	
	@Test(priority=1)
	public void testLogOutSuccess() throws Exception {
	    
	LoginPage login= new LoginPage(super.driver,super.wait);
	
	HomePage home= new HomePage(super.driver, super.wait);
	LandingPage lan= new LandingPage(super.driver, super.wait);
	

	login.launchUrl(LoginData.URL)
    .verifyTitle(LoginData.TITLE)
    .enterEmail(LoginData.EMAIL)
    .enterPassword(LoginData.PASSWORD)
    .clickLoginBtn();
	home.verifyTitle(HomePageData.TITLE)
	    .clickAccountBtn()
	    .clickLogoutBtn();
	lan.verifyTitle(LandingPageData.TITLE);
	    
}
}