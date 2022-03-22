package com.StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_4_UnacademyTest {
	

	public static WebDriver driver;
	static Properties prop=new Properties();
	SAXReader sr=new SAXReader();
	Document d = null;
	
	@Given("User is in the Login Page")
public void user_is_in_the_login_page() throws Exception {
		FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
		prop.load(ip);
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\selenium-java-4.1.2\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.navigate().to("https://unacademy.com/");
	driver.manage().window().maximize();
}

@When("User enters mobile_no")
public void user_enters_mobile_no() throws Exception {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	
	File g=new File("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\DataSource\\data.xlsx");
	FileInputStream is = new FileInputStream(g);
	XSSFWorkbook w = new XSSFWorkbook(is);
	//HSSFWorkbook h = new HSSFWorkbook(is); -----    for xls format
	XSSFSheet sheet = w.getSheetAt(0);
	//String mobile_no=sheet.getRow(1).getCell(0).getStringCellValue();
	
	DataFormatter formatter = new DataFormatter();
	String mobile_number = formatter.formatCellValue(sheet.getRow(1).getCell(0));
	
	driver.findElement(By.xpath(prop.getProperty("loginbutton_xpath"))).click();
	driver.findElement(By.xpath(prop.getProperty("mobilenumber_xpath"))).sendKeys(mobile_number);
	driver.findElement(By.xpath(prop.getProperty("loginclick_xpath"))).click();
}

@When("User enters OTP")
public void user_enters_otp() throws InterruptedException {
	Thread.sleep(15000);
}

@Then("User is successfully Logged in")
public void user_is_successfully_logged_in() throws InterruptedException, IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	driver.findElement(By.xpath(prop.getProperty("verifyOTP_xpath"))).click();
	Thread.sleep(5000);
}

//goals drop down

@Given("User is on Unacademy Home page")
public void user_is_on_unacademy_home_page() throws Exception {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	if(driver.findElement(By.xpath(prop.getProperty("unacademyLogo_xpath")))!= null)
	{
		System.out.println("User is on Home page of Unacademy");
	}
	else
	{
		System.out.println("User is not on Home page of Unacademy");
	}
}

@When("User click on drop down list button")
public void user_click_on_drop_down_list_button() throws InterruptedException, Exception {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	driver.findElement(By.xpath(prop.getProperty("OkGotIt_xpath"))).click();
	Thread.sleep(2000); 
	driver.findElement(By.xpath(prop.getProperty("dropdownlist_xpath"))).click();
   Thread.sleep(4000);
   }

@Then("Drop down list will appear on the page")
public void drop_down_list_will_appear_on_the_page() {
    driver.quit();
}

@When("User click on edit link to change the list")
public void user_click_on_edit_link_to_change_the_list() throws InterruptedException, Exception {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	driver.findElement(By.xpath(prop.getProperty("OkGotIt_xpath"))).click();
	Thread.sleep(2000); 
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement dropdown=wait.until(ExpectedConditions.elementToBeClickable (By.xpath(prop.getProperty("dropdownlist_xpath"))));
	dropdown.click();
	WebElement edit=wait.until(ExpectedConditions.elementToBeClickable (By.xpath(prop.getProperty("edit_xpath"))));
	edit.click();
}

@Then("Drop down list will appear on the page with editable options")
public void drop_down_list_will_appear_on_the_page_with_editable_options() throws Exception {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	  driver.findElement(By.xpath(prop.getProperty("done_xpath"))).click();
	  driver.quit();
}

@When("User click on Course name from the list")
public void user_click_on_course_name_from_the_list() throws InterruptedException, Exception {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	driver.findElement(By.xpath(prop.getProperty("OkGotIt_xpath"))).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(prop.getProperty("dropdownlist_xpath"))).click();
	driver.findElement(By.xpath(prop.getProperty("coursename_xpath"))).click();
}

@Then("User will redirect to that course page")
public void user_will_redirect_to_that_course_page() {
    driver.quit();
}


// Free live class feature//

@When("User scroll down to free live class link")
public void user_scroll_down_to_free_live_class_link() throws InterruptedException, IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	driver.findElement(By.xpath(prop.getProperty("OkGotIt_xpath"))).click();
	Thread.sleep(5000);
}

@When("User click on see all link")
public void user_click_on_see_all_link() throws IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	WebElement freeliveclass = driver.findElement(By.xpath(prop.getProperty("freeliveclass_xpath")));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", freeliveclass);
}

@Then("User lands on the free live classes of that course")
public void user_lands_on_the_free_live_classes_of_that_course() {
   driver.quit();
}

//Achievement Story

@Given("User is on Unacademy Home Page")
public void user_is_on_unacademy_home_page1() throws IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	if(driver.findElement(By.xpath(prop.getProperty("unacademyLogo_xpath")))!= null)
	{
		System.out.println("User is on Home page of Unacademy");
	}
	else
	{
		System.out.println("User is not on Home page of Unacademy");
	}
}

@When("User scroll down to achivement story and click on watch button")
public void user_scroll_down_to_achivement_story_and_click_on_watch_button() throws InterruptedException, IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	driver.findElement(By.xpath(prop.getProperty("OkGotIt_xpath"))).click();
	Thread.sleep(5000);
	String t = "Celebrating our achievers";
    if ( driver.getPageSource().contains("Celebrating our achievers"))
    {
       System.out.println("Text: " + t + " is present. ");
    } 
    else 
    {
       System.out.println("Text: " + t + " is not present. ");
    }
    WebElement achivement = driver.findElement(By.xpath(prop.getProperty("watchbutton_xpath")));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", achivement);
	
}

@Then("User will see the story of achiever of that course")
public void user_will_see_the_story_of_achiever_of_that_course() {
    driver.quit();
}

//batch details


@When("User scroll down to Batches name and clicks on batch name")
public void user_scroll_down_to_batches_name_and_clicks_on_batch_name() throws InterruptedException, IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	driver.findElement(By.xpath(prop.getProperty("OkGotIt_xpath"))).click();
	Thread.sleep(5000);
	String t = "Batches for syllabus completion";
    if ( driver.getPageSource().contains("Celebrating our achievers"))
    {
       System.out.println("Text: " + t + " is present. ");
    } 
    else 
    {
       System.out.println("Text: " + t + " is not present. ");
    }
    WebElement batch_details = driver.findElement(By.xpath(prop.getProperty("batchdetail_xpath"))); 
	JavascriptExecutor jse = (JavascriptExecutor)driver;  
	jse.executeScript("arguments[0].click()", batch_details);
}

@Then("User batch detail of the course will populate")
public void user_batch_detail_of_the_course_will_populate() {
    driver.quit();
}

//upcoming class

@When("User scroll down to upcoming batches")
public void user_scroll_down_to_upcoming_batches() throws InterruptedException, IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	driver.findElement(By.xpath(prop.getProperty("OkGotIt_xpath"))).click();
	Thread.sleep(5000);
	String t = "Courses starting soon";
    if ( driver.getPageSource().contains("Courses starting soon"))
    {
       System.out.println("Text: " + t + " is present. ");
    } 
    else 
    {
       System.out.println("Text: " + t + " is not present. ");
    }
}

@Then("upcoming batch detail of the course will populate")
public void upcoming_batch_detail_of_the_course_will_populate() {
    driver.quit();
}

@When("User scroll down to upcoming batches and click on batch name")
public void user_scroll_down_to_upcoming_batches_and_click_on_batch_name() throws InterruptedException, IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	driver.findElement(By.xpath(prop.getProperty("OkGotIt_xpath"))).click();
	Thread.sleep(5000);
    WebElement upcoming = driver.findElement(By.xpath(prop.getProperty("upcoming_xpath")));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", upcoming);
}

@Then("User will see the upcoming batche available")
public void user_will_see_the_upcoming_batche_available() {
	 driver.quit();
}

//recently

@When("User scroll down to recently started batches")
public void user_scroll_down_to_recently_started_batches() throws InterruptedException, IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	driver.findElement(By.xpath(prop.getProperty("OkGotIt_xpath"))).click();
	Thread.sleep(5000);
	String t = "Recently started courses";
    if ( driver.getPageSource().contains("Recently started courses"))
    {
       System.out.println("Text: " + t + " is present. ");
    } 
    else 
    {
       System.out.println("Text: " + t + " is not present. ");
    }
}

@Then("recently started batch detail of the course will populate")
public void recently_started_batch_detail_of_the_course_will_populate() {
	 driver.quit();
}

@When("User scroll down to recently started batches and User click on batch name")
public void user_scroll_down_to_recently_started_batches_and_user_click_on_batch_name() throws InterruptedException, IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	driver.findElement(By.xpath(prop.getProperty("OkGotIt_xpath"))).click();
	Thread.sleep(5000);
    WebElement recently = driver.findElement(By.xpath(prop.getProperty("recently_xpath")));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", recently);
}

@Then("User will see the recently started batches available")
public void user_will_see_the_recently_started_batches_available() {
	 driver.quit();
}

//mock 

@When("User scroll down to Track your preparation  and User click on Mock test")
public void user_scroll_down_to_track_your_preparation_and_user_click_on_mock_test() throws InterruptedException, IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	driver.findElement(By.xpath(prop.getProperty("OkGotIt_xpath"))).click();
	Thread.sleep(5000);
	String t = "Track your preparation";
    if ( driver.getPageSource().contains("Track your preparation"))
    {
       System.out.println("Text: " + t + " is present. ");
    } 
    else 
    {
       System.out.println("Text: " + t + " is not present. ");
    }
    WebElement mock = driver.findElement(By.xpath(prop.getProperty("mocktest_xpath")));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", mock);
}

@Then("mock test will apperas")
public void mock_test_will_apperas() {
    driver.quit();
}

@Then("mock test will appers  and user must see number of test and date of test")
public void mock_test_will_appers_and_user_must_see_number_of_test_and_date_of_test() throws IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	String t = "Tests";
    if ( driver.getPageSource().contains("Tests"))
    {
       System.out.println("Text: " + t + " is present. ");
    } 
    else 
    {
       System.out.println("Text: " + t + " is not present. ");
    }
    driver.quit();
}

//batch schedule


@When("User scroll down to batch names and User click on batch name")
public void user_scroll_down_to_batch_names_and_user_click_on_batch_name() throws InterruptedException, IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	driver.findElement(By.xpath(prop.getProperty("OkGotIt_xpath"))).click();
	Thread.sleep(5000);
	WebElement batchname = driver.findElement(By.xpath(prop.getProperty("batchname_xpath")));
	JavascriptExecutor jse = (JavascriptExecutor)driver;  
	jse.executeScript("arguments[0].click()", batchname);
	
}

@Then("batch schedule will appears")
public void batch_schedule_will_appears() {
	String t = "Schedule";
    if ( driver.getPageSource().contains("Schedule"))
    {
       System.out.println("Text: " + t + " is present. ");
    } 
    else 
    {
       System.out.println("Text: " + t + " is not present. ");
    }
    driver.quit();
}

@Then("batch schedule will appears with all the topics")
public void batch_schedule_will_appears_with_all_the_topics() throws IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	String t = "Topics Covered";
    if ( driver.getPageSource().contains("Topics Covered"))
    {
       System.out.println("Text: " + t + " is present. ");
    } 
    else 
    {
       System.out.println("Text: " + t + " is not present. ");
    }
    driver.quit();
}

@Then("review of course will populate")
public void review_of_course_will_populate() throws IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	String t = "6,50,000+ learners trust Unacademy";
    if ( driver.getPageSource().contains("6,50,000+ learners trust Unacademy"))
    {
       System.out.println("Text: " + t + " is present. ");
    } 
    else 
    {
       System.out.println("Text: " + t + " is not present. ");
    }
    driver.quit();
}

//frequently asked question

@When("User scroll down and click the batch names and then click on frequently asked question")
public void user_scroll_down_and_click_the_batch_names_and_then_click_on_frequently_asked_question() throws InterruptedException, IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	driver.findElement(By.xpath(prop.getProperty("OkGotIt_xpath"))).click();
	Thread.sleep(5000);
	WebElement batchname = driver.findElement(By.xpath(prop.getProperty("batchname_xpath")));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", batchname);
}

@Then("User will see questions")
public void user_will_see_questions() {
	String t = "Frequently asked questions";
    if ( driver.getPageSource().contains("Frequently asked questions"))
    {
       System.out.println("Text: " + t + " is present. ");
    } 
    else 
    {
       System.out.println("Text: " + t + " is not present. ");
    }
    driver.quit();
}

@Then("User will see questions in list on the same page")
public void user_will_see_questions_in_list_on_the_same_page() {
	driver.quit();
}

//preview video


@When("User scroll down to batch names and click on batch name")
public void user_scroll_down_to_batch_names_and_click_on_batch_name() throws InterruptedException, IOException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\CourseLearning.properties");
	prop.load(ip);
	driver.findElement(By.xpath(prop.getProperty("OkGotIt_xpath"))).click();
	Thread.sleep(5000);
	WebElement batchname = driver.findElement(By.xpath(prop.getProperty("batchname_xpath")));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", batchname);
}


@Then("User will see preview video on left side of page")
public void user_will_see_preview_video_on_left_side_of_page() {
	String t = "PREVIEW";
    if ( driver.getPageSource().contains("PREVIEW"))
    {
       System.out.println("Text: " + t + " is present. ");
    } 
    else 
    {
       System.out.println("Text: " + t + " is not present. ");
    }
    driver.quit();
}

//share

@Then("User will see share button on the page")
public void user_will_see_share_button_on_the_page() {
	String t = "Share";
    if ( driver.getPageSource().contains("Share"))
    {
       System.out.println("Text: " + t + " is present. ");
    } 
    else 
    {
       System.out.println("Text: " + t + " is not present. ");
    }
    driver.quit();
}

@Then("User will click and share course")
public void user_will_click_and_share_course() {
   driver.quit();
}
	

}