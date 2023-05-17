package news;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class News_Tab extends Superclass{

	public static void main(String[] args) throws InterruptedException {
			//Login
			AuthCommon auth = new AuthCommon();
			auth.login();
			
			//News Tab
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[4]/div[1]")).click();
			Thread.sleep(5000);
			
			//next button
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[2]/button[2]")).click();
			Thread.sleep(5000);
			
			//Bookmark
			driver.findElement(By.xpath("//li[@class='react-multi-carousel-item react-multi-carousel-item--active carousel-item-padding-40-px']//button[@aria-label='Bookmark']")).click();
			Thread.sleep(5000);
			
			
			

	}

}
