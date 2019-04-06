package Tests;
import Data.TestData.LoginData;

import Data.TestData.HomePageData;

import Pages.LoginPage;
import Pages.HomePage;
import Configuration.Configuration;
import org.testng.annotations.Test;

public class LoginFeature extends Configuration
{
   
	@Test(priority=4)
	public void testLoginSuccess() throws Exception {
		//tc01: verify that the user can successfully login
		//Actions and validations
		//1.launch URL
		//2.Verify title
		//3.Verify Email
		//4.Verify Password
		//5.Verify Title
		LoginPage login= new LoginPage(super.driver,super.wait);
		
		HomePage home= new HomePage(super.driver, super.wait);
		
		login.launchUrl(LoginData.URL)
		     .verifyTitle(LoginData.TITLE)
		     .enterEmail(LoginData.EMAIL)
		     .enterPassword(LoginData.PASSWORD)
		     .clickLoginBtn();
		home.verifyTitle(HomePageData.TITLE); //valida
			
		}
	@Test(priority=1)
	public void testLoginFailure1() throws Exception {
		LoginPage login= new LoginPage(super.driver,super.wait);
		login.launchUrl(LoginData.URL)
		     .verifyTitle(LoginData.TITLE)
		     .enterEmail(LoginData.INVALIDEMAIL)
		     .enterPassword(LoginData.PASSWORD)
		    
		     .clickLoginBtn()
		     .verifyErrorMessage(LoginData.ERRORMSG);
		
		
			
		}
	@Test(priority=2)
	public void testLoginFailure2() throws Exception {
		LoginPage login= new LoginPage(super.driver,super.wait);
		login.launchUrl(LoginData.URL)
		     .verifyTitle(LoginData.TITLE)
		     .enterEmail(LoginData.EMAIL)
		     .enterPassword(LoginData.INVALIDPASSWORD)
		 
		     .clickLoginBtn()
		     .verifyErrorMessage(LoginData.ERRORMSG);
		    
			
		}
	@Test(priority=3)
	public void testLoginFailure3() throws Exception {
		LoginPage login= new LoginPage(super.driver,super.wait);
		login.launchUrl(LoginData.URL)
		     .verifyTitle(LoginData.TITLE)
		     .enterEmail(LoginData.INVALIDEMAIL)
		     .enterPassword(LoginData.INVALIDPASSWORD)
		     .clickLoginBtn()
		     
		     .verifyErrorMessage(LoginData.ERRORMSG);
			
		}


}