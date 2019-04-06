package Tests;
import Data.TestData.LoginData;

import Data.TestData.HomePageData;
import Data.TestData.EmployeePageData;
import Data.TestData.LandingPageData;
import Data.TestData.ChangePasswordData;

import Pages.LoginPage;
import Pages.HomePage;
import Pages.EmployeePage;
import Pages.LandingPage;
import Pages.ChangePasswordPage;
import Configuration.Configuration;
import org.testng.annotations.Test;

public class ChangePasswordFeatures extends Configuration {
	
	@Test(priority=1)
	public void testChangePasswordSuccess() throws Exception {
	    
	LoginPage login= new LoginPage(super.driver,super.wait);
	
	HomePage home= new HomePage(super.driver, super.wait);
	LandingPage lan= new LandingPage(super.driver, super.wait);
	ChangePasswordPage cp=new ChangePasswordPage(super.driver, super.wait);

	login.launchUrl(LoginData.URL)
    .verifyTitle(LoginData.TITLE)
    .enterEmail(LoginData.EMAIL)
    .enterPassword(LoginData.PASSWORD)
    .clickLoginBtn();
	home.verifyTitle(HomePageData.TITLE)
	    .clickAccountBtn()
	    .clickChangePasswordBtn();
	 cp.verifyTitle(ChangePasswordData.TITLE)
	   .enterCurrentPassword(ChangePasswordData.CUPASSWORD)
	   .enterNewPassword(ChangePasswordData.NWPASSWORD)
	   .confirmPassword(ChangePasswordData.COPASSWORD)
	   .changePassword();
// login.verifyTitle(LoginData.TITLE)  ///
	      login.enterEmail(LoginData.EMAIL)
	      .enterPassword(ChangePasswordData.CUPASSWORD)
	      .clickLoginBtn();
	      
	      login.enterEmail(LoginData.EMAIL)
	      .enterPassword(ChangePasswordData.NWPASSWORD)
	      .clickLoginBtn();
	      
	 home.verifyTitle(HomePageData.TITLE);
	 
	 
	    
}
	/*
	@Test(priority=2)
	public void testOldPasswordSuccess() throws Exception {
	    
	LoginPage login= new LoginPage(super.driver,super.wait);
	
	HomePage home= new HomePage(super.driver, super.wait);
	LandingPage lan= new LandingPage(super.driver, super.wait);
	ChangePasswordPage cp=new ChangePasswordPage(super.driver, super.wait);

  login.launchUrl(LoginData.URL)
    .verifyTitle(LoginData.TITLE)
    .enterEmail(LoginData.EMAIL)
    .enterPassword(ChangePasswordData.CUPASSWORD)
    .clickLoginBtn(); 
    }
	*/


}