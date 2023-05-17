package poll;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class PollHide extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		//Click on three dot option on Poll
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/button")).click();
				Thread.sleep(3000);

				//Click on hide option
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/div/div/div/ul/li[2]/div/span")).click();
				Thread.sleep(2000);
	}

}
