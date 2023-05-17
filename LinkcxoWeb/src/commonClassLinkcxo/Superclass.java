package commonClassLinkcxo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Superclass
{
	public static WebDriver driver;
	public Superclass(){
		System.setProperty("webdriver.chrome.driver","C:/Users/prabh/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static  WebDriver getdriver(){
		if (driver == null){
			System.setProperty("webdriver.chrome.driver","C:/Users/prabh/Downloads/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		}else{
			return driver;
		}
	}
}