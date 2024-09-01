package com.HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertUserPassword {
	@Test
	public void TestPopups() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		
		System.out.println(alert.getText());
		String txt=alert.getText();
		
		if(txt.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message");
		}
		else {
			System.out.println("In correct alert message");
		}
		
		alert.accept();
		
		

}
}
