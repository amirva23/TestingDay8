package com.selenium.solution;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8_3 {
  @Test
  public  static  void main(String[] args)throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver =new EdgeDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  driver.manage().window().maximize();
	  WebElement id =driver.findElement(By.name("id"));
	  id.sendKeys("401");
	  WebElement print =driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	  print.click();
	  //alert is class.it a 
	  Alert a=driver.switchTo().alert();
	  Thread.sleep(3000);
	  a.dismiss();
	  id.clear();
	  id.sendKeys("402");
	  print.click();
	   
	  a.accept();//to accept the alert box
	  Alert b=driver.switchTo().alert();
	  //to copy the statement"completed successfully"
	  String text=b.getText();
	  b.accept();
	  System.out.println(text);
      driver.quit();	  
	  
	  
	  
	  
  }
}
