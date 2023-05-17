package club;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class ClubPost extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		Thread.sleep(6000);

		//click on three dot tab
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[7]/button")).click();
		Thread.sleep(3000);
		
		//click on club tab
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/ul[1]/li[1]/div[2]/span")).click();
		Thread.sleep(8000);
		
		//click for view club details
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/div/img")).click();
		Thread.sleep(4000);
		
		
		//click on Create post
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div[1]/div/div[3]/div/div[2]/div/div/button")).click();
				Thread.sleep(4000);
				
				//click on Create post option
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div/div/div/div[2]/div[1]/div[2]/h6")).click();
				Thread.sleep(4000);
		
				//Enter Text
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/textarea[1]")).sendKeys("test data");
				Thread.sleep(4000);
				
				WebElement chooseFile = getdriver().findElement(By.xpath("//input[@id='icon-button-image']"));
				chooseFile.sendKeys("D:/download.png");
				Thread.sleep(4000);
				
				//click on Submit button
				getdriver().findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[5]/div[2]/div/div/button")).click();
				Thread.sleep(4000);
				
		
	}

}
