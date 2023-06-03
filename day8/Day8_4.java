package com.selenium.solution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8_4 {
  @Test
  public static void main(String[] args)throws InterruptedException 
  {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver= new EdgeDriver();
	  driver.get("https://www.abhibus.com/bus-ticket-booking");
      driver.manage().window().maximize();
	  WebElement leave=driver.findElement(By.xpath("//*[@id=\"source\"]"));
	  leave.sendKeys("palani");
	  WebElement go=driver.findElement(By.xpath("//*[@id=\"destination\"]"));
	  go.sendKeys("Coimbatore");
	  Thread.sleep(3000);
	  WebElement da=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
//	  da.sendKeys("23-09-25");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].setAttribute('value','23/09/23')",da);
	  Thread.sleep(3000);
	  
	 
  }
}
