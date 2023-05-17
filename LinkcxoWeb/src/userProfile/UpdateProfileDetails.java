package userProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class UpdateProfileDetails extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();


		//Click on profile
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/aside[1]/div/div[1]/div/div[1]/div/img")).click();
		Thread.sleep(6000);

		//----------1  Add Skills--------------------
		
//				//Click on skill
//				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[4]/div[2]/div/p/div[1]/div/div[1]/div[1]/div/div[1]/div[2]/h2s")).click();
//				Thread.sleep(5000);
//		
//				//Click on skill
//				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[4]/div[2]/div/p/div[1]/div/div[1]/div[1]/div/div[2]/h2s")).click();
//				Thread.sleep(5000);
//		
//				// Add new skills
//				WebElement addSkill=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div/div[1]/div/input"));
//				addSkill.sendKeys("React-N");
//				addSkill.sendKeys(Keys.ENTER);
//				Thread.sleep(5000);
//				
//				//Save Button
//				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div/div/button")).click();
//				Thread.sleep(5000);
//		
//			
		
		//---------2 Add New Interest-----------------------
		
//				//Add new interest
//				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[4]/div[2]/div/p/div[2]/div/div[1]/div[1]/div/div[2]/h2s")).click();
//				Thread.sleep(5000);
//						
//				// Add interest
//				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div/div/input")).sendKeys("Technology 6");
//				Thread.sleep(5000);
//				
//				// Submit button
//				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/button")).click();
//				Thread.sleep(5000);
//		
		
		//----------3--Add New Industry-----------------------
				
//				//Add new industry
//				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[4]/div[2]/div/p/div[3]/div/div[1]/div[1]/div/div[2]/h2s")).click();
//				Thread.sleep(5000);
//		
//				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div")).click();
//				Thread.sleep(5000);
//		
//				WebElement act_indus = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul"));
//				Thread.sleep(5000);
//		
//				// Multi_select_option
//				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[7]/div/span")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]/div/span")).click();
//				act_indus.sendKeys(Keys.ESCAPE);
//		
//				 //Submit button
//				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/button")).click();
//				Thread.sleep(5000);
		
		
		//----------4--Add New Function---------------------
	
		//Add new function
//				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[4]/div[2]/div/p/div[4]/div/div[1]/div[1]/div/div[2]/h2s")).click();
//				Thread.sleep(5000);
//
//				//Add function Name
//				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div")).click();
//				Thread.sleep(5000);
//
//				WebElement act_indus1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul"));
//				Thread.sleep(5000);
//		
//				// Multi_select_option
//				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]/div/span")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[6]/div/span")).click();
//				act_indus1.sendKeys(Keys.ESCAPE);
//		
//				 //Submit button
//				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div/div/button")).click();
//				Thread.sleep(5000);
		
		//----------5---Add experience---------------------
		
//		//Add experience
//		
//		  driver.findElement(By.xpath(
//		  "/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[4]/div[2]/div/p/div[5]/div/div[1]/div[1]/div/div[2]/h2s"
//		  )).click(); Thread.sleep(5000);
//		  
//		  //Company name driver.findElement(By.xpath(
//		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[1]/div/div[2]/div/div/input"
//		  )).sendKeys("Alfatech PVT LMT"); Thread.sleep(3000);
//		  
//		  //Designation Name driver.findElement(By.xpath(
//		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[2]/div/div/div/div/div"
//		  )).click(); Thread.sleep(3000);
//		  
//		  //Select Designation
//		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[7]/div/span")).
//		  click(); Thread.sleep(3000);
//		  
//		  //Industry Name driver.findElement(By.xpath(
//		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[3]/div/div/div/div/div"
//		  )).click(); Thread.sleep(3000);
//		  
//		  //Select Industry
//		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]/div/span")).
//		  click(); Thread.sleep(3000);
//		  
//		  //Function Name driver.findElement(By.xpath(
//		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[4]/div/div/div/div/div"
//		  )).click(); Thread.sleep(3000);
//		  
//		  //Select function
//		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[9]/div/span")).
//		  click(); Thread.sleep(3000);
//		  
//		  //Location driver.findElement(By.xpath(
//		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[5]/div/div[2]/div/div/input"
//		  )).sendKeys("Delhi"); Thread.sleep(3000);
//		  
//		  // Enter Start date 
//		  WebElement std_date=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[6]/div/div[2]/div/input")); 
//		  std_date.sendKeys(Keys.CONTROL +"a"); 
//		  std_date.sendKeys("20/02/2021");
//		  Thread.sleep(3000); 
//		  std_date.sendKeys(Keys.ESCAPE);
//		  
//		  // Enter Start date 
//		  WebElement e2_date=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[7]/div/div[2]/div/input")); 
//		  e2_date.sendKeys(Keys.CONTROL +"a"); 
//		  e2_date.sendKeys("22/03/2022");
//		  Thread.sleep(3000); 
//		  e2_date.sendKeys(Keys.ESCAPE);
//		  
//		  //Still working driver.findElement(By.xpath(
//		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[8]/div/div/div/label[2]/span[1]/input"
//		  )).click(); Thread.sleep(3000);
//		  
//		  //Details driver.findElement(By.xpath(
//		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[9]/div/div[2]/div/textarea[1]"
//		  )).sendKeys(" dsfhsdkjgf ghfhdgs"); Thread.sleep(3000);
//		  
//		  // Submitt driver.findElement(By.xpath(
//		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[10]/div/button"
//		  )).click(); Thread.sleep(3000);
//		 
		
		
		//----------6---Add education---------------------
		
		// Add education
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[4]/div[2]/div/p/div[6]/div/div[1]/div[1]/div/div[2]/h2s")).click();
		Thread.sleep(5000);
		
		//Board
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[1]/div/div[2]/div/div/input")).sendKeys("Bihar");
		Thread.sleep(5000);
		
		//Degree
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[2]/div/div[2]/div/div/input")).sendKeys("B.tech");
		Thread.sleep(5000);
		
		//Passing Year
		WebElement s3_date=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/input"));
			s3_date.sendKeys(Keys.CONTROL +"a");
			s3_date.sendKeys("2018");
			Thread.sleep(5000);
			//s3_date.sendKeys(Keys.ESCAPE);
		
		//Details
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[4]/div/div[2]/div/textarea[1]")).sendKeys(" Test Data");
		Thread.sleep(5000);
		
		//Submitt
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[5]/div/button")).click();
		Thread.sleep(5000);
		
		//----------7---Add New Affiliation---------------------
		
		//Add new Affiliation
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[4]/div[2]/div/p/div[7]/div/div[1]/div[1]/div/div[2]/h2s")).click();
		Thread.sleep(5000);

		//Add Name
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[1]/div/div[2]/div/div/input")).sendKeys("New Affiliation");
		Thread.sleep(5000);

		//Add Role
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[2]/div/div[2]/div/div/input")).sendKeys("Manager1");
		Thread.sleep(5000);

		//Add Passing Year
		// Enter Start date
		WebElement s1_date=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/input"));
		s1_date.sendKeys(Keys.CONTROL +"a");
		s1_date.sendKeys("14/03/2021");
		Thread.sleep(5000);
		//s1_date.sendKeys(Keys.ESCAPE);

		// Enter Start date
		WebElement e1_date=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[4]/div/div[2]/div/input"));
		e1_date.sendKeys(Keys.CONTROL +"a");
		e1_date.sendKeys("14/05/2021");
		Thread.sleep(5000);
		//e1_date.sendKeys(Keys.ESCAPE);

		//Add Details
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[5]/div/div[2]/div/textarea[1]")).sendKeys("Test Data1");
		Thread.sleep(5000);


		//Add Button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[6]/div/button")).click();
		Thread.sleep(5000);

		//----------8---Add Reward ---------------------
		
		//Add Reward
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[4]/div[2]/div/p/div[8]/div/div[1]/div[1]/div/div[2]/h2s")).click();
		Thread.sleep(5000);

		//Name
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[1]/div/div[2]/div/div/input")).sendKeys("Best Tester");
		Thread.sleep(5000);
		
		//By
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[2]/div/div[2]/div/div/input")).sendKeys("Gyanesh");
		Thread.sleep(5000);
				
		//Details
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/textarea[1]")).sendKeys("Test Data1");
		Thread.sleep(5000);
		
		//Add 
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[4]/div/button")).click();
		Thread.sleep(5000);		

		
		
		
		//------------9--Add Publication----------------------------
		
		
		//Add Publication
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[4]/div[2]/div/p/div[9]/div/div[1]/div[1]/div/div[2]/h2s")).click();
		Thread.sleep(5000);

		//Add Name
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[1]/div/div[2]/div/div/input")).sendKeys("Prabhat Publication");
		Thread.sleep(5000);

		//Add Date
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[2]/div/div[2]/div/input")).click();
		//Thread.sleep(5000);

		// Enter Start date
		WebElement s11_date=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[2]/div/div[2]/div/input"));
		s11_date.sendKeys(Keys.CONTROL +"a");
		s11_date.sendKeys("14/09/2021");
		Thread.sleep(5000);
		s11_date.sendKeys(Keys.ESCAPE);


		//Add Details
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/div/input")).sendKeys("https://www.linkedin.com/in/jyocherian/");
		Thread.sleep(5000);


		//Add Button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[4]/div/div[2]/div/textarea[1]")).sendKeys("Test Data");
		Thread.sleep(5000);
		
		//Add Details
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[5]/div/button")).click();
		Thread.sleep(5000);
		
		//------------10--Add Language----------------------------
		
		//Add Langauge
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div/div/div/div[4]/div[2]/div/p/div[10]/div/div[1]/div[1]/div/div[2]/h2s")).click();
		Thread.sleep(5000);
		
		//dropdown
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[1]/div/div/div/div/div")).click();
		Thread.sleep(5000);
				
		//select language
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[8]/div/span")).click();
		Thread.sleep(5000);
		
		//Languages Proficiancy
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div/label[1]/span[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div/label[3]/span[2]")).click();
		Thread.sleep(5000);
				
		//Reading
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[3]/div/div/div/label[1]/span[1]/input")).click();
		Thread.sleep(5000);
		
		//Writing
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[4]/div/div/div/label[1]/span[1]/input")).click();
		Thread.sleep(5000);
		
		//Speaking
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[5]/div/div/div/label[1]/span[1]/input")).click();
		Thread.sleep(5000);
				
		//Submitt
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/form/div[6]/div/button")).click();
		Thread.sleep(5000);
		
	}

}
