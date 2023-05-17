package event;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class withdrow extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		//Click on event Tab
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[3]/div[2]/h2")).click();
		Thread.sleep(5000);
		
		//Click on participant Tab 
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[1]/div/button[3]/div/div/h5[1]")).click();
		Thread.sleep(5000);

		//Click on send withdrows button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[4]/div/div[1]/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/h6")).click();
		Thread.sleep(5000);
	}

}
