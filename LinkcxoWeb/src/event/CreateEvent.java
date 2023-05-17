package event;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class CreateEvent extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		
		//Click on Event Tab
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[3]/div[2]/h2")).click();
		Thread.sleep(5000);
		
		//Click on Create Event Button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[1]/div/button[3]/div/div/h5")).click();
		Thread.sleep(5000);

		
		//Select Image
				WebElement selImage = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[1]/div/div/div[1]/input"));
				selImage.sendKeys("D:/download.png");
				//selImage.sendKeys(Keys.ESCAPE);
				Thread.sleep(3000);
				
				//Put The event Name
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys("Personal Bangalore End");
				Thread.sleep(2000);
				
				//Put The event details
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[3]/div[2]/div/div[1]/div/textarea[1]")).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante,");
				Thread.sleep(2000);
				
		//Click on industry dropdown
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[4]/div[2]/div/div/div")).click();
				Thread.sleep(2000);
				
				WebElement act_ind = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul"));
				Thread.sleep(1000);
				// Multi_select_option industry
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]/div/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[4]/div/span")).click();
				act_ind.sendKeys(Keys.ESCAPE);
			
				
				
		//click on function dropdown
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[5]/div[2]/div/div/div")).click();
				Thread.sleep(2000);
				
				WebElement act_fun = driver.findElement(By.xpath("/html/body/div[3]/div[3]"));
				Thread.sleep(1000);
				// Multi_select_option function
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]/div/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]/div/span")).click();
				act_fun.sendKeys(Keys.ESCAPE);
				
				
		//click on category dropdown
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[6]/div[2]/div/div/div")).click();
				Thread.sleep(2000);
				
				WebElement act_cat = driver.findElement(By.xpath("/html/body/div[3]/div[3]"));
				Thread.sleep(1000);
				// Multi_select_option function
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]/div/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[4]/div/span")).click();
				act_cat.sendKeys(Keys.ESCAPE);
				
				
	//click on host dropdown
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[7]/div[2]/div/div/div")).click();
				Thread.sleep(2000);
				
				//select host type from dropdown
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
				Thread.sleep(2000);
				
				//indivisual evnts
				//driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]")).click();
				//Thread.sleep(2000);
				
				
				//enter registration link
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[8]/div[2]/div/div[1]/div/div/input")).sendKeys("https://in.bookmyshow.com/events/echoes-of-earth-music-festival-bangalore/ET00338442");
				Thread.sleep(2000);
				
				//select offline mode
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[9]/div[4]/div/div/div/label[2]/span[1]/input")).click();
				Thread.sleep(2000);
				
				//Enter address
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[10]/div[2]/div/div[1]/div/div/input")).sendKeys("Mumbai");
				Thread.sleep(2000);
				
				//select free mode
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[11]/div[4]/label/span[1]/input")).click();
				Thread.sleep(3000);
					
		//Select start date
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[12]/div[2]/div/div/div/div/button")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/div[2]/div/div[2]/div/div[5]/div[3]/button")).click();
				Thread.sleep(2000);
				
		//Select end date
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[13]/div[2]/div/div/div/div/button")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/div[2]/div/div[2]/div/div[5]/div[3]/button")).click();
				Thread.sleep(2000);
				
				//Enter start time
				WebElement etime=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[12]/div[4]/div/div/div/input"));
				etime.sendKeys(Keys.CONTROL +"a");
				etime.sendKeys("05:00 PM");
				Thread.sleep(3000);
				
				//Enter end time
				WebElement sTime=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[13]/div[4]/div/div/div/input"));
				sTime.sendKeys(Keys.CONTROL +"a");
				sTime.sendKeys("06:00 PM");
				Thread.sleep(3000);
				
		
		//click on select manually
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[15]/div[2]/div/div/div/label[2]/span[1]/input")).click();
				Thread.sleep(2000);
				
				//click on dropdown
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[1]/div/div/div/div/div[2]/div/div/div[1]/div/div/div")).click();
				Thread.sleep(2000);
				
				
				//Select end date
				WebElement sel_friend = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul"));
				Thread.sleep(1000);
				
				// Multi_select_option function
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]/div/span")).click();
				Thread.sleep(1000);
				//driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]/div/span")).click();
				sel_friend.sendKeys(Keys.ESCAPE);
				
				
				//click on cross button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[1]/div/div/div/div/div[1]/div[2]")).click();
				Thread.sleep(2000);
				
				
				//click on submitt button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[16]/div/button")).click();
				Thread.sleep(2000);
				
				
	}

}
