package com.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class StepDefinition_5_UnacademyTest {
	
	public static WebDriver driver;
	Properties prop=new Properties();

	@When("User enter mobile_no")
	public void user_enter_mobile_no() throws InterruptedException, IOException {
		FileInputStream files=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\subsciption.properties");
		
		prop.load(files);
		
		System.out.println(prop.getProperty("login"));
		driver.findElement(By.xpath(prop.getProperty("login"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(prop.getProperty("mobileNo"))).sendKeys("8755918349");
		Thread.sleep(10000);
		driver.findElement(By.xpath(prop.getProperty("LogIn"))).click();
		Thread.sleep(10000);
	}
	
	@Given("User is in selected course page")
	public void user_is_in_selected_course_page() {
	    // Write code here that turns the phrase above into concrete actions
	    if(driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/a/div/span/img"))!= null)
		{
			System.out.println("User is on Home page of Unacademy");
		}
		else
		{
			System.out.println("User is not on Home page of Unacademy");
		}
	}
	@When("User able to see get subscription button")
	public void user_able_to_see_get_subscription_button() {
	    // Write code here that turns the phrase above into concrete actions
		if(driver.findElement(By.xpath("//*[@id=\"preSubscribedBlocks\"]/div[1]/button"))!= null)
			
		{
			System.out.println("Subscription button is visible");
		}
		else
		{
			System.out.println("Subscription button is not visible");
		}
	    
	}
	@When("User click on subcription button")
	public void user_click_on_subcription_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"preSubscribedBlocks\"]/div[1]/button")).click();
	  
	}
	@Then("Users page is redirected to next page")
	public void users_page_is_redirected_to_next_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		if(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/h5"))!=null)
	   {
		   System.out.println("Page is redirected");
	   }
	   else
	   {
		   System.out.println("Page is not redirected");
	   }
		driver.quit();
		
	    }
	

	
	@Given("User is on subscription type page")
	public void user_is_on_subscription_type_page() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"preSubscribedBlocks\"]/div[1]/button")).click();
		Thread.sleep(10000);
	}
	@When("plus subsciption type is visible")
	public void plus_subsciption_type_is_visible() {
	    if(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[1]/div[1]/h2"))!=null)
	    {
	    	System.out.println("plus subsciption type is visible");
	    }
	    else
	    {
	    	System.out.println("plus subsciption type is not visible");

	    }
	}
	@When("User click on Plus button")
	public void user_click_on_plus_button() throws InterruptedException {
		Thread.sleep(10000);
	   driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[3]")).click();
	 
	}
	@Then("user  is successfully selected Plus subscription type")
	public void user_is_successfully_selected_plus_subscription_type() {
	    if(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]"))!=null)
	    {
	    	System.out.println("user  is successfully selected Plus subscription type");
	    }
	    else
	    {
	    	System.out.println("user  is not selected Plus subscription type");

	    }
	    driver.quit();
	}
	
	@When("iconic subsciption type is visible")
	public void iconic_subsciption_type_is_visible() 
	{
		
		if(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[4]/div[1]/div[1]/h2"))!=null)
	    {
	    	System.out.println("Iconic subsciption type is visible");
	    }
	    else
	    {
	    	System.out.println("Iconic subsciption type is not visible");

	    }
		
	   
	}
	@When("User click on Iconic button")
	public void user_click_on_iconic_button() throws InterruptedException 
	{
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[4]/div[3]/button[1]")).click();
	    
	}
	@Then("user  is successfully selected iconic subscription type")
	public void user_is_successfully_selected_iconic_subscription_type()
	{
		 if(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]"))!=null)
		    {
		    	System.out.println("user  is successfully selected Iconic subscription type");
		    }
		    else
		    {
		    	System.out.println("user  is not selected Iconic subscription type");

		    }
	    driver.quit();
	}
	
	@Given("User is on selected subcription type page")
	public void user_is_on_selected_subcription_type_page() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"preSubscribedBlocks\"]/div[1]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[4]/div[3]/button[1]")).click();
	}
	@When("User click on view all plans")
	public void user_click_on_view_all_plans() throws InterruptedException 
	{
		Thread.sleep(10000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[3]/div[5]/button")).click();
	}
	@Then("All plans should be visible")
	public void all_plans_should_be_visible() 
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[3]")).click();
		driver.quit();
	}

	@Given("User is able to see all plans for")
	public void user_is_able_to_see_all_plans_for() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"preSubscribedBlocks\"]/div[1]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[4]/div[3]/button[1]")).click();
	
	}
	@When("User select period for subcsription")
	public void user_select_period_for_subcsription() 
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[3]/div[2]")).click();
	}
	@Then("Duration should be selected sucessfully")
	public void duration_should_be_selected_sucessfully() 
	{
	    System.out.println("Duration should be selected sucessfully");
	    driver.quit();
	}
	@Given("User is selected plan for subsciption plan")
	public void user_is_selected_plan_for_subsciption_plan() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"preSubscribedBlocks\"]/div[1]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[4]/div[3]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[3]/div[2]")).click();

	}
	@When("User enter referral code")
	public void user_enter_referral_code() 
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[4]/div/div[2]/div/input")).sendKeys("Save10");

	}
	@When("user click on apply")
	public void user_click_on_apply()
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[4]/div/div[2]/div/div")).click();

	}
	@Then("User code accpeted sucessfully")
	public void user_code_accpeted_sucessfully() throws InterruptedException
	{
		Thread.sleep(10000);
		String test=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[4]/p")).getText();
		
		System.out.println(test);
		driver.quit();
	}


 
	@Given("User is on Pay option page")
	public void user_is_on_pay_option_page() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"preSubscribedBlocks\"]/div[1]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[4]/div[3]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[3]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[4]/div/div[2]/div/input")).sendKeys("Save10");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[4]/div/div[2]/div/div")).click();
		Thread.sleep(10000);

	}
	@When("User click on proceed to pay button")
	public void user_click_on_proceed_to_pay_button() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[4]/div/button")).click();
		Thread.sleep(10000); 
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[3]/div/button")).click();
		Thread.sleep(10000);

	}
	@Then("it redirected to the payment page")
	public void it_redirected_to_the_payment_page()
	{
		if(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]"))!=null)
		{
			System.out.println("User is on payment page");
		}
		else
		{
			System.out.println("User is not on payment page");
		}
		driver.quit();
	}
	@Given("User is on payment page")
	public void user_is_on_payment_page() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"preSubscribedBlocks\"]/div[1]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[4]/div[3]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[3]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[4]/div/div[2]/div/input")).sendKeys("Save10");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[4]/div/div[2]/div/div")).click();
		Thread.sleep(10000); 
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[4]/div/button")).click();
		Thread.sleep(10000);

	}
	@When("User click on change duration button")
	public void user_click_on_change_duration_button() 
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[2]/div[1]/div[1]/p")).click();
		

	}
	@Then("it redirected sucessfully to the subscription plan page")
	public void it_redirected_sucessfully_to_the_subscription_plan_page() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[3]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[3]/div[3]/div")).click();
		driver.quit();
	}
	public String payment;
	@Given("User is on the payment page")
	public void user_is_on_the_payment_page() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"preSubscribedBlocks\"]/div[1]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[4]/div[3]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[3]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[4]/div/div[2]/div/input")).sendKeys("Save10");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[4]/div/div[2]/div/div/h6")).click();
		Thread.sleep(10000); 
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[4]/div/button")).click();
		Thread.sleep(10000);
		payment=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/span")).getText();

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[3]/div/button")).click();
		Thread.sleep(10000);
	}
	@When("User Choose any one method for payment")
	public void user_choose_any_one_method_for_payment() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/p")).click();
	}
	@Then("payment option should be open sucessfully")
	public void payment_option_should_be_open_sucessfully() {
		if(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]"))!=null)
		{
			System.out.println("User is selected pay in parts option");
		}
		else
		{
			System.out.println("User is not selected pay in parts option");
		}
	}
	@When("the total amount of subscription is visible")
	public void the_total_amount_of_subscription_is_visible() {
		if(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div/div[3]/div[2]/span"))!=null)
				{
			System.out.println("the total amount of subscription is visible");
				}
		else
		{
			System.out.println("the total amount of subscription is visible");

		}
		

	}
	@Then("amount displayed sucessfully")
	public void amount_displayed_sucessfully() {
		String finalPayment=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div/div[3]/div[2]/span")).getText();
		if(payment==finalPayment)
		{
			System.out.println("Payent Should be displayed sucessfully");
		}
		driver.quit();
	}
	@Given("user is on choose payment method page")
	public void user_is_on_choose_payment_method_page() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div/button[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"preSubscribedBlocks\"]/div[1]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[4]/div[3]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[3]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[4]/div/div[2]/div/input")).sendKeys("Save10");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[4]/div/div[2]/div/div/h6")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[4]/div/button")).click();
		Thread.sleep(10000);
		payment=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/span")).getText();

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[3]/div/button")).click();
		Thread.sleep(10000);
		
	}
	@When("User choose pay in parts option")
	public void user_choose_pay_in_parts_option() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/p")).click();

	}
	@Then("it open sucessfully")
	public void it_open_sucessfully() {
		if(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]"))!=null)
		{
			System.out.println("User is selected pay in parts option");
		}
		else
		{
			System.out.println("User is not selected pay in parts option");
		}
		driver.quit();
	}
	@When("User click on cards option")
	public void user_click_on_cards_option() throws InterruptedException {
		//driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div/div[1]/div[3]/p")).click();
		//driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div/div[1]/div[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div/div[1]/div[6]/p")).click();
		Thread.sleep(10000);
	}
	@When("User enters  card number")
	public void user_enters_card_number() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//FileInputStream files=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Sprint2Unacademy\\src\\test\\java\\com\\testDefinition\\subsciption.properties");
		
		//prop.load(files);
		WebElement cardNo = driver.findElement(By.xpath("//*[@id=\"card_number\"]"));
		cardNo.sendKeys("4712878106442338");
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].sendKeys(\"4712878106442338\")", cardNo);
		
		//driver.findElement(By.xpath("cardNumber")).sendKeys("4712878106442338");

	}
	@When("User the validity of the card")
	public void user_the_validity_of_the_card() throws IOException {
		FileInputStream files=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\subsciption.properties");
		
		prop.load(files);
		driver.findElement(By.xpath("expMonth")).sendKeys("09");
		driver.findElement(By.xpath("expYear")).sendKeys("22");
		driver.findElement(By.xpath("ccv")).sendKeys("109");

	}
	@When("user enter name of card")
	public void user_enter_name_of_card() throws IOException {
		FileInputStream files=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\subsciption.properties");
		
		prop.load(files);
		driver.findElement(By.xpath("cardName")).sendKeys("Bank of Maharshtra");
		
	}
	@When("User click on pay button")
	public void user_click_on_pay_button() {
	    //driver.findElement(By.xpath("//*[@id=\"payment_form_new_card_1\"]/button")).click();	
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/button")).click();
	}
		@Then("user click on pay button successfully")
	public void user_click_on_pay_button_successfully() {
	  /* if(driver.findElement(By.xpath("/html/body"))!=null)
	   {
		   System.out.println("user click on pay button successfully");
	   }
	   else
	   {
		   System.out.println("user is not click on pay button");
	   }*/
	   driver.quit();
	}
}
