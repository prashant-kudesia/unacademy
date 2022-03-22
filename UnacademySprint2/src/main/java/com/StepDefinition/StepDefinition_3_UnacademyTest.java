package com.StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
public class StepDefinition_3_UnacademyTest {
	
	public static WebDriver driver;
	Properties prop;
	
	SAXReader sr=new SAXReader();
	Document d = null;
	XSSFSheet sheet;
	public StepDefinition_3_UnacademyTest() throws IOException {
		prop=new Properties();
		FileInputStream fs=new FileInputStream("SearchFunctionality.properties");
		prop.load(fs);
		File g=new File("C:\\Users\\Prashant\\Desktop\\Capgemini Documents\\Module 3\\Eclipse workspace\\UnacademySprint2\\DataSource\\SearchInputs.xlsx");
		FileInputStream is = new FileInputStream(g);
		XSSFWorkbook w = new XSSFWorkbook(is);
		//HSSFWorkbook h = new HSSFWorkbook(is); -----    for xls format
		sheet = w.getSheetAt(0);
	}
	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\selenium-java-4.1.2\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://unacademy.com/");
	}

	@When("User enters mobilenumber")
	public void user_enters_mobile_no() throws IOException {
		driver.findElement(By.xpath(prop.getProperty("login"))).click();
		driver.findElement(By.xpath(prop.getProperty("mobilenumber_xpath"))).sendKeys("8755918349");
		driver.findElement(By.xpath(prop.getProperty("loginclick_xpath"))).click();
	}

	@When("User enter OTP")
	public void user_enter_otp() throws InterruptedException {
		Thread.sleep(15000);
	}

	@Then("User successfully Logged in")
	public void user_successfully_logged_in() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("verifyOTP_xpath"))).click();
		Thread.sleep(18000);	
	}
	@Given("user on Unacademy Page")
	public void user_on_unacademy_page() throws InterruptedException {
		//Thread.sleep(30000);
		WebElement Title = driver.findElement(By.xpath(prop.getProperty("homepage_title")));
		String ExpectedText = "Crack IITJEE, NEET Foundation & NTSE with India's largest learning platform";
		Assert.assertEquals(ExpectedText, Title.getText());
		System.out.println("No result found text is expected – Assert passed");			
	}

	@When("user clicks on search icon")
	public void user_clicks_on_search_icon() {
		driver.findElement(By.xpath(prop.getProperty("searchicon"))).click();
	}

	@Then("search icon should be appear in header part of the web page")
	public void search_icon_should_be_appear_in_header_part_of_the_web_page() {
	    
		if(driver.findElement(By.xpath(prop.getProperty("searchicon")))!=null) {
			System.out.println("Search icon appeared");
		}
		else {
			System.out.println("Search icon not appeared");
		}
		driver.quit();
	}

	@Given("search")
	public void search() {
		if(driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/a/div/span/img"))!=null) {
			System.out.println("User is on Home page");
		}
		else {
			System.out.println("User is not on Home page");
		}
	}

	@When("user enters to the home page")
	public void user_enters_to_the_home_page() {
		System.out.println("When Block");
	}

	@Then("Search bar should be appear")
	public void search_bar_should_be_appear() {
	    driver.findElement(By.xpath("//div[@class='css-xg2sdt-SearchIconContainer ed9web90']//*[name()='svg']")).click();
		if(driver.findElement(By.xpath("//*[@id=\"searchTab\"]/div[1]"))!=null) {
			System.out.println("Search bar appeared");
		}
		else {
			System.out.println("Search bar not appeared");
		}
		driver.quit();
	}
	@Given("user on home page")
	public void user_on_home_page() {
		if(driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/a/div/span/img"))!= null)
        {
            System.out.println("User is on Home page of Unacademy");
        }
        else
        {
            System.out.println("User is not on Home page of Unacademy");
        }
	}

	@When("user clicks on search bar")
	public void user_clicks_on_search_bar() {
		driver.findElement(By.xpath("//div[@class='css-xg2sdt-SearchIconContainer ed9web90']//*[name()='svg']")).click();	
	}

	@When("user enters course name as <{string}>")
	public void user_enters_course_name_as(String courseName) throws IOException {
		String course=sheet.getRow(1).getCell(0).getStringCellValue();
		//String input= d.selectSingleNode().getText();
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys(course);
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys(Keys.ENTER);
	}

	@Then("relevant course should appear")
	public void relevant_course_should_appear() throws InterruptedException {
		Thread.sleep(6000);
	    driver.quit();
	}
	
	
	@When("user enters educator name as <{string}>")
	public void user_enters_educator_name_as(String educatorname) {
		String educator=sheet.getRow(2).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys(educator);
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys(Keys.ENTER);
	}

	@Then("relevant educators profile should appear")
	public void relevant_educators_profile_should_appear() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("//div[@class='css-11r672d-AuthorName e11f8e9u7']"))!=null) {
			System.out.println("Educators profile displayed");
		}
		else {
			System.out.println("Educators profile not displayed");
		}
		driver.quit();
	}

	@When("user enters lesson name as <{string}>")
	public void user_enters_lesson_name_as(String lessonname) {
	    // Write code here that turns the phrase above into concrete actions
		String lesson=sheet.getRow(3).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys(lesson);
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys(Keys.ENTER);
	}

	@Then("relevant lesson should appear")
	public void relevant_lesson_should_appear() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[3]/div/div/div/div/div[1]/a/h4"))!=null) {
			System.out.println("lesson displayed");
		}
		else {
			System.out.println("lesson not displayed");
		}
		driver.quit();
	}

	@When("user enters syllabus name as <{string}>")
	public void user_enters_syllabus_name_as(String syllabusname) {
	    String syllabus=sheet.getRow(4).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys(syllabus);
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys(Keys.ENTER);
	}

	@Then("relevant syllabus should appear when text is search by user")
	public void relevant_syllabus_should_appear_when_text_is_search_by_user() throws InterruptedException {
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("//h4[@class='css-li9o9n-H4-StyH4 evbdemu2']"))!=null) {
			System.out.println("syllabus displayed");
		}
		else {
			System.out.println("syllabus not displayed");
		}
		driver.quit();
	}

	@When("user enters test series name as <{string}>")
	public void user_enters_test_series_name_as(String testseries) {
	    String test=sheet.getRow(5).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys(test);
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys(Keys.ENTER);
	}

	@Then("relevant test series should displayed on test page")
	public void relevant_test_series_should_displayed_on_test_page() throws InterruptedException {
	    Thread.sleep(5000);
		if(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[3]/div/div[1]/a"))!=null) {
			System.out.println("testseries displayed");
		}
		else {
			System.out.println("testseries not displayed");
		}
		driver.quit();
	}
	
	@When("user clicks on search bar to check trending results")
	public void user_clicks_on_search_bar_to_check_trending_results() {
	    driver.findElement(By.xpath("//div[@class='css-xg2sdt-SearchIconContainer ed9web90']//*[name()='svg']")).click();
	}

	@Then("appearance of trending screen after cliking on search bar")
	public void appearance_of_trending_screen_after_cliking_on_search_bar() {
	    if (driver.findElement(By.xpath("//h6[@class='css-12bpp4-H6-Recent-Trending e1esuigg0']"))!=null) {
			System.out.println("trending list displayed");
		}
		else {
			System.out.println("trending screen not appeared");
		}
		driver.quit();
	}
	

	@When("user enters search text")
	public void user_enters_search_text() {
		driver.findElement(By.xpath("//div[@class='css-xg2sdt-SearchIconContainer ed9web90']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Neeraj ");
	}

	@Then("appearance of suggestion items list")
	public void appearance_of_suggestion_items_list() throws InterruptedException {
	    Thread.sleep(5000);
		if (driver.findElement(By.xpath("//*[@id=\"searchTab\"]/div[2]/div/div/a[2]/div"))!=null) {
			System.out.println("Suggession list displayed");
		}
		else {
			System.out.println("Suggessions not appeared");
		}
		driver.quit();
	}
	@When("user clicks on Add another goal")
	public void user_clicks_on_add_another_goal() {
		driver.findElement(By.xpath("//div[@class='css-pcfw1c-TooltipAction e18h3d5s2']")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/div/div/li[2]/p")).click();
	}

	@When("user search goal in competative exam as <{string}>")
	public void user_search_goal_in_competative_exam_as(String goal) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div/div/div/div[2]/div/input")).sendKeys(goal);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div/div/div/div[2]/div/input")).sendKeys(Keys.ENTER);
	}

	@Then("relevant goals should appear")
	public void relevant_goals_should_appear() throws InterruptedException {
		Thread.sleep(3000);
	    if(driver.findElement(By.xpath("//*[@id=\"UQFJD-competitive\"]/div/div[1]/div[2]/p[1]/span[2]/span"))!=null) {
	    	System.out.println("Goals displayed");
	    }
	    else {
	    	System.out.println("Relevant goal not appeared");
	    }
	}
	
	@When("user enters text as <{string}>")
	public void user_enters_text_as(String data) throws InterruptedException {
	   	Thread.sleep(5000);
	   	driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys(data);
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys(Keys.ENTER);
	}
	@Then("Error message should be displayed on screen")
	public void error_message_should_be_displayed_on_screen() throws InterruptedException {
		Thread.sleep(5000);
		WebElement NoData = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/h3"));
		String ExpectedText = "No result found";
		Assert.assertEquals(ExpectedText, NoData.getText());
		System.out.println("No result found text is expected – Assert passed");
	}
	
}
