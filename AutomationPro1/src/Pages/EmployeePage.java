package Pages;


import Locators.Login;

import Locators.Home;
import Locators.Employee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static junit.framework.TestCase.assertEquals;

public class EmployeePage
{
	
	WebDriver driver;
	WebDriverWait wait;
	
	public EmployeePage(WebDriver driver, WebDriverWait wait)
	{
		this.driver=driver;
		this.wait=wait;
		
	}
	/*
	public EmployeePage verifyTitle(String title) 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Home.RESUME)));//load
		assertEquals(title, driver.getTitle());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this;
	}
	*/
	public EmployeePage verifyTitle(String title)
	{
		assertEquals(title, driver.getTitle());
		return this;
	}
	
	public EmployeePage selectEmployer(String empName) 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Employee.EMPNAMEDROPDOWNBTN)));//load
		//assertEquals(title, driver.getTitle());   //is displayed validation methods
		
	/*	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//click
		
		driver.findElement(By.cssSelector(Employee.EMPNAMEDROPDOWNBTN)).click();
		
		//sendkeys
		
		driver.findElement(By.xpath(Employee.EMPNAMEINPUT)).sendKeys(empName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//click
		driver.findElement(By.xpath(Employee.EMPNAMESELECT)).click();
		
		return this;
	}


public EmployeePage selectIndustry(String industry_name) 
{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Employee.INDNAMEDROPDOWNBTN)));//load
	//assertEquals(title, driver.getTitle());   //is displayed validation methods
	
/*	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	
	//click
	
	driver.findElement(By.cssSelector(Employee.INDNAMEDROPDOWNBTN)).click();
	
	//sendkeys
	
	driver.findElement(By.xpath(Employee.INDNAMEINPUT)).sendKeys(industry_name);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//click
	driver.findElement(By.xpath(Employee.INDNAMESELECT)).click();
	
	return this;
}




public EmployeePage check_box() 
{
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Employee.CHKBOX)));
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.cssSelector(Employee.CHKBOX)).click();
	return this;
}

public EmployeePage enterDate(String date){
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Employee.DATEFROM)));
	driver.findElement(By.cssSelector(Employee.DATEFROM)).clear();
	driver.findElement(By.cssSelector(Employee.DATEFROM)).sendKeys(date);
	assertEquals("Entered email not displayed", date, driver.findElement(By.cssSelector(Employee.DATEFROM)).getAttribute("date"));
	return this;
}


public EmployeePage selectFunction(String func_name) 
{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Employee.FUNNAMEDROPDOWNBTN)));//load
	//assertEquals(title, driver.getTitle());   //is displayed validation methods
	
/*	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	
	//click
	
	driver.findElement(By.cssSelector(Employee.FUNNAMEDROPDOWNBTN)).click();
	
	//sendkeys
	
	driver.findElement(By.xpath(Employee.FUNNAMEINPUT)).sendKeys(func_name);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//click
	driver.findElement(By.xpath(Employee.FUNNAMESELECT)).click();
	
	return this;
}


}