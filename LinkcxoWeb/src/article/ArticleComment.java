package article;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class ArticleComment extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();


		//create Article button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div/div[3]/button[2]")).click();
		Thread.sleep(3000);

		//Enter the Article heading
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/textarea[1]")).sendKeys("Article Heading");
		Thread.sleep(2000);

		//Enter Article content
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/div/div/textarea[1]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
		Thread.sleep(2000);

		//click on article submit button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[4]/div/button")).click();
		Thread.sleep(10000);

		//Article comment
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[4]/div/div[2]/div/button")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[5]/div/div/div[1]/div/div[2]/div/div/div/textarea[1]")).sendKeys("Hello java comment on article");
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[5]/div/div/div[1]/div/div[3]/div/div/button")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[4]/div/div[2]/div/button")).click();
		Thread.sleep(5000);

	}

}
