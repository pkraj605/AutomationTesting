package companyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class EventSendRequest extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		Thread.sleep(6000);
		
		//Click on profile
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/aside[1]/div/div[1]/div/div[1]/div/img")).click();
				Thread.sleep(5000);

				//click on three dots
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[1]/div/button")).click();
				Thread.sleep(4000);
		
				//click on Manage company page
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[1]/div/div/div/div/ul/li[2]/div/span")).click();
				Thread.sleep(3000);
				

				//click to view company page
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div[1]/div[2]/div/div[1]/div/div[1]/div/div/div/img")).click();
				Thread.sleep(6000);
				
				//click on event tab
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[1]/div/div/div/button[4]/div/h5[1]")).click();
				Thread.sleep(6000);
				
				//click on invite request
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/div/button/div/img")).click();
				Thread.sleep(6000);
				
				//click on send request
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div")).click();
				Thread.sleep(6000);
				
				//Click on dropdown
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div")).click();
				Thread.sleep(5000);
				
				//Click on invite button
				WebElement invite_User= driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul"));
				Thread.sleep(4000);
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]/div/span")).click();
				Thread.sleep(1000);
				invite_User.sendKeys(Keys.ESCAPE);
				
				//Click on submit
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/button")).click();
				Thread.sleep(5000);
				
				
				
				
				
	}
	
}