package peopleYouMayknow;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class PeopleConnect extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		
		//connect button click
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/aside[2]/div/div[2]/div/div/div[2]/span/div/div/div[2]/div/button")).click();
		Thread.sleep(5000);
		
		//connect button click
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/aside[2]/div/div[2]/div/div/div[3]/div/div")).click();
		Thread.sleep(5000);
	}

}
