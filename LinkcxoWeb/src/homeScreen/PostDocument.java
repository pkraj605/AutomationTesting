package homeScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class PostDocument extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();


		//click on share your experience
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);

		//Enter text
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/textarea[1]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
		Thread.sleep(10000);

		//driver.findElement(By.xpath("//label[@for='icon-button-doc']//div[@class='MuiBox-root css-inrloo']")).click();
		//Document Upload
		WebElement chooseDoc = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/div/div[2]/div[1]/input"));
		chooseDoc.sendKeys("C:/Users/prabh/OneDrive/Desktop/pemp file/Manual Interview Questions.pdf");
		Thread.sleep(5000);

		//click on Submit button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[6]/div[2]/div/div/button")).click();
		Thread.sleep(8000);

	
	}

}
