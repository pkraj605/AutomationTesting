package companyPage;

import org.openqa.selenium.By;
import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class PollCreate extends Superclass{

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
				Thread.sleep(3000);
				
				//click on Create Button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[1]/div/div/div/button[5]/div/h5[1]")).click();
				Thread.sleep(3000);
				
				//click on Poll Create
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div/div/div/div[2]/div[3]/div[2]/h6")).click();
				Thread.sleep(4000);
				
				//Enter article heading
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/div/textarea[1]")).sendKeys("Poll Vote is Right?");
				Thread.sleep(4000);
				
				//Enter article heading
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div[2]/div/div/div/input")).sendKeys("Yes");
				Thread.sleep(4000);
				
				//Enter article heading
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[2]/div/div[2]/div/div/div/input")).sendKeys("No");
				Thread.sleep(4000);
				
				//Enter Article text
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[4]/div/div[2]/div/div/div")).click();
				Thread.sleep(5000);
				
				//Enter Article text
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
				Thread.sleep(4000);
				
				//Enter Article text
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[5]/div[2]/div/div[1]/div/button")).click();
				Thread.sleep(4000);
				
				
				
				
		}
	
}