package com.testing.practise.GlobalAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionclass {
	
	
	 public boolean CheckElementExists(WebElement element)
     {
         try
         {
             if (element.isDisplayed())
             {
                 return true;
             }
         }
         catch (Exception ex)
         {
        	 System.out.println("Element is not visible");
                          return false;
         }
         return false;
     }
	 
	 public boolean CheckElementEnabled(WebElement element)
     {
         try
         {
             if (element.isEnabled())
             {
                 return true;
             }
         }
         catch (Exception ex)
         {
        	 System.out.println("Element is not Enabled");
                          return false;
         }
         return false;
     }
	
}
