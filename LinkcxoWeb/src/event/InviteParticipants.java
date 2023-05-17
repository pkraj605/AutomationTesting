package event;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class InviteParticipants extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		//Click on event Tab
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[3]/div[2]/h2")).click();
		Thread.sleep(5000);
		
		//Click on hosting Tab 
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[3]/div/div[1]/div/div/button[1]/div/div/h5[1]")).click();
		Thread.sleep(5000);
		
		//Click on invite button
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]/div[1]/img[1]")).click();
		Thread.sleep(5000);
		
		//Click on dropdown
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div")).click();
		Thread.sleep(5000);
		
		//Click on invite button
		WebElement invite_User= driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul"));
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]/div/span")).click();
		Thread.sleep(1000);
		invite_User.sendKeys(Keys.ESCAPE);
		
		//Click on submit
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/button")).click();
		Thread.sleep(5000);
		
		
		
	}

}
