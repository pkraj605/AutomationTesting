package companyPage;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class CreateCompanyPage extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		Thread.sleep(6000);
		
		//Click on profile
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/aside[1]/div/div[1]/div/div[1]/div/img")).click();
				Thread.sleep(7000);

				//click on three dots
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[1]/div/button")).click();
				Thread.sleep(5000);
		
				//click on create company page
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[1]/div/div/div/div/ul/li[1]/div/span")).click();
				Thread.sleep(5000);
				
				//click on Yes button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/button")).click();
				Thread.sleep(5000);
				
				//Entering domain Name
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys("www.linkcxo.com");
				Thread.sleep(5000);
				
				//Entering Email id
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/form/div[2]/div[2]/div/div[1]/div/div/input")).sendKeys("prabhat@linkcxo.com");
				Thread.sleep(5000);
				
				//click on Verify button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/form/div[3]/div/button")).click();
				Thread.sleep(6000);
				
				//Submitting otp
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[2]/div/form/div[2]/div/button")).click();
				Thread.sleep(8000);
				
				//Submitting otp
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[2]/div/form/div[2]/div/button")).click();
				Thread.sleep(8000);
				
				
		
	}
	
}