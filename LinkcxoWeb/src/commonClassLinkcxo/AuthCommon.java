package commonClassLinkcxo;

import org.openqa.selenium.By;

public class AuthCommon extends Superclass{

	public void login( ) throws InterruptedException {
		
		//path link
		PathLink pathlink = new PathLink();
		
		getdriver().navigate().to(pathlink.testingURL);
		Thread.sleep(2000);
		getdriver().manage().window().maximize();
		Thread.sleep(5000);
				
		String title= driver.getTitle();
		System.out.println(title);
		
		getdriver().findElement(By.xpath(pathlink.loginLink)).click();
		Thread.sleep(5000);
		//getdriver().findElement(By.xpath("/html/body/div/div/div[1]/div/header/div/div[3]/button[2]/a")).click();
		//Thread.sleep(10000);
		getdriver().findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div/div/div[2]/div/div/input")).sendKeys("9162849798");
		Thread.sleep(3000);
		getdriver().findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div/div/div[3]")).click();
		Thread.sleep(3000);
		getdriver().findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[1]/div/div[1]/input")).sendKeys("198989");
		Thread.sleep(3000);
		getdriver().findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[3]/div/button")).click();
		Thread.sleep(10000);
		
		
	}
		
	
}

