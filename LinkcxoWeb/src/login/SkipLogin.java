package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SkipLogin {
    public static void main(String[] args) {
    	
        // Create a new ChromeOptions object
        ChromeOptions options = new ChromeOptions();

        // Set the --disable-extensions option
        options.addArguments("--disable-extensions");

        // Set the --incognito option
        options.addArguments("--incognito");

        // Use the ChromeOptions object to create a new ChromeDriver instance
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the desired page
        driver.get("http://linkcxo-development-frontend.s3-website.ap-south-1.amazonaws.com/feed");
		    }


	}


