package club;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class ClubInvite extends Superclass{

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
		
		//click on host tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[1]/div/button[1]/div/h5[1]")).click();
		Thread.sleep(4000);
		
		//click on invite
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div/div[2]/div/div[3]/div/button")).click();
		Thread.sleep(4000);
		
		//click on industry dropdown
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div")).click();
		Thread.sleep(2000);
				
		WebElement sendInvite=driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]/div/span")).click();
		Thread.sleep(1000);
		sendInvite.sendKeys(Keys.ESCAPE);
		
		//click on invite
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/button")).click();
				Thread.sleep(4000);
		
		
		
	}

}
