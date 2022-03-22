package com.StepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_2_UnacademyTest {
	
	WebDriver driver = null;
	Properties prop = new Properties();
	
	@Given("user open google")
	public void user_open_google() {
		System.out.println("browser is open using hooks");
		  System.setProperty("webdriver.chrome.driver","D:\\\\\\\\Selenium\\\\\\\\selenium-java-4.1.2\\\\\\\\chromedriver.exe"); 
		  driver = new ChromeDriver();
			driver.get("https://google.com");
	}

	@When("Type url")
	public void type_url() {
		driver.findElement(By.name("q")).sendKeys("unacademy login");
		 //driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
			 
			 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			 driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
			 driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/div/a/h3")).click();
			 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	}

	@Then("I validate the outcome")
	public void i_validate_the_outcome() throws Exception {
		String reg=driver.getTitle();
		String str2="Unacademy - India's largest learning platform";
		if (reg.equals(str2)) {
			System.out.println("Login page for unacademy title Verified");
		}
		else
		{
			driver.navigate().back();
		}
	   	//driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
	  	Thread.sleep(3000);
	  	driver.close();
	}

	@Then("unacademy logo is visible at top right corner")
	public void unacademy_logo_is_visible_at_top_right_corner() throws Exception {


		FileInputStream ip = new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\login.properties");
		prop.load(ip);
		
		driver= new ChromeDriver();
		driver.navigate().to("https://unacademy.com/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(prop.getProperty("unacademyLogo_xpath"))).click();
		driver.close();
	  	
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() throws IOException {
		FileInputStream ip = new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\login.properties");
		prop.load(ip);
		
		driver= new ChromeDriver();
		driver.navigate().to("https://unacademy.com/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("loginbutton1"))).click();
		//driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
	}

	@Then("user is on Login page")
	public void user_is_on_login_page() throws InterruptedException {

		System.out.println(driver.getCurrentUrl());
		//driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.close();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	@Given("User is in Login Page")
	public void user_is_in_login_page() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\selenium-java-4.1.2\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://unacademy.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
	}

	@When("User enters mobile")
	public void user_enters_mobile() throws Exception {
		FileInputStream ip = new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\login.properties");
		prop.load(ip);
		driver.findElement(By.xpath(prop.getProperty("loginbutton1"))).click();
		WebElement mob = driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[2]/div/input"));
		mob.sendKeys("8755918349");
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[3]/button")).click();
		Thread.sleep(15000); 
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div/button")).click();
		Thread.sleep(4000);
	}

	@Then("phone number is validated")
	public void phone_number_is_validated() {
	    driver.quit();
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	@Given("user able conntinue with email")
	public void user_able_conntinue_with_email() throws IOException {
		FileInputStream ip = new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\login.properties");
		prop.load(ip);
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\selenium-java-4.1.2\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://unacademy.com");
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("loginbutton1"))).click();
		//driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
	
	}

	@When("user click on coninue link")
	public void user_click_on_coninue_link() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[3]/a/h6")).click();
		
		Thread.sleep(3000);
	}

	@When("user enter email and verify otp")
	public void user_enter_email_and_verify_otp() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[2]/input")).sendKeys("prashantkudesia946@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div/button")).click();//  green verify otp
		Thread.sleep(3000);

		boolean assert1 =  driver.getPageSource().contains("Email is not valid");
				
		if(assert1 == true) { 
			  System.out.println(" Warning displayed");
		  } 
		
		
		Thread.sleep(7000);
		//driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[3]/button")).click(); // green login button
		
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div/button")).click();//  green verify otp
		
	
	}

	@Then("user navigate to Home page")
	public void user_navigate_to_home_page() throws InterruptedException {

		//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		driver.close();
	}
	
	///////////////////////////////////////////////////////////////
	
	
	
	@Given("User is on his Home Page")
	public void user_is_on_his_Home_page() throws IOException {
		FileInputStream ip = new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\login.properties");
		prop.load(ip);
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\selenium-java-4.1.2\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://unacademy.com/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("Registered mobaile enter")
	public void Registered_mobaile_enter() throws InterruptedException, IOException {
		FileInputStream ip = new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\login.properties");
		prop.load(ip);
		driver.findElement(By.xpath(prop.getProperty("loginbutton1"))).click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div[2]/div/input")).sendKeys("9359993917");
		
		  WebElement mob = driver.findElement(By.xpath(prop.getProperty("mobilenumber")));
		  mob.sendKeys("8755918349");
		 
		String fn=mob.getAttribute("value");
		  if (fn.length()<3 || fn.length()>15 ) { 
			  System.out.println(driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[3]/button")).isDisplayed());
			  
		  }
		  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[3]/button")).click();//green login2
		
		Thread.sleep(3000);
	}

	@When("enters OTP")
	public void enters_otp() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/form/div/input")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[2]/button")).click();
		Thread.sleep(3000);
	}

	@Then("successfully Logged in using mobile")
	public void successfully_Logged_in_using_mobile() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.close();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/div[3]/picture/img")).click();
		 Thread.sleep(3000);
		
		 //driver.findElement(By.xpath(prop.getProperty("logout"))).click();
		 
		 
	}
	
	
	   @Then("user succefully logout")
	   public void user_succefully_logout() throws InterruptedException, IOException
	{ 
		 
		   FileInputStream ip = new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\login.properties");
			prop.load(ip);
		  driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/div[3]/picture/img")).click();
		  //driver.findElement(By.xpath(prop.getProperty("profile"))).click();
		  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath(prop.getProperty("logout"))).click();
		  
		  Thread.sleep(3000); driver.close();
		 
		      
	   }
	   
	   
	   
	   
	  
		
		
		

		@Given("OTP is in on Registred mobile")
		public void otp_is_in_on_registred_mobile() throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\\\\\\\Selenium\\\\\\\\selenium-java-4.1.2\\\\\\\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.navigate().to("https://unacademy.com/");
			
			 FileInputStream ip = new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\login.properties");
				prop.load(ip);
			
			driver.findElement(By.xpath(prop.getProperty("loginbutton1"))).click();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			//driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div[2]/div/input")).sendKeys("9359993917");
			
			  WebElement mob = driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[2]/div/input"));
			  mob.sendKeys("8755918349");
			 
			String fn=mob.getAttribute("value");
			  if (fn.length()<3 || fn.length()>15 ) { 
				  System.out.println(driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[3]/button")).isDisplayed());
				  
			  }
			  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			  driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[3]/button")).click();//green login2
			
			Thread.sleep(3000);
			
		WebElement OTP = driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/form/div/input"));
				OTP.sendKeys("133000");
			
				
			//Thread.sleep(15000);
			
			
			driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[2]/button")).click();
			Thread.sleep(3000);
			
			boolean assert1 =  driver.getPageSource().contains("This OTP is not valid");
					
			if(assert1 == true) { 
				  System.out.println(" Warning displayed");
			  } 
			
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			System.out.println(driver.findElement(By.xpath(prop.getProperty("Resend_OTP"))).isDisplayed());
			//driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[2]/div/a[1]/h6"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}

		@When("click on Resend button")
		public void click_on_resend_button() throws InterruptedException {
			
			driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[2]/div/a[1]/h6")).click();	
			//Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			
		}
		
		@Then("user login successfully")
		public void user_login_successfully() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/form/div/input")).clear();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[2]/button")).click();
			
			Thread.sleep(6000);
			driver.close();
		   
		}

}
