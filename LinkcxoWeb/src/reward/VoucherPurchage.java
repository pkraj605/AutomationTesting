package reward;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class VoucherPurchage extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		//Reward tab click
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[5]/div[1]/img")).click();
		Thread.sleep(5000);
		
		//Click on partners
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div/div/div/button[2]/div/h5[1]")).click();
		Thread.sleep(5000);
		
		//click on partner product
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/img")).click();
				Thread.sleep(5000);
				
				//click on partner product view
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div/div[2]/div[1]/div/div/div/div[1]/div/div/div[1]/div/img")).click();
				Thread.sleep(5000);
				
				//Click on  voucher
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[3]/div/div/div/div[1]/div/img")).click();
				Thread.sleep(5000);
				
				//click on voucher by
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div/div[2]/div/div[3]/div[2]/div[2]/div[4]/button")).click();
				Thread.sleep(5000);
				
				//click on purchage button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div/div/div/div[3]/div[6]/div/div/button")).click();
				Thread.sleep(5000);
				
				// click on ok Message
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div/div/div/div/div[2]/div/div/button")).click();
				Thread.sleep(5000);
				
				
	}

}
