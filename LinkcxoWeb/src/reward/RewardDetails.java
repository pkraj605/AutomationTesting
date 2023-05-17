package reward;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class RewardDetails extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		
		//Reward tab click
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[5]/div[1]/img")).click();
		Thread.sleep(5000);
		
		//Details
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[1]/div/div[2]/div/button")).click();
		Thread.sleep(3000);
		
		//Dropdown
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div")).click();
		Thread.sleep(5000);
		
		//Dropdown
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]")).click();
		Thread.sleep(3000);
		
		//Dropdown
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div")).click();
		Thread.sleep(5000);
				
		//Dropdown
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")).click();
		Thread.sleep(3000);
		
		
		
	}

}
