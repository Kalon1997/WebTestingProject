package Pages;


import Locators.Login;

import Locators.Home;
import Locators.IconVerify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static junit.framework.TestCase.assertEquals;

public class IconVerifyPage {

		WebDriver driver;
		WebDriverWait wait;
		
		public IconVerifyPage(WebDriver driver, WebDriverWait wait)
		{
			this.driver=driver;
			this.wait=wait;
			
		}
	
		public IconVerifyPage checkcareerericon(){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(IconVerify.CAREERGRAPH)));
			driver.findElement(By.cssSelector(IconVerify.CAREERGRAPH)).isDisplayed();
			//driver.findElement(By.cssSelector(Login.EMAIL_PHONE)).sendKeys(email);
			//assertEquals("CAREERGRAPH ICON NOT DISPLAYED",driver.findElement(By.cssSelector(IconVerify.CAREERGRAPH)).getAttribute("value"));
			
			return this;
		}

		
		
		
		public IconVerifyPage checkaboutusicon(){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(IconVerify.ABOUTAS)));
			driver.findElement(By.cssSelector(IconVerify.ABOUTAS)).isDisplayed();
			//driver.findElement(By.cssSelector(Login.EMAIL_PHONE)).sendKeys(email);
			//assertEquals("CAREERGRAPH ICON NOT DISPLAYED",driver.findElement(By.cssSelector(IconVerify.CAREERGRAPH)).getAttribute("value"));
			
			return this;
		}
		
		public IconVerifyPage checksubscribeicon(){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(IconVerify.SUBSCRIBE)));
			driver.findElement(By.cssSelector(IconVerify.SUBSCRIBE)).isDisplayed();
			//driver.findElement(By.cssSelector(Login.EMAIL_PHONE)).sendKeys(email);
			//assertEquals("CAREERGRAPH ICON NOT DISPLAYED",driver.findElement(By.cssSelector(IconVerify.CAREERGRAPH)).getAttribute("value"));
			
			return this;
		}

		public IconVerifyPage checkcontacticon() {
			// TODO Auto-generated method stub
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(IconVerify.CONTACT)));
			driver.findElement(By.cssSelector(IconVerify.CONTACT)).isDisplayed();
			//driver.findElement(By.cssSelector(Login.EMAIL_PHONE)).sendKeys(email);
			//assertEquals("CAREERGRAPH ICON NOT DISPLAYED",driver.findElement(By.cssSelector(IconVerify.CAREERGRAPH)).getAttribute("value"));
			
			return this;
		}

		public IconVerifyPage launchUrl(String url) {
			// TODO Auto-generated method stub
			
			
				driver.get(url);
				return this;
			
			
		}

		
			// TODO Auto-generated method stub
			
		
	}