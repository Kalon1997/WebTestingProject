package Pages;
import Locators.Login;
import Locators.Landing;


import Locators.Home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static junit.framework.TestCase.assertEquals;


public class LandingPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LandingPage(WebDriver driver, WebDriverWait wait)
	{
		this.driver=driver;
		this.wait=wait;
		
	}
	
	public LandingPage verifyTitle(String title) 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Landing.CONTACT)));//load
		assertEquals(title, driver.getTitle());
		
	/*	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		return this;
	}

}