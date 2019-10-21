package com.testing.practise.GlobalAssessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class favouritepageclass {
	WebDriver drv;
	Actionclass act = new Actionclass();
	@FindBy(xpath = "//*[@id=\"react-root\"]/div/div[1]/div[2]/header/div[2]/div/nav/ul/li[2]/span")
	WebElement shows;
	
	@FindBy(xpath = "//*[@id=\"show-drop-desktop\"]/ul/li[12]/div/a")
	WebElement Seealltheshows;
	
	@FindBy(xpath="//*[@id=\"react-root\"]/div/div[1]/main/section/div/div[2]/div[26]/div/a/div/div[1]/picture/img")
	WebElement ClickonApolloImage;
	
	@FindBy(xpath="//*[@id=\"react-root\"]/div/div[1]/main/section[1]/div/div[1]/div[2]/div[1]/span/i")
	WebElement Statusbutton;
	
	@FindBy(xpath="//*[@id=\"react-root\"]/div/div[1]/div[2]/header/div[2]/div/nav/ul/li[6]")
	WebElement MenuButton;
	
	@FindBy(xpath="//*[@id=\"react-root\"]/div/div[1]/div[2]/header/nav/div[2]/div/div/div[2]/div[2]/ul/li[4]/a/span")
	WebElement MyVidoesButton;
	
	@FindBy(xpath="//*[@id=\"react-root\"]/div/div[1]/main/div/div[1]/section[4]/div/div/div/div[1]/div/div")
	
	WebElement Favoriteshows;
	
	public favouritepageclass(WebDriver drv)
	{
		this.drv=drv;
		PageFactory.initElements(drv, this);
		
	}
	
	public void clickshows()
	{
		shows.click();
	}
	
	public void clickseeallshows()
	{
		Seealltheshows.click();
	}
	public void clickonapolloimage()
	{
		 ClickonApolloImage.click();
	}
	public void Clickonstatusicon()
	{
		Statusbutton.click();
	}
	public boolean Isstatusbuttonexists()
	{
		return act.CheckElementExists(Statusbutton);
		
		}
	public void clickonmenu()
	{
		 MenuButton.click();
	}
	public void clickonMyvideos()
	{
		 MyVidoesButton.click();
	}
	public boolean Isfavouriteshowexists()
	
	{
	return act.CheckElementExists(Favoriteshows);
 
	}

}
