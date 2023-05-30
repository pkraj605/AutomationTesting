package companyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
				Thread.sleep(5000);

				//click on three dots
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[1]/div/button")).click();
				Thread.sleep(4000);
		
				//click on create company page
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[1]/div/div/div/div/ul/li[1]/div/span")).click();
				Thread.sleep(3000);
				
				//click on Yes button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/button")).click();
				Thread.sleep(3000);
				
				//Entering domain Name
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys("www.gmail.com");
				Thread.sleep(3000);
				
				//Entering Email id
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/form/div[2]/div[2]/div/div[1]/div/div/input")).sendKeys("15041996anamika@gmail.com");
				Thread.sleep(3000);
				
				//click on Verify button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/form/div[3]/div/button")).click();
				Thread.sleep(30000);
				
				//Click to verify button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[2]/div/form/div[3]/div/button")).click();
				Thread.sleep(8000);
				
				//Select Image
				WebElement selImage1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[1]/div/div/div[1]/input"));
				selImage1.sendKeys("D:/download.png");
				//selImage.sendKeys(Keys.ESCAPE);
				Thread.sleep(6000);
				
				//Enter Name
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys("Micromax Comapny");
				Thread.sleep(4000);
				
				//Enter Tagline
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[2]/div[2]/div/div[1]/div/div/input")).sendKeys("We Can do our best");
				Thread.sleep(4000);
				
				//Enter Page Name
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[4]/div[2]/div/div[1]/div/div/input")).sendKeys("Micromax Page");
				Thread.sleep(4000);
				
				
				// Select industry
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[5]/div[2]/div/div/div")).click();
				Thread.sleep(4000);
				
				//Select industry
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]/div/span")).click();
				Thread.sleep(4000);
				
				//Select Size
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[6]/div[2]/div/div/div")).click();
				Thread.sleep(4000);
				
				//Select Size
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[4]")).click();
				Thread.sleep(4000);
				
				//Select Regestration Type
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[7]/div[2]/div/div/div")).click();
				Thread.sleep(4000);
				
				//Select Regestration Type
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]")).click();
				Thread.sleep(4000);
				
				//Enter Description
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[9]/div[2]/div/div[1]/div/textarea[1]")).sendKeys("Test data");
				Thread.sleep(4000);
				
				//Click on T&C
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[10]/div/span/input")).click();
				Thread.sleep(4000);				
				
				//Click on create button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[11]/div/button")).click();
				Thread.sleep(4000);
				
				
					
				
		
	}
	
}