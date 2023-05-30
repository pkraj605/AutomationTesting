package companyPage;

import org.openqa.selenium.By;
import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class AuthorisedNo extends Superclass{

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
		
				//click on create company page
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[1]/div/div/div/div/ul/li[1]/div/span")).click();
				Thread.sleep(3000);
				
				//click on No option
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/button")).click();
				Thread.sleep(3000);
				
				//Enter User Name
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys("Kislay Kumar");
				Thread.sleep(3000);
				
				//Enter Email Id
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/form/div[2]/div[2]/div/div[1]/div/div/input")).sendKeys("prabhatmfp789@gmail.com");
				Thread.sleep(3000);
				
				//
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/form/div[3]/div/button")).click();
				Thread.sleep(3000);
	}
	
}

