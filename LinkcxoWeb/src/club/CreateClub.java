package club;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class CreateClub extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		String successCreate = null;
		
		//click on three dot tab
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[7]/button")).click();
		Thread.sleep(3000);
		
		//click on club tab
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/ul[1]/li[1]/div[2]/span")).click();
		Thread.sleep(4000);
		
		//click create club tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[1]/div/button[4]/div/div/h5")).click();
		Thread.sleep(4000);
				
		//click on select image icon
		WebElement selImageclub = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[1]/div/div/div[1]/input"));
		selImageclub.sendKeys("D:/images (13).jpg");
		Thread.sleep(3000);
		
		//Enter Club Title
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys("My First Club12");
		Thread.sleep(2000);
				
		//club Details
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[3]/div[2]/div/div[1]/div/textarea[1]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
		Thread.sleep(2000);
		
		//club type
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[4]/div[2]/div/div/div/label[2]/span[1]/input")).click();
		Thread.sleep(2000);
		
		//club fees
				//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[5]/div[3]/div/div[1]/div/div/input")).sendKeys("500");
				//Thread.sleep(2000);
		
				
				//club fees free
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[5]/div[4]/label/span[1]/input")).click();
				Thread.sleep(2000);
				
				//click on industry dropdown
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[6]/div[2]/div/div/div")).click();
				Thread.sleep(2000);
				
				WebElement indSelct=driver.findElement(By.xpath("/html/body/div[3]/div[3]"));
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]/div/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]/div/span")).click();
				indSelct.sendKeys(Keys.ESCAPE);
				
				//click on function dropdown
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[7]/div[2]/div/div/div")).click();
				Thread.sleep(2000);
				
				WebElement funSelct=driver.findElement(By.xpath("/html/body/div[3]/div[3]"));
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]/div/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]/div/span")).click();
				funSelct.sendKeys(Keys.ESCAPE);
				
				
				//select category
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[8]/div[2]/div/div/div")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]")).click();
				Thread.sleep(2000);
				
				//click on create button
				
				successCreate = "/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[9]/div/button";
				
				
				if(successCreate != null) {
					driver.findElement(By.xpath(successCreate)).click();
					Thread.sleep(2000);
									
					System.out.println("Club Create Successfull with Log");
					
				}
		
	}

}
