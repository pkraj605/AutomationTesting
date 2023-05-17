package network;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class NetworkFilter extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		//click on network Module
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[1]/div[2]/h2")).click();
		Thread.sleep(2000); 		 
		
		//click on filter icon
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[1]/div/div/div/div[2]")).click();
		Thread.sleep(2000);
		
		
		//click on designation dropdown
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[2]/div[1]/div/div/div/div/form/div[1]/div/div[2]/div/div/div")).click();
		Thread.sleep(2000);
		
		//click on select designation 
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[8]")).click();
		Thread.sleep(4000);
					
		//Enter company name
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[2]/div[1]/div/div/div/div/form/div[2]/div/div[2]/div[1]/div/div/input")).sendKeys("Linkcxo");
		Thread.sleep(4000);
		
		//Enter Location
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[2]/div[1]/div/div/div/div/form/div[3]/div/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys("Bangalore");
		Thread.sleep(4000);
		
	
		//click on select designation
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[2]/div[1]/div/div/div/div/form/div[3]/div/div[2]/div[2]/div/div/div")).click();
		Thread.sleep(4000);
								
		//click on select designation
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]/div/span")).click();
		Thread.sleep(2000);
				
				
		//click on select function dropdown
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[2]/div[1]/div/div/div/div/form/div[3]/div/div[3]/div[2]/div/div/div")).click();
		Thread.sleep(2000);
				
		//click on select function
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]/div/span")).click();
		Thread.sleep(2000);		
				
		//click on select function
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[2]/div[1]/div/div/div/div/form/div[3]/div/div[4]/div[2]/div/button")).click();
		Thread.sleep(2000);	
		
		
				
	}

}
