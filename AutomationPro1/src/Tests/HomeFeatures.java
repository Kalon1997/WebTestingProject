package Tests;
import Data.TestData.LoginData;

import Data.TestData.HomePageData;
import Data.TestData.EmployeePageData;

import Pages.LoginPage;
import Pages.HomePage;
import Pages.EmployeePage;
import Configuration.Configuration;
import org.testng.annotations.Test;

public class HomeFeatures extends Configuration {
	//tc01: Checking on + button for Employment should take you to Employment page
	//Actions and validations 
	/*launch URL 
	1.Enter username 
	2.Enter password
	3.Click on login
	4.verify home page is displayed
	5.click on + for employment
	6.verify employment page is displayed  */
	@Test(priority=1)
	public void testPlusSuccess() throws Exception {
    
	LoginPage login= new LoginPage(super.driver,super.wait);
	
	HomePage home= new HomePage(super.driver, super.wait);
	
	EmployeePage emp= new EmployeePage(super.driver, super.wait);

	login.launchUrl(LoginData.URL)
    .verifyTitle(LoginData.TITLE)
    .enterEmail(LoginData.EMAIL)
    .enterPassword(LoginData.PASSWORD)
    .clickLoginBtn();
	home.verifyTitle(HomePageData.TITLE)
	    .clickEmpBtn();
	    emp.verifyTitle(EmployeePageData.TITLE); //valida
}

}