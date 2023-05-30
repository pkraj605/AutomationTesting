package companyPage;

import org.openqa.selenium.By;
import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class PollDelete extends Superclass{

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
				
				//click on Poll Create
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div/div/div/div[2]/div[3]/div[2]/h6")).click();
				Thread.sleep(4000);
				
				//Enter Poll Heading
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/div/textarea[1]")).sendKeys("Poll Vote is Right?");
				Thread.sleep(4000);
				
				//Enter poll option one
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div[2]/div/div/div/input")).sendKeys("Yes");
				Thread.sleep(4000);
				
				//Enter poll option two
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[2]/div/div[2]/div/div/div/input")).sendKeys("No");
				Thread.sleep(4000);
				
				//Enter select poll date
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[4]/div/div[2]/div/div/div")).click();
				Thread.sleep(5000);
				
				//Enter select poll date
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
				Thread.sleep(4000);
				
				//Click on Post
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[5]/div[2]/div/div[1]/div/button")).click();
				Thread.sleep(4000);
				
				//----------------------------
				
				//Poll Vote
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[1]/div[1]/label/span/input")).click();
				Thread.sleep(4000);
				
				
				//click on like button
				getdriver().findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[1]/div/button")).click();
				Thread.sleep(8000);
				
				//click on comment Button
				getdriver().findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/div/button")).click();
				Thread.sleep(5000);
				
				//Enter comment data
				getdriver().findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/textarea[1]")).sendKeys("Test Data");
				Thread.sleep(5000);
				
				//click on post Button
				getdriver().findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div[4]/div/div/div[1]/div/div[3]/div/div/button")).click();
				Thread.sleep(5000);
			
				//click on comment Button
				getdriver().findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/div/button")).click();
				Thread.sleep(8000);
				
				//Poll Delete
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[3]/div/button")).click();									 
				Thread.sleep(5000);

				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[3]/div/div/div/div/ul/li/div/span")).click();
				Thread.sleep(4000);

				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div[2]/div/button")).click();
				Thread.sleep(3000);
				
				
		}
	
}