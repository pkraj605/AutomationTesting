package jobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class JobApply extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();


		//click on job Module
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[2]/div[2]/h2")).click();
		Thread.sleep(4000);

		//click on search Tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/button[1]/div/div/h5[1]")).click();
		Thread.sleep(3000);

		//click on recomended jobs Tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[1]/div/div/button[1]/div/h5")).click();
		Thread.sleep(3000);


		//click on apply job button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[3]/div/div[2]/div/div/div/div/div/div[1]/div/div/div[2]/div/div[2]/div[1]/div/button")).click();
		Thread.sleep(3000);

		//click enter text
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div/div[3]/div/div/textarea[1]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley");
		Thread.sleep(8000);

		//Document cv Upload
		WebElement chooseDoc = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div/div[4]/div[1]/div/div[1]/input"));
		chooseDoc.sendKeys("C:/Users/prabh/OneDrive/Desktop/pemp file/Manual Interview Questions.pdf");
		Thread.sleep(7000);


		//click on salart crore ctc dropdown button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div/div[4]/div[2]/div[2]/div[2]/div/div/div/div/div/div/button")).click();
		Thread.sleep(20000);


		//click on salart crore ctc select from dropdown 
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div/div[4]/div[2]/div[2]/div[3]/div/div/div/div/div/div/button")).click();
		Thread.sleep(4000);


		//click on salart ctc in lakhs dropdown button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div/div[4]/div[2]/div[2]/div[2]/div/div/div/div/div/input")).click();
		Thread.sleep(4000);


		//click on salart lakhs ctc select from dropdown  
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div/div[4]/div[2]/div[2]/div[3]/div/div/div/div/div/input")).click();										
		Thread.sleep(4000);

		//click on Submit button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div/div[5]/div/button")).click();
		Thread.sleep(4000);
	}
}
