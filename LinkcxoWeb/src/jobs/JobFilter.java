package jobs;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class JobFilter extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();


		//click on job Module
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[2]/div[2]/h2")).click();
		Thread.sleep(4000);

		//Job Filter
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/div/div/div[2]")).click();
		Thread.sleep(3000);

		//click on select min salary
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[1]/div/div/div/div/form/div/div/div[1]/div[2]/div[2]/div[1]/div/div/div")).click();
		Thread.sleep(3000);
		
		
		//click on select min salary
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
		Thread.sleep(3000);
		
		
		//click on select max salary
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[1]/div/div/div/div/form/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div")).click();
		Thread.sleep(3000);
		
		//click on select min salary
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[4]")).click();
				Thread.sleep(3000);

				//click on select min Exp.
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[1]/div/div/div/div/form/div/div/div[3]/div[2]/div[2]/div[1]/div/div/div")).click();
				Thread.sleep(3000);
				
				//click on select min Exp.
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]")).click();
				Thread.sleep(3000);
				
				//click on select max Exp.
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[1]/div/div/div/div/form/div/div/div[3]/div[2]/div[2]/div[2]/div/div/div")).click();
				Thread.sleep(3000);
				
				//click on select max Exp.
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[4]")).click();
				Thread.sleep(3000);
				
				//click on select industry
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[1]/div/div/div/div/form/div/div/div[4]/div[2]/div/div/div")).click();
				Thread.sleep(3000);
				
				//click on select industry
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[4]/div/span")).click();
				Thread.sleep(3000);
				
				//click on select industry
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[1]/div/div/div/div/form/div/div/div[5]/div[2]/div/div/div")).click();
				Thread.sleep(3000);
				
				//click on select industry
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[5]/div/span")).click();
				Thread.sleep(3000);
				
				//click on select industry
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[1]/div/div/div/div/form/div/div/div[6]/div[2]/div/button")).click();
				Thread.sleep(3000);
				
		
	}

}
