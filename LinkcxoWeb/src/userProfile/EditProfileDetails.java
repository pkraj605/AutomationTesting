 package userProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class EditProfileDetails extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();


		//Click on profile
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/aside[1]/div/div[1]/div/div[1]/div/img")).click();
		Thread.sleep(7000);

		//click in edit icon
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']//div[@class='MuiBox-root css-16dyfly']//*[name()='svg']//*[name()='g' and @id='Layer_2']//*[name()='g' and @id='Layer_1-2']")).click();
		Thread.sleep(5000);

		//Edit first Name
		WebElement firstName=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[3]/form/div[1]/div/div[2]/div/div[1]/div/div/input"));
		firstName.sendKeys(Keys.CONTROL +"a");
		firstName.sendKeys("Manish");
		Thread.sleep(5000);

		//Edit Last name
		WebElement lastNameEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[3]/form/div[1]/div/div[3]/div/div[1]/div/div/input"));
		lastNameEdit.sendKeys(Keys.CONTROL +"a");
		lastNameEdit.sendKeys("Babu");
		Thread.sleep(5000);

		//Edit designation
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[3]/form/div[2]/div/div[2]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]/div/span")).click();
		Thread.sleep(5000);

		//Edit company Name
		WebElement postEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[3]/form/div[3]/div/div[2]/div/div/input"));
		postEdit.sendKeys(Keys.CONTROL +"a");
		postEdit.sendKeys("Micromax 2");
		Thread.sleep(5000);

		//Edit location Name
		WebElement locationEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/input"));
		locationEdit.sendKeys(Keys.CONTROL +"a");
		locationEdit.sendKeys("Bihar");
		Thread.sleep(5000);

		//Edit profile headline 
		WebElement headlineEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[3]/form/div[5]/div/div[2]/div/textarea[1]"));
		headlineEdit.sendKeys(Keys.CONTROL +"a");
		headlineEdit.sendKeys("Test headline");
		Thread.sleep(5000);

		//Edit bio
		WebElement bioEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[3]/form/div[6]/div/div[2]/div/textarea[1]"));
		bioEdit.sendKeys(Keys.CONTROL +"a");
		bioEdit.sendKeys("test");
		Thread.sleep(5000);

		//Edit website
		WebElement websiteEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[3]/form/div[7]/div/div[2]/div/div/input"));
		websiteEdit.sendKeys(Keys.CONTROL +"a");
		websiteEdit.sendKeys("www.alfatecprivate.com");
		Thread.sleep(5000);

		//Edit blog
		WebElement blogEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[3]/form/div[8]/div/div[2]/div/div/input"));
		blogEdit.sendKeys(Keys.CONTROL +"a");
		blogEdit.sendKeys("my first blog");
		Thread.sleep(5000);

		//Edit date of birth
		WebElement dobEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[3]/form/div[9]/div/div[2]/div/input"));
		dobEdit.sendKeys(Keys.CONTROL +"a");
		dobEdit.sendKeys("02/17/1990");
		Thread.sleep(5000);
		
		//Edit date of birth
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[3]/form/div[10]/div/button")).click();
		Thread.sleep(5000);
			
	}

}
