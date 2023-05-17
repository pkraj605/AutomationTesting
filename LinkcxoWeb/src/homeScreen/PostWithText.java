package homeScreen;

import org.openqa.selenium.By;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class PostWithText extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//-------- Login Page
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		//click on share your experience
		getdriver().findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);

		//Enter text
		getdriver().findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/textarea[1]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
		Thread.sleep(3000);
		
		//click on Submit button
		getdriver().findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[4]/div[2]/div/div/button")).click();
		Thread.sleep(5000);

	}

}
