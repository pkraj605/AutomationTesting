package linkcxoweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Job_Apply {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.navigate().to("http://linkcxo-frontend-testing.s3-website.ap-south-1.amazonaws.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(10000);

		
		//click on Job Module
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/nav/div/div/a[2]/a")).click();
		Thread.sleep(10000);
		
		//click for Job View
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[13]/div/div/div[2]/div/div/ul/li[13]/div/div/div[3]/button")).click();
		Thread.sleep(10000);
				
		//click on Apply Button
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/a/button")).click();
		Thread.sleep(10000);
				
		//Enter Mobile no
		driver.findElement(By.id("outlined-basic")).sendKeys("9162849798");


		//Send Button Key
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div/div/div[3]")).click();
		Thread.sleep(3000);

		//Enter OTP
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[1]/div/div[1]/input")).sendKeys("198989");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[3]/div/button")).click();
		
		
		

	}

}
