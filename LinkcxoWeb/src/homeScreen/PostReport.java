package homeScreen;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class PostReport extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();

		
		//post comment
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[2]/div/div[1]/div[3]/div/button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[2]/div/div[1]/div[3]/div/div/div/div/ul/li[3]/div/span")).click();
		Thread.sleep(5000);
				
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/div/span/input")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div/span/input")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[3]/div/span/input")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[4]/div/span/input")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/div/div/textarea[1]")).sendKeys("Test Data");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[4]/div/button")).click();
		Thread.sleep(5000);

	}

}
