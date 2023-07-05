package jobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class CandidateShortlistToHold extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		//click on job Module
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[2]/div[2]/h2")).click();
		Thread.sleep(4000);
		
		//click on hire tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/button[2]/div/h5[1]")).click();
		Thread.sleep(4000);
		
		//click on hire tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[1]/div/div/button[1]/div/h5s")).click();
		Thread.sleep(20000);
		
		//click for Job view
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div[1]/div[1]/span[1]/div/h5s")).click();								
		Thread.sleep(4000);
		
		for(String winHandle:driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
		}
		
		// click on down-ward
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div"));
		js.executeScript("arguments[0].scrollIntoView();",Element );
	    Thread.sleep(15000);
			
		//click shortlist to hold
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[2]/div[4]/div/div/div/div[2]/div[3]/div/div[1]/button")).click();
		Thread.sleep(4000);

	}

}
