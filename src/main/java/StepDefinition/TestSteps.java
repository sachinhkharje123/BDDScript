package StepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TestSteps 
{	
	public WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Given("I Opened the Browser")
	public void i_opened_the_browser() 
	{
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.gmail.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@When("I Entered the Email and click on next Button")
	public void i_entered_the_email_click_on_next_button()
	{
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("sachinhkharje123@gmail.com");
		WebElement nextEmailButton=driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[3]"));
		nextEmailButton.click();
	}

	@When("I Entered the Password and click on next Button")
	public void i_entered_the_password_click_on_next_button() 
	{
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement nextPasswordButton=driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[3]"));
		password.sendKeys("Kharje@007");
		nextPasswordButton.click();
	}
	
	@Then("I logged into the Email application")
	public void i_logged_into_the_email_application()
	{
		WebElement emailHomePage=driver.findElement(By.xpath("//img[@class='gb_Mc']"));
		boolean result = emailHomePage.isDisplayed();
		Assert.assertTrue(result);
	}

	@Then("I clicks on the Compose Button")
	public void i_clicks_on_the_compose_button() 
	{
		WebElement composeButton=driver.findElement(By.xpath("//div[@jscontroller='eIu7Db']"));
		composeButton.click();
	}

	@Then("I Verified Compose Window will be opened or not")
	public void i_verified_compose_window_will_be_opned_or_not() 
	{
		WebElement composeWindow=driver.findElement(By.xpath("//div[@class='aYF']"));
		boolean result = composeWindow.isDisplayed();
		Assert.assertTrue(result);
	}

	@Then("I Entered valid recipient email address")
	public void i_entered_valid_recipient_email_address() 
	{
		WebElement validEmail=driver.findElement(By.xpath("//input[@id=':c5']"));
		validEmail.sendKeys("sachinhkharje123@gmail.com");
	}
	
	@Then("I Entered invalid recipient email address")
	public void i_entered_invalid_recipient_email_address()
	{
		WebElement inValidEmail=driver.findElement(By.xpath("//input[@id=':c5']"));
		inValidEmail.sendKeys("shkpune@.com");
	}
	
	@Then("I Enter details in subject line")
	public void i_enter_details_in_subject_line() 
	{
		WebElement subjectLine=driver.findElement(By.xpath("//input[@id=':8j']"));
		subjectLine.sendKeys("Subject Line Filled");
	}

	@Then("I Enter details in email body")
	public void i_enter_details_in_email_body() 
	{
		WebElement emailBody=driver.findElement(By.xpath("//div[@id=':9t']"));
		emailBody.sendKeys("Email Body Filled");
	}

	@Then("I Click on Send Button")
	public void i_click_on_send_button() 
	{
		WebElement sendButton=driver.findElement(By.xpath("//div[@id=':89']"));
		sendButton.click();
	}

	@Then("I missed recipient email address")
	public void i_missed_recipient_email_address() 
	{
		WebElement recipientAddress=driver.findElement(By.xpath("//input[@id=':c5']"));
		recipientAddress.sendKeys(" ");
	}

	@Then("I not filled subject line")
	public void i_not_filled_subject_line() 
	{
		WebElement subjectLine=driver.findElement(By.xpath("//input[@id=':8j']"));
		subjectLine.sendKeys(" ");
	}
	
	@Then("I Verified error massege for missing email")
	public void i_verified_error_massege_for_missing_email() 
	{
		WebElement errorMassege=driver.findElement(By.xpath("//div[@class='bwApif-bHk']"));
		boolean result = errorMassege.isDisplayed();
		Assert.assertTrue(result);
	}
	
	@Then("I Verified error massege for invalid email")
	public void i_verified_error_massege_for_invalid_email() 
	{
		WebElement errorMassege=driver.findElement(By.xpath("//div[@class='bwApif-bHk']"));
		boolean result = errorMassege.isDisplayed();
		Assert.assertTrue(result);
	}
	
	@Then("I Verified error massege for empty subject line")
	public void i_verified_error_massege_for_empty_subject_line() 
	{
		WebElement errorMassege=driver.findElement(By.xpath("//div[@class='bwApif-bHk']"));
		boolean result = errorMassege.isDisplayed();
		Assert.assertTrue(result);
	}
	
	@Then("Close Application")
	public void close_application() 
	{
		driver.quit();
	}
}