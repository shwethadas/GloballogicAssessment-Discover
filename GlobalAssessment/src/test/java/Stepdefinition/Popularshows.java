package Stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testing.practise.GlobalAssessment.Actionclass;
import com.testing.practise.GlobalAssessment.favouritepageclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Popularshows {
	
	WebDriver drv= new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) drv;
	Actionclass act = new Actionclass();
	
	@Given("Login into Discovery channel Application")
	public void navigate_to_Discovery_channel_Application() {
		drv.get("https://go.discovery.com");
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@When("Scroll down to Popular Shows")
	public void scroll_down_to_Popular_Shows() throws InterruptedException {
	  // WebElement ele = drv.findElement(By.xpath("//*[@id=\"react-root\"]/div/div[1]/section[9]/div/div[1]/h2"));
	   WebElement Element= drv.findElement(By.className("popularShowsCarousel__header"));
	   js.executeScript("arguments[0].scrollIntoView();", Element);
	   Thread.sleep(2000);
	   act.CheckElementExists(Element);
	   
	}

	@When("Click on the last video by pressing the icon right arrow")
	public void click_on_the_last_video_by_pressing_the_icon() throws InterruptedException {
	   WebElement arrow = drv.findElement(By.xpath("//*[@id=\"react-root\"]/div/div[1]/section[9]/div/div[1]/div[1]/div/div[1]/div[2]/div"));
	   arrow.click();
	   WebElement ele = drv.findElement(By.xpath("//*[@id=\"react-root\"]/div/div[1]/section[9]/div/div[1]/div[1]/div/div[1]/div[3]/div/i"));
	   ele.click();
	   ele.click();
} 
	 


	@When("Click on Explore the Show")
	public void click_on_Explore_the_Show() throws InterruptedException {
		
		WebElement explore = drv.findElement(By.xpath("//*[@id=\"react-root\"]/div/div[1]/section[9]/div/div[1]/div[1]/div/div[1]/div[2]/div[4]/div"));
		explore.click();
		Thread.sleep(3000);
		
	    
	}

	@When("Click on Show More")
	public void click_on_Show_More() {
	   WebElement showmore = drv.findElement(By.xpath("//*[@id=\"react-root\"]/div/div[1]/main/section[2]/div/ul/li[4]/button"));
	   showmore.click();
	}

	@Then("Check list of shows are displayed")
	public void check_list_of_shows_are_displayed() {
		WebElement shows = drv.findElement(By.xpath("//*[@id=\"react-root\"]/div/div[1]/main/section[2]/div/ul/li[1]/div[1]/div[1]/div/a/div[2]"));
		shows.isDisplayed();
	    
	}
   @When("Create a file and write all the show titles and duration into it")
	public void create_a_file_and_write_all_the_show_titles_and_duration_into_it() {
	   String filePath = System.getProperty("user.dir");
	   String filename = null;
	File file = new File(filePath + "\\" + filename);
	   try {
           if (!file.exists()) {
               file.createNewFile();
               System.out.println("File is created");
           } else {
               System.out.println("File already exist");
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
	}

   @When("quite the Application")
   public void quite_the_Application() {
       drv.close();
   }
}
