package reward;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class RewardTab extends Superclass{

		public static void main(String[] args) throws InterruptedException {
			//Login
			AuthCommon auth = new AuthCommon();
			auth.login();
			Thread.sleep(6000);
			
			//Reward tab click
			
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[5]/div[1]/img")).click();
			Thread.sleep(5000);
			
			//Partners
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div/div[2]/div[1]/div/div/div/div[5]/div/div/div[1]/div/img")).click();
			Thread.sleep(5000);
			
			//subpartners
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[3]/div/div/div/div/div/img")).click();
			Thread.sleep(5000);
			
			//Purchage button
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div/div[2]/div/div[3]/div/div[2]/div[4]/button")).click();
			Thread.sleep(3000);
			
			//Select Dropdown
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div/div/div/div[3]/div[4]/div[1]/div/div/div/select")).click();
			Thread.sleep(3000);
//			
//			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div/div/div/div[3]/div[6]/div/div/button")).click();
//			Thread.sleep(3000);
//			
//			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div/div/div/div/div[2]/div/div/button")).click();
//			Thread.sleep(3000);

			
			
	}

}
