package club;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class WithdrowRequest extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		//click on three dot tab
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[7]/button")).click();
		Thread.sleep(3000);
		
		//click on club tab
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/ul[1]/li[1]/div[2]/span")).click();
		Thread.sleep(4000);
		
		//click on Pending Tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[1]/div/button[2]/div/h5[1]")).click();
		Thread.sleep(4000);
		
		//click on ingnore button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[3]/div/div[1]/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div/button/div/div")).click();
		Thread.sleep(4000);
				

	}

}
