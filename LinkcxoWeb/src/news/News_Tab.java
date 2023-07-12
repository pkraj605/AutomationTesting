package news;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class News_Tab extends Superclass{

	public static void main(String[] args) throws InterruptedException {
			//Login
			AuthCommon auth = new AuthCommon();
			auth.login();
			
			
			//Click on three dot option
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[6]/button")).click();
			Thread.sleep(5000);
			
			//News Tab
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/ul[1]/li[3]/div[2]/span")).click();
			Thread.sleep(8000);
			
			//next button
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[2]/div[2]")).click();
			Thread.sleep(5000);
			
			//Bookmark
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[2]/ul/li[3]/div/div/div/div/div/div/div[2]/div[2]/div[2]/button")).click();
			Thread.sleep(5000);
			
			

	}

}
