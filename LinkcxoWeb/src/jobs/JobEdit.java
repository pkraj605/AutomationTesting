package jobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class JobEdit extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();

		//click on job Module
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[2]/div[2]/h2")).click();
		Thread.sleep(4000);

		//click on hire tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/button[2]/div/h5[1]")).click();
		Thread.sleep(4000);
		
		//click on open job tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[1]/div/div/button[1]/div/h5s")).click();
		Thread.sleep(4000);
		

		//click job edit tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/div/button")).click();
		Thread.sleep(4000);

		//click on job status-dropdown
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/div/div")).click();
		Thread.sleep(4000);

		//click on job status change tab
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
		Thread.sleep(4000);

		//Replace the Job title name
		WebElement titleEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[2]/div[2]/div/div[1]/div/div/input"));
		titleEdit.sendKeys(Keys.CONTROL +"a");
		titleEdit.sendKeys("Bank Manager");
		Thread.sleep(5000);

		//click on change company name
		WebElement compEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[3]/div[1]/div[2]/div/div[1]/div/div/input"));
		compEdit.sendKeys(Keys.CONTROL +"a");
		compEdit.sendKeys("Micromax");
		Thread.sleep(5000);


		//click on industry dropdown
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[4]/div[2]/div/div/div")).click();
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
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[5]/div[2]/div/div/div")).click();
		Thread.sleep(4000);

		//select card where the all option is showing
		WebElement act_fun1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]"));
		Thread.sleep(2000);

		// Multi_select_option
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]/div/span")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]/div/span")).click();
		Thread.sleep(2000);
		act_fun1.sendKeys(Keys.ESCAPE);
		
		//click on min salry dropdown
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[6]/div[2]/div[2]/div[1]/div/div/div")).click();
				Thread.sleep(4000);
				
				//click on select smin alry from dropdown
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[5]")).click();
				Thread.sleep(4000);
				
				//click on max salry dropdown
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[6]/div[2]/div[2]/div[2]/div/div/div")).click();
				Thread.sleep(4000);
				
				//click on select max salry from dropdown
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]")).click();
				Thread.sleep(4000);
				
				//click on change location
				WebElement locEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[7]/div[2]/div/div[1]/div/div/input"));
				locEdit.sendKeys(Keys.CONTROL +"a");
				locEdit.sendKeys("Pune");
				Thread.sleep(5000);		
				
				//click on job type
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[8]/div[2]/div/div/div")).click();
				Thread.sleep(4000);
			
				//click on job type
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
				Thread.sleep(4000);
				
						
				//click on min experience
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[9]/div[2]/div[2]/div[1]/div/div/div")).click();
				Thread.sleep(4000);
						
				//click on select min experience
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[9]")).click();
				Thread.sleep(4000);	
				
				//click on max experience
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[9]/div[2]/div[2]/div[2]/div/div/div")).click();
				Thread.sleep(4000);
						
				//click on select max experience
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[5]")).click();
				Thread.sleep(4000);
					
				//click on hiring for
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[10]/div[2]/div/div/div/label[2]/span[1]")).click();
				Thread.sleep(4000);	
				
				
				//click on change qualification
				WebElement qualifEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[11]/div[2]/div/div[1]/div/div/input"));
				qualifEdit.sendKeys(Keys.CONTROL +"a");
				qualifEdit.sendKeys("BCA, MBA");
				Thread.sleep(5000);
				
				//click on change skills
				WebElement skillEdit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[12]/div[2]/div/div[1]/div/div/input"));
				skillEdit.sendKeys(Keys.CONTROL +"a");
				skillEdit.sendKeys("java, python");
				Thread.sleep(5000);
							
				//click update  jd details
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[14]/div[2]/div/div/div/textarea[1]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book");
				Thread.sleep(4000);
				
				//click on submitt button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[15]/div/button")).click();
				Thread.sleep(4000);
						
	}

}
