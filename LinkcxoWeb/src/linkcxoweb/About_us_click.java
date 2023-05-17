package linkcxoweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class About_us_click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.navigate().to("http://linkcxo-frontend-testing.s3-website.ap-south-1.amazonaws.com/");
		Thread.sleep(8000);
		driver.manage().window().maximize();
		Thread.sleep(8000);

		
		//click on Job Module
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/nav/div/div/a[2]/a")).click();
		Thread.sleep(6000);

		//click on Event Module
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/nav/div/div/a[3]/a")).click();
		Thread.sleep(6000);
		
	
		//click about_us
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/nav/div/div/a[1]/a")).click();
		Thread.sleep(6000);
	}

}
