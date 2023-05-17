package article;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class ArticleEdit extends Superclass{

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
		Thread.sleep(6000);

		//click on three dot options
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/button")).click();
		Thread.sleep(2000);

		//click on Edit Option
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/div/div/div/ul/li[1]/div/span")).click();
		Thread.sleep(6000);
		
		//Replace the text
		WebElement articleEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/div/div/textarea[1]"));
		articleEdit.sendKeys(Keys.CONTROL +"a");
		articleEdit.sendKeys("New Text update");
		Thread.sleep(3000);

		//click on article submit button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[4]/div/button")).click();
		Thread.sleep(4000);

	}

}
