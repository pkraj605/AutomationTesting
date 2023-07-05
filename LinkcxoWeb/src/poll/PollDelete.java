package poll;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class PollDelete extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();


		//Create Poll
		driver.findElement(By.xpath("//div[@class='wrapper_inner']//button[@aria-label='gallary']//*[name()='svg']")).click();
		Thread.sleep(3000);

		//Enter poll question
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/div/textarea[1]")).sendKeys("Who won the 20-20 world cup?");
		Thread.sleep(2000);

		//Enter option one
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/div[2]/div/div/div/input")).sendKeys("India");
		Thread.sleep(2000);

		//Enter Option Two
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[2]/div/div[2]/div/div/div/input")).sendKeys("Austaliya");
		Thread.sleep(2000);

		//Click on choose days
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[4]/div/div[2]/div/div/div")).click();
		Thread.sleep(2000);

		//Click on choose days 2nd option
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
		Thread.sleep(2000);

		//Click on Submit button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[5]/div[2]/div/div[1]/div/button")).click();
		Thread.sleep(4000);

		//Click on three dot option
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/button")).click();
		Thread.sleep(4000);

		//Click on delete option
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/div/div/div/ul/li/div/span")).click();
		Thread.sleep(4000);

		//Click on yes button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div[2]/div/button")).click();
		Thread.sleep(4000);




	}

}
