package jobs;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class JobReport extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		
		//click on job Module
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[2]/div[2]/h2")).click();
		Thread.sleep(4000);
		
		//click on search module
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/button[1]/div/div/h5[1]")).click();
		Thread.sleep(3000);
		
		//click on recommended tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[1]/div/div/button[1]/div/h5")).click();
		Thread.sleep(3000);
		
		//click on three dot
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div[1]/div[2]/div/button[2]")).click();
		Thread.sleep(3000);
		
		//click on three dot
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div[1]/div[2]/div/div/div/div/ul/li/div/span")).click();
				Thread.sleep(3000);
				
				//click on three dot
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/textarea[1]")).sendKeys("Report on job");
				Thread.sleep(3000);
		
				//click on three dot
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/div/button")).click();
				Thread.sleep(3000);	
				

	}

}
