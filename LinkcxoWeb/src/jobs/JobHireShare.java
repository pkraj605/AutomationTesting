package jobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class JobHireShare extends Superclass{

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
				
		//click on open job tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[1]/div/div/button[1]/div/h5s")).click();
		Thread.sleep(4000);
				
		//click on share icon button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div[1]/div[2]/div/button[1]")).click();
		Thread.sleep(4000);
		
		//click on share icon button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/img")).click();
		Thread.sleep(4000);
				
		
		//click on dropdown button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div")).click();
		Thread.sleep(1000);
		
		//select card where the all option is showing
		WebElement act_fun1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul"));
		Thread.sleep(1000);

		// Multi_select_option
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li/span[1]")).click();
		Thread.sleep(1000);
		act_fun1.sendKeys(Keys.ESCAPE);
		
		
		//click on submit button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/button")).click();
		Thread.sleep(4000);
			
	}
	
}
