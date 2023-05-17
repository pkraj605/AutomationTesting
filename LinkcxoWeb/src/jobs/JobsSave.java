package jobs;
import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class JobsSave extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		
		//click on job Module
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[2]/div[2]/h2")).click();
		Thread.sleep(4000);
		
		//click on search Tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/button[1]/div/div/h5[1]")).click();
		Thread.sleep(3000);
				
		//click on save button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div[2]/div/div[2]/div[2]/div/button")).click();
		Thread.sleep(3000);
		
		//click on save tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[1]/div/div/button[3]/div/h5s")).click();
		Thread.sleep(3000);
				
		//click on unsave button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[4]/div/div/div/div/div/div[1]/div[1]/div/div[2]/div/div[2]/div/div/button")).click();
		Thread.sleep(3000);
				
		
	}

}
