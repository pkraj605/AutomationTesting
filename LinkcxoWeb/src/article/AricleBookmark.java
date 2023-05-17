package article;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class AricleBookmark extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();

		//Click on three dot options
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/button")).click();
		Thread.sleep(5000);

		//Click on bookmarks options
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/div/div/div/ul/li[1]/div/span")).click();
		Thread.sleep(4000);

		//Click on Hamburger
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[7]/button")).click();
		Thread.sleep(4000);

		//Click on bookmarks 
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/ul[1]/li[2]/div[2]/span")).click();
		Thread.sleep(4000);




	}

}
