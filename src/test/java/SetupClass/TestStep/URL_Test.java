package SetupClass.TestStep;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class URL_Test extends Set {
	WebDriverWait wait = new WebDriverWait(driver,10);
       JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("^user is already on sign up page cd$")
	public void user_is_already_on_sign_up_page_cd() throws InterruptedException  {
	    
		driver.get("https://www2.slideteam.net/adminer.php");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		try{
		Url1 = driver.findElements(By.xpath("//*[contains(text(),'Database')]")).isDisplayed();
                    Assert.assertTrue(false);
		}
		catch (Exception e)
		{  Assert.assertTrue(true); }

	
	}
}
