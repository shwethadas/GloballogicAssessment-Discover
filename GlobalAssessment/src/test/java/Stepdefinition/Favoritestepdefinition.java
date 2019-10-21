package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testing.practise.GlobalAssessment.Actionclass;
import com.testing.practise.GlobalAssessment.favouritepageclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Favoritestepdefinition {
	
	
	WebDriver drv= new ChromeDriver();
	favouritepageclass page = new favouritepageclass(drv);
	Actionclass act = new Actionclass();
	JavascriptExecutor js = (JavascriptExecutor) drv;
	
	@Given("Navigate to  Discovery channel Application")
	public void navigate_to_Discovery_channel_Application() {
		drv.get("https://go.discovery.com");
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,1000)");
	}

	@When("Select “See All Shows” available in “Shows” tab")
	public void select_See_All_Shows_available_in_Shows_tab() throws InterruptedException {
		
	    page.clickshows();
	    page.clickseeallshows();
	}

	@When("Select the show which contain Apollo")
	public void select_the_show_which_contain_Apollo() {
		js.executeScript("window.scrollBy(0,2000)");
		page.clickonapolloimage();
	   
	}

	@Then("Verify the favourite status is displayed or not")
	public void verify_the_favourite_status_is_displayed_or_not() {
		
		page.Isstatusbuttonexists();
	   
	}

	@When("Click on favourite Icon")
	public void click_on_favourite_Icon() {
		page.Clickonstatusicon();
	    
	}
	@When("Click on menu Icon")
	public void click_on_menu_Icon() {
	    page.clickonmenu();
	}
	@When("Click on My Videos")
	public void click_on_My_Videos() {
		page.clickonMyvideos();
	    
	}

	@Then("Verify favorite or unfavorite titles under “FAVORITE SHOWS” is displayed or not")
	public void verify_favorite_or_unfavorite_titles_under_FAVORITE_SHOWS_is_displayed_or_not() {
	   page.Isfavouriteshowexists();
	}

	@When("Close the Application")
	public void close_the_Application() {
	    drv.close();
	}


}
