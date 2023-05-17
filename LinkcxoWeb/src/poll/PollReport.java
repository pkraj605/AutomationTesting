package poll;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class PollReport extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		//Click on three dot option on Poll
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/button")).click();
				Thread.sleep(3000);

				//Click on report option
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/div/div/div/ul/li[3]/div/span")).click();
				Thread.sleep(2000);
				
				//Click on report option 1
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/div/span/input")).click();
				Thread.sleep(2000);
				
				//Click on report option 2
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div/span/input")).click();
				Thread.sleep(2000);
				
				//Click on report option 3
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[3]/div/span/input")).click();
				Thread.sleep(2000);
				
				//Enter Text
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/div/div/textarea[1]")).sendKeys("Test Data");
				Thread.sleep(2000);
				
				//Click on submit button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[4]/div/button")).click();
				Thread.sleep(2000);
				
	}

}
