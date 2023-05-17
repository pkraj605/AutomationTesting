package network;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class UserProfileView extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		
		//click on network Module
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[1]/div[2]/h2")).click();
		Thread.sleep(2000);
		
		//click on existing tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[1]/div[1]/div[1]/div/button[3]/div/h5[1]")).click();
		Thread.sleep(2000);
		
		//view User profile
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[1]/div/div[4]/div/div[2]/div/img")).click();
		Thread.sleep(2000);
	}

}
