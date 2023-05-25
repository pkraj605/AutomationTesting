package companyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class JobCreate extends Superclass{

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
		
				//click on Manage company page
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[1]/div/div/div/div/ul/li[2]/div/span")).click();
				Thread.sleep(3000);
				
				//click to view company page
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div[1]/div[2]/div/div[1]/div/div[1]/div/div/div/img")).click();
				Thread.sleep(3000);
				
				//click on Create Button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div[1]/div/div/div/button[5]/div/h5[1]")).click();
				Thread.sleep(3000);
				
				//click on Job Create
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[1]/div/div/div/div[2]/div[4]/div[2]/h6")).click();
				Thread.sleep(4000);
				
				//Enter Job title
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys("Automation Tester Job");
				Thread.sleep(7000);
				
				//Enter company name
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys("Micromax");
				Thread.sleep(7000);
				
				
				//click on industry dropdown
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[3]/div[2]/div/div/div")).click();
				Thread.sleep(4000);

				//select card where the all option is showing
				WebElement act_ind1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]"));
				Thread.sleep(2000);

				// Multi_select_option
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]/div/span")).click();
				Thread.sleep(2000);

				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[9]/div/span")).click();
				Thread.sleep(2000);
				act_ind1.sendKeys(Keys.ESCAPE);
				
				//click on function dropdown
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[4]/div[2]/div/div/div")).click();
				Thread.sleep(4000);

				//select card where the all option is showing
				WebElement act_fun1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]"));
				Thread.sleep(2000);

				// Multi_select_option
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]/div/span")).click();
				Thread.sleep(2000);

				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]/div/span")).click();
				Thread.sleep(2000);
				act_fun1.sendKeys(Keys.ESCAPE);

				//click on min salry dropdown
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[5]/div[2]/div[2]/div[1]/div/div/div")).click();
				Thread.sleep(2000);

				//click on select smin alry from dropdown
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
				Thread.sleep(2000);

				//click on max salry dropdown
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[5]/div[2]/div[2]/div[2]/div/div/div")).click();
				Thread.sleep(2000);

				//click on select max salry from dropdown
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[5]")).click();
				Thread.sleep(2000);

				//click on change location
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[6]/div[2]/div/div[1]/div/div/input")).sendKeys("Pune");
				Thread.sleep(2000);		

				//click on job type
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[8]/div[2]/div/div/div")).click();
				Thread.sleep(2000);

				//click on job type
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
				Thread.sleep(2000);


				//click on min experience
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[8]/div[2]/div[2]/div[1]/div/div/div")).click();
				Thread.sleep(2000);
				//click on select min experience
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
				Thread.sleep(2000);	

				//click on max experience
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[8]/div[2]/div[2]/div[2]/div/div/div")).click();
				Thread.sleep(2000);
				//click on select max experience
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[5]")).click();
				Thread.sleep(2000);

				//click on hiring for client
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[9]/div[2]/div/div/div/label[2]/span[1]/input")).click();
				Thread.sleep(2000);	


				//click on change qualification
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[10]/div[2]/div/div[1]/div/div/input")).sendKeys("BCA, MBA");
				Thread.sleep(3000);

				//click on change skills
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[11]/div[2]/div/div[1]/div/div/input")).sendKeys("java, python");
				Thread.sleep(3000);


				//click update  jd details
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[14]/div[2]/div/div/div/textarea[1]")).sendKeys("Job Details");
				Thread.sleep(2000);

				//click on submitt button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[15]/div/button")).click();
				Thread.sleep(2000);

				
				
				
				
	}
	
}