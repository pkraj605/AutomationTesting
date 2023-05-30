package companyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class CompanyPageEdit extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		Thread.sleep(6000);
		
		//Click on profile
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/aside[1]/div/div[1]/div/div[1]/div/img")).click();
				Thread.sleep(5000);

				//click on three dots
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[1]/div/button")).click();
				Thread.sleep(4000);
		
				//click on create company page
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[1]/div/div/div/div/ul/li[2]/div/span")).click();
				Thread.sleep(3000);
				
				//click on Edit button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[5]/div/div[2]/div/div/button")).click();
				Thread.sleep(3000);
								
				//Select Image
				WebElement selImage1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[1]/div/div/div[1]/input"));
				selImage1.sendKeys("D:/download.png");
				//selImage.sendKeys(Keys.ESCAPE);
				Thread.sleep(6000);
							
				//Enter Name
				WebElement namrEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[1]/div/div/input"));
				namrEdit.sendKeys(Keys.CONTROL +"a");
				namrEdit.sendKeys("Dell");
				Thread.sleep(5000);
				
				//Replace Tag line
				WebElement tagReplace=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[2]/div[2]/div/div[1]/div/div/input"));
				tagReplace.sendKeys(Keys.CONTROL +"a");
				tagReplace.sendKeys("Best we are doing");
				Thread.sleep(5000);
				
				//Replace Page Name
				WebElement pageReplace=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[4]/div[2]/div/div[1]/div/div/input"));
				pageReplace.sendKeys(Keys.CONTROL +"a");
				pageReplace.sendKeys("Dell Page");
				Thread.sleep(5000);
								
				// Replace industry
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[5]/div[2]/div/div/div")).click();
				Thread.sleep(4000);
				
				//Replace industry
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[6]/div/span")).click();
				Thread.sleep(4000);
				
				//Replace Size
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[6]/div[2]/div/div/div")).click();
				Thread.sleep(4000);
				
				//Replace Size
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]")).click();
				Thread.sleep(4000);
				
			    //Replace Regestration Type
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[7]/div[2]/div/div/div")).click();
				Thread.sleep(4000);
				
				//Replace Regestration Type
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[6]")).click();
				Thread.sleep(4000);
						
				
				//Replace Page Name
				WebElement descReplace=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[9]/div[2]/div/div[1]/div/textarea[1]"));
				descReplace.sendKeys(Keys.CONTROL +"a");
				descReplace.sendKeys("Update text data");
				Thread.sleep(5000);
				
				//Click on T&C
				//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[10]/div/span/input")).click();
				//Thread.sleep(4000);				
				
				//Click on update  button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[2]/div/div[2]/div/form/div[11]/div/button")).click();
				Thread.sleep(4000);		
				
				
	}
	
}