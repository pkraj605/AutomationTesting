package network;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class NetworkTab extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		//click on network Module
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[1]/div[2]/h2")).click();
		Thread.sleep(2000); 		 
		
		//click on Discover tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[1]/div/div[1]/div/button[1]/div/h5[1]")).click();
		Thread.sleep(2000);
		
		//click on connect tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div[3]/div/div/button")).click();
		Thread.sleep(5000);
		
		//click on My network tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[1]/div/button[2]/div/h5[1]")).click();							
		Thread.sleep(3000);
		
		//click on Pending tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[3]/div/div[1]/div/div/button[1]/div/div/h5[1]")).click();
		Thread.sleep(4000);
		
		//click on Pending>>ingnore button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[3]/div/div[1]/button")).click();
		Thread.sleep(4000);
			
		//click on Pending>>Connect button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[3]/div/div[2]/button")).click();
		Thread.sleep(3000);
				
		//click on Sent tab
		driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/main/div/div/div/div/div[3]/div/div[1]/div/div/button[2]/div/div/h5[1]")).click();
		Thread.sleep(2000);
		
		//click on Sent>>Cancel button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[3]/div/div[3]/div/div/div/div/div/div[1]/div[1]/div/div[2]/div[3]/div/div/button")).click();
		Thread.sleep(3000);
		
		//click on Existing tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[3]/div/div[1]/div/div/button[3]/div/h5[1]")).click();
		Thread.sleep(2000);
				
		//click on Existing>>Remove button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[3]/div/div[4]/div/div/div/div/div/div[1]/div[2]/div/div[2]/div[3]/div/div/button")).click();
		Thread.sleep(3000);
		
		
		
	}

}
