package club;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class ClubArticlePost extends Superclass{

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
				
				//click on post article option
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div/div/div/div[2]/div[2]/div[2]/h6")).click();
				Thread.sleep(4000);
								
				//Enter article heading
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/textarea[1]")).sendKeys("article heading");
				Thread.sleep(4000);
				
				//Enter article text
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/div/div/textarea[1]")).sendKeys("article text");
				Thread.sleep(4000);
				
				//click on post button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[4]/div/button")).sendKeys("article text");
				Thread.sleep(4000);
							
				
									
	}

}
