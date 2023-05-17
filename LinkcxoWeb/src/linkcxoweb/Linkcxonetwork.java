package linkcxoweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcxonetwork {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.navigate().to("http://linkcxo-frontend-testing.s3-website.ap-south-1.amazonaws.com/");

		//click on network button
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[1]")).click();
		Thread.sleep(2000);

		//click on pending tab
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[1]/div/div[1]/div[1]/div/button[1]")).click();
		Thread.sleep(2000);

		//click on pending tab
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[1]/div/div[1]/div[1]/div/button[2]")).click();
		Thread.sleep(2000);

		//click on Existing tab
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[1]/div/div[1]/div[1]/div/button[3]")).click();
		Thread.sleep(2000);


	}

}
