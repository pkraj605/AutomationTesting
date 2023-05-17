package notification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

import org.openqa.selenium.JavascriptExecutor;

public class NotificationTab extends Superclass {

	    
		public static void main(String[] args) throws InterruptedException {
			
			//Login
			AuthCommon auth = new AuthCommon();
			auth.login();
			
			//Notification tab click
			driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit MuiIconButton-sizeLarge css-vdl3z5']//span[@class='BaseBadge-root root css-1rzb3uu']//*[name()='svg']")).click();
			Thread.sleep(10000);
			
				
			// click on down-ward
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[14]/div[1]"));
			js.executeScript("arguments[0].scrollIntoView();",Element );
		    Thread.sleep(5000);
		    
		    //second scroll
		    JavascriptExecutor js1 = (JavascriptExecutor) driver;
			WebElement Element1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div/div/div[2]/div[19]/div[2]/div[1]/div/span[1]/div/h5s"));
			js1.executeScript("arguments[0].scrollIntoView();",Element1 );
		    Thread.sleep(3000);

		}				

}
