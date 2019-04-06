package Pages;

import Locators.ChangePassword;
import Locators.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static junit.framework.TestCase.assertEquals;

public class ChangePasswordPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public ChangePasswordPage(WebDriver driver, WebDriverWait wait)
	{
		this.driver=driver;
		this.wait=wait;
		
	}
	public ChangePasswordPage verifyTitle(String title)
	{
		assertEquals(title, driver.getTitle());
		return this;
	}
	public ChangePasswordPage enterCurrentPassword(String password){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ChangePassword.CURRENTPASSWORD)));
		driver.findElement(By.cssSelector(ChangePassword.CURRENTPASSWORD)).clear();
		driver.findElement(By.cssSelector(ChangePassword.CURRENTPASSWORD)).sendKeys(password);
		assertEquals("Entered password not displayed",password, driver.findElement(By.cssSelector(ChangePassword.CURRENTPASSWORD)).getAttribute("value"));
		return this;
	}
	public ChangePasswordPage enterNewPassword(String password){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ChangePassword.NEWPASSWORD)));
		driver.findElement(By.cssSelector(ChangePassword.NEWPASSWORD)).clear();
		driver.findElement(By.cssSelector(ChangePassword.NEWPASSWORD)).sendKeys(password);
		assertEquals("Entered password not displayed",password, driver.findElement(By.cssSelector(ChangePassword.NEWPASSWORD)).getAttribute("value"));
		return this;
	}
	
	public ChangePasswordPage confirmPassword(String password){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ChangePassword.CONFIRMPASSWORD)));
		driver.findElement(By.cssSelector(ChangePassword.CONFIRMPASSWORD)).clear();
		driver.findElement(By.cssSelector(ChangePassword.CONFIRMPASSWORD)).sendKeys(password);
		assertEquals("Entered password not displayed",password, driver.findElement(By.cssSelector(ChangePassword.CONFIRMPASSWORD)).getAttribute("value"));
		return this;
	}
	public ChangePasswordPage changePassword() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ChangePassword.CHANGEPASSWORD)));
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		driver.findElement(By.cssSelector(ChangePassword.CHANGEPASSWORD)).click();
		return this;
	}

}