package companyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class JobCandidateShortlist extends Superclass{

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
				
				
				//click on Job Tab
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[1]/div/div/div/button[2]/div/h5[1]")).click();
				Thread.sleep(6000);
				
				//click for Job view
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div[1]/span[1]/div/h5s")).click();
				Thread.sleep(4000);
				
				for(String winHandle:driver.getWindowHandles())
				{
					driver.switchTo().window(winHandle);
				}
				
				// click on down-ward
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement Element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div"));
				js.executeScript("arguments[0].scrollIntoView();",Element );
				Thread.sleep(5000);
					
				//click on candidate>>shortlist
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/div[2]/button")).click();
				Thread.sleep(4000);
								
				
				
	}
	

}