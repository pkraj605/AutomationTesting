package corporate;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class Corporate extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		Thread.sleep(6000);

		//click on corporate tab
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[4]/div[2]/h2")).click();
		Thread.sleep(3000);
		
		//click on Packages
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/img")).click();
		Thread.sleep(3000);
				
		//click on corporate Membership card
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[3]/div/div/div/div[1]/div/div[2]/div[5]/div/div[2]/div[2]/div/button")).click();
		Thread.sleep(3000);
		
				
	}
		
}