package jobs;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class JobWithdrows extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		
		
		
		//click on job Module
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[2]/div[2]/h2")).click();
		Thread.sleep(4000);
		
		
		//click on Applied tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[1]/div/div/button[2]/div")).click();
		Thread.sleep(4000);
		
		//click on view job details 
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[3]/div/div/div/div/div/div[1]/div[1]/div/div[1]/div[1]/span[1]/div/h5s")).click();
		Thread.sleep(4000);
		
		for(String winHandle:driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
		}
								
		//click on Applied tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div/div[2]/div/div/div/div/div[9]/div[2]/div[1]/div/button")).click();
		Thread.sleep(4000);
						

	}

}
