package club;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class PollCreate extends Superclass{

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
				
				//click on poll option
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div/div/div/div[2]/div[3]/div[2]/h6")).click();
				Thread.sleep(4000);
				
				
				//Enter Poll Heading
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/div/textarea[1]")).sendKeys("Poll Heading ");
				Thread.sleep(4000);
				
				//Enter option one
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div[2]/div/div/div/input")).sendKeys("Option one");
				Thread.sleep(4000);
				
				//Enter Option two
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[2]/div/div[2]/div/div/div/input")).sendKeys("Option Two 2");
				Thread.sleep(4000);
				
				//Click on choose days
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[4]/div/div[2]/div/div/div")).click();
				Thread.sleep(2000);

				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
				Thread.sleep(2000);

				//Click on Submit button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[5]/div[2]/div/div[1]/div/button")).click();
				Thread.sleep(6000);
								
				//vote on Poll
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div[1]/label/span/input")).click();
				Thread.sleep(4000);
				
				
	}

}
