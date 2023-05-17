package article;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class ArticleReport extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		//Click on three dot options
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/button")).click();
				Thread.sleep(5000);

				//Click on bookmarks options
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/div/div/div/ul/li[3]/div/span")).click();
				Thread.sleep(4000);

				//Click on option One
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/div/span/input")).click();
				Thread.sleep(4000);

				//Click on option Two 
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div/span/input")).click();
				Thread.sleep(4000);
				
				//Click on option three
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[3]/div/span/input")).click();
				Thread.sleep(4000);
				
				//Click on option four
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[4]/div/span/input")).click();
				Thread.sleep(4000);
				
				//Click on bookmarks 
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/div/div/textarea[1]")).sendKeys("Test Data");
				Thread.sleep(4000);
				
				//Click on bookmarks 
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[4]/div/button")).click();
				Thread.sleep(4000);

	}

}
