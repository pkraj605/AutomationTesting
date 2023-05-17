package linkcxoweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcxoEvent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.navigate().to("http://linkcxo-frontend-testing.s3-website.ap-south-1.amazonaws.com/");

		//click on Job Module
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[1]/div/div[1]/div[1]/div/button[3]")).click();
		Thread.sleep(2000);

		//click on Search tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[1]/div/button[1]")).click();

		//click on pending tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[1]/div/button[2]")).click();
		Thread.sleep(2000);

		//click on Create tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[1]/div/button[3]")).click();
		Thread.sleep(2000);
		
		//click on Apply button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/div/button")).click();
		Thread.sleep(2000);
		
		//job create form filling
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[2]/div/div/div/form/div[1]/div/div[2]/div[1]/div/div/input")).sendKeys("prabhat@linkcxo.com");
		

	}

}
