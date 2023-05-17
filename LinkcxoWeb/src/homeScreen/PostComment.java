package homeScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class PostComment extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		//click on share your experience
				getdriver().findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div/div[3]/button[1]")).click();
				Thread.sleep(2000);

				//Enter text
				getdriver().findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/textarea[1]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
				Thread.sleep(3000);

				//Drop-down
				//System.out.println("Dummy Text........."+getdriver().findElement(By.xpath("//input[@id='icon-button-image']")));
				//Thread.sleep(7000);

				WebElement chooseFile = getdriver().findElement(By.xpath("//input[@id='icon-button-image']"));
				chooseFile.sendKeys("D:/download.png");

				//click on Submit button
				getdriver().findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[5]/div[2]/div/div/button")).click();
				Thread.sleep(10000);
				
				
		//post comment
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[3]/div/div[2]/div/div/h6[2]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/textarea[1]")).sendKeys("Hello java");
		Thread.sleep(5000);
				
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[2]/div/div/div[1]/div/div[4]/div/div/div[1]/div/div[3]/div/div/button")).click();
		Thread.sleep(5000);
					

	}

}
