package Tests;

import org.testng.annotations.Test;

import Configuration.Configuration;
import Data.TestData.EmployeePageData;
import Data.TestData.HomePageData;
import Data.TestData.LandingPageData;
import Data.TestData.LoginData;
import Pages.EmployeePage;
import Pages.HomePage;
import Pages.LandingPage;
import Pages.LoginPage;

public class EmployeeFeatures  extends Configuration {

	
		
	@Test(priority=1)
	public void empPlusSuccess() throws Exception {
    
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
	    //emp.verifyTitle(EmployeePageData.TITLE);
	    
	    
	    
	  //  home.clickEmpBtn();
	    
	    emp.selectEmployer(EmployeePageData.EMP_NAME);
	    emp.selectIndustry(EmployeePageData.INDUSTRY_NAME);
	    emp.check_box();
	    emp.enterDate(EmployeePageData.DATE);
	    emp.selectFunction(EmployeePageData.FUNC);
}
	
	
	}