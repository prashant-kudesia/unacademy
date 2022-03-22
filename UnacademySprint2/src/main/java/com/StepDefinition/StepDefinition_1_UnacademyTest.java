package com.StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
 
public class StepDefinition_1_UnacademyTest {
	
	WebDriver driver ;
	
	@Given("The user clicks on the Create your account button")
	public void the_user_clicks_on_the_create_your_account_button() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\selenium-java-4.1.2\\\\chromedriver.exe");
        driver= new ChromeDriver();
		driver.get("https://unacademy.com/");
		driver.findElement(By.xpath("//button[@aria-label='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[1]/a/h6")).click();	
	}

	@When("the user enter a number starting with zero")
	public void the_user_enter_a_number_starting_with_zero() {
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[2]/div/input")).sendKeys("0792207482");
	}
	
	@When("clicks on sumbit")
	public void clicks_on_sumbit() {
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[3]/button")).click();
		
	}
	
	@Then("The page must throw an error stating the number is invalid")
	public void the_page_must_throw_an_error_stating_the_number_is_invalid() {
		 System.out.println("Invalid number.");
		    driver.quit();
	}
	
	
	//name////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Given("that the use is in the verify your mobile number page")
	public void that_the_use_is_in_the_verify_your_mobile_number_page() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\selenium-java-4.1.2\\\\chromedriver.exe");
        driver= new ChromeDriver();
		driver.get("https://unacademy.com/");
		driver.findElement(By.xpath("//button[@aria-label='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[1]/a/h6")).click();
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[2]/div/input")).sendKeys("8755918349");
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[3]/button")).click();  
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div/div/div[1]/div/h6")).click();
	    driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div/button")).click();  
	    Thread.sleep(15000);  
	}

	@When("the name contains special char")
	public void the_name_contains_special_char() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/form/div[2]/input")).sendKeys("23.,3Monish");
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/form/div[3]/input")).sendKeys("monish13@gmil.com");
	 
	}

	@When("the other entries are filled")
	public void the_other_entries_are_filled() throws Exception {
		 //drop down
	    driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/form/div[4]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[5]")).click();
	    Thread.sleep(2000);
	    
	    //check box
	    driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/form/div[5]/span[1]")).click();
		//driver.addVirtualAuthenticator(null);
	    Thread.sleep(3000);
	}

	@Then("the form must throw an error")
	public void the_form_must_throw_an_error() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[2]/button")).click();
		Thread.sleep(3000);
		driver.quit();
	}

	@When("the email has more than one @ symbol")
	public void the_email_has_more_than_one_symbol() {
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/form/div[3]/input")).sendKeys("monish1@3@gmil.com");
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/form/div[2]/input")).sendKeys("Monish");
		
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	@Given("User clicks on the login button")
	public void user_clicks_on_the_login_button() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\selenium-java-4.1.2\\\\chromedriver.exe");
        driver= new ChromeDriver();
		driver.get("https://unacademy.com/");
		driver.findElement(By.xpath("//button[@aria-label='Login']")).click();
		Thread.sleep(3000);
	}

	@Given("User is in the create your account page")
	public void user_is_in_the_create_your_account_page() {
String heading1 = "Join Unacademy";
		
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[1]/a/h6")).click();
		
		String heading2 = driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/h2")).getText();
		if(heading1.equalsIgnoreCase(heading2))			
		{
			System.out.print("true");
		}
		else			
		{
			System.out.print("false");
		}
	}

	@When("user enters mobile number")
	public void user_enters_mobile_number() {
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[2]/div/input")).sendKeys("8755918349");
	}

	@When("clicks on continue")
	public void clicks_on_continue() {
		 driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[3]/button")).click();
			
	}

	@When("Select age group")
	public void select_age_group() throws Exception {
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div/div/div[1]/div/h6")).click();
	    driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div/button")).click();  
	
	}

	@When("fill the verify your mobile number page")
	public void fill_the_verify_your_mobile_number_page() throws Exception {
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Terms")).click();
		
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/form/div[2]/input")).sendKeys("Monish");
	    driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/form/div[3]/input")).sendKeys("monish123@gmil.com");
	    
	    
	    //drop down
	    driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/form/div[4]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[5]")).click();
	    Thread.sleep(2000);
	    //WebElement testDropDown = driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/form/div[4]"));  
	    //Select dropdown = new Select(testDropDown);
	    //dropdown.selectByVisibleText("Tamil Nadu");
	    //check box
	    driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/form/div[5]/span[1]")).click();
		//driver.addVirtualAuthenticator(null);
	    Thread.sleep(3000);
	   }

	@When("click on sumbit")
	public void click_on_sumbit() {
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[2]/button")).click();
		
	}

	@Then("user must have an account")
	public void user_must_have_an_account() {
	    driver.quit();
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	@Given("User opens the login page")
	public void user_opens_the_login_page() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\selenium-java-4.1.2\\\\chromedriver.exe");
		driver = new ChromeDriver();                  // "C:\Users\monis\OneDrive\Desktop\Work\M4\Drivers\chromedriver_win32"
		driver.navigate().to("https://unacademy.com/");
		driver.findElement(By.xpath("//button[@aria-label='Login']")).click();
		Thread.sleep(3000);
	}

	@When("enters the mobile number")
	public void enters_the_mobile_number() {
		// Write code here that turns the phrase above into concrete actions
				driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[2]/div/input")).sendKeys("8755918349");
				//*[@id="DrawerPaper"]/div[2]/div[2]/div/input
	}

	@When("user clicks on submit")
	public void user_clicks_on_submit() {
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div[3]/button")).click();
		
	}

	@Then("user must get a valid OTP to login.")
	public void user_must_get_a_valid_otp_to_login() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	


}
