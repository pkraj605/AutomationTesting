package companyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class PostEdit extends Superclass{

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
				Thread.sleep(6000);
				
				//click to view company page
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div[1]/div[2]/div/div[1]/div/div[1]/div/div/div/img")).click();
				Thread.sleep(6000);
				
				//click on Create Button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[1]/div/div/div/button[5]/div/h5[1]")).click();
				Thread.sleep(3000);
				
				//click on Create Post
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div/div/div/div[2]/div[1]/div[2]/h6")).click();
				Thread.sleep(4000);
				
				//click on Create Button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/textarea[1]")).sendKeys("Test Data new");
				Thread.sleep(7000);
				
				//select Image
				WebElement chooseFile = getdriver().findElement(By.xpath("//input[@id='icon-button-image']"));
				chooseFile.sendKeys("D:/download.png");
				
				//click on Submit button
				getdriver().findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[5]/div[2]/div/div/button")).click();
				Thread.sleep(10000);
				
				//three dot option click
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[3]/div/button")).click();
				Thread.sleep(5000);
				
				//click on Edit Option
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[3]/div/div/div/div/ul/li[1]/div/span")).click();
				Thread.sleep(6000);

				//Replace the text
				WebElement postEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/textarea[1]"));
				postEdit.sendKeys(Keys.CONTROL +"a");
				postEdit.sendKeys("New Text update");
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[5]/div[2]/div/div/button")).click();
				Thread.sleep(4000);
				
				
				
				
				
	}
	
}