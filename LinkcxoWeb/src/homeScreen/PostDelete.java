package homeScreen;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class PostDelete extends Superclass{

	public static void main(String[] args) throws InterruptedException {
	//Login
	AuthCommon auth = new AuthCommon();
	auth.login();
		
		//Delete post
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/button")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/div/div/div/ul/li[2]/div/span")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div[2]/div/button")).click();
		Thread.sleep(3000);

	}

}
