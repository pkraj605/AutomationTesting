package club;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class ReportClub extends Superclass{

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
		
		//click on Member Tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[1]/div/button[3]/div/div/h5[1]")).click();
		Thread.sleep(12000);
		
		//click for view details Tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[4]/div/div/div/div[1]/div[2]/div/div[1]/div/div/div[1]/div/img")).click();
		Thread.sleep(10000);
		
		//click on bookmark Tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div[1]/div/div[1]/div[2]/div/button")).click();
		Thread.sleep(3000);
		

		//click on bookmark Tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div[1]/div/div[1]/div[2]/div/div[3]/div/div/ul/li/div/span")).click();
		Thread.sleep(3000);
		

		//click on first tickMark
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/div/span/input")).click();
		Thread.sleep(3000);
		
		//click on second clickMark
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[5]/div/span/input")).click();
		Thread.sleep(3000);
		
		//click on second clickMark
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/div/div/textarea[1]")).sendKeys("Text");
				Thread.sleep(3000);
		
		//click on submit button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[4]/div/button")).click();
		Thread.sleep(3000);
		
		
	
		
		
	}

}
