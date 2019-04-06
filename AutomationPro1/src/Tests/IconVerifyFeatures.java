package Tests;

import org.testng.annotations.Test;

import Configuration.Configuration;
import Data.TestData.HomePageData;
import Data.TestData.LoginData;
import Data.TestData.VerifyData;
import Pages.HomePage;
import Pages.IconVerifyPage;
import Pages.LoginPage;

public class IconVerifyFeatures extends Configuration{
	
	@Test(priority=4)
	public void testLoginSuccess() throws Exception {
		//tc01: verify that the user can successfully login
		//Actions and validations
		//1.launch URL
		//2.Verify title
		//3.Verify Email
		//4.Verify Password
		//5.Verify Title
		//LoginPage login= new LoginPage(super.driver,super.wait);
		
		IconVerifyPage icons = new IconVerifyPage(super.driver,super.wait);
		
		icons.launchUrl(VerifyData.URL);
		    // .verifyTitle(LoginData.TITLE);
		icons.checkcareerericon();
		icons.checkcontacticon();
		icons.checksubscribeicon();
		icons.checkaboutusicon();
		     

			
		
}
}