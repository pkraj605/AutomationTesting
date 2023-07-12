package reward;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class CategoryDetails extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		//Reward tab click
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[3]/div[2]/h2")).click();
		Thread.sleep(5000);
		
		//Membership Tab tab click
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div/div/div/button[1]")).click();
		Thread.sleep(5000);
		
		//Click on basic plane
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[3]/div/div/div/div[1]/div/div[1]/div")).click();
		Thread.sleep(5000);
				
		//Click on Tearm and conditions
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div/div[1]/div[3]/div[2]/div[2]/div[1]/div/div[2]/div[2]/h6")).click();
		Thread.sleep(5000);
		
		//Click on cross button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div/div/div[1]/div[2]")).click();
		Thread.sleep(5000);
		
		
		
		
	}

}
