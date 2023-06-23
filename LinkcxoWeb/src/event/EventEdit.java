package event;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class EventEdit extends Superclass{

	public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		
		//Click on event Tab
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[3]/div[2]/h2")).click();
				Thread.sleep(5000);
				
				//Click on host Tab 
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[1]/div/button[1]/div/h5[1]")).click();
				Thread.sleep(5000);

				//Click on Edit button
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div/div/div[2]/div/div[1]/div/button")).click();
				Thread.sleep(5000);
				
				
				//Select Image
						WebElement selImage = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[1]/div/div/div[1]/input"));
						selImage.sendKeys("D:/images.jpg");	
						Thread.sleep(3000);
											
						//Event name update
						WebElement eName=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[1]/div/div/input"));
						eName.sendKeys(Keys.CONTROL +"a");
						eName.sendKeys("Tech Park Event");
						Thread.sleep(5000);
						
						//Put The event details
						WebElement eDetail=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[3]/div[2]/div/div[1]/div/textarea[1]"));
						eDetail.sendKeys(Keys.CONTROL +"a");
						eDetail.sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante,");
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
						Thread.sleep(1000);
						driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[5]/div/span")).click();
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
						Thread.sleep(1000);
						driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[4]/div/span")).click();
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
						Thread.sleep(1000);
						driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[5]/div/span")).click();
						act_cat.sendKeys(Keys.ESCAPE);
						
						
			//click on host dropdown
						driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[7]/div[2]/div/div/div")).click();
						Thread.sleep(2000);
						
						//select host type from dropdown
						driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]")).click();
						Thread.sleep(2000);
						
						
						//enter registration link
						//WebElement selectRag=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[8]/div[2]/div/div[1]/div/div/input"));
						//selectRag.sendKeys(Keys.CONTROL +"a");
						//selectRag.sendKeys("https://insider.in/stand-up-comedy-night-viman-nagar-aug31-2022/event?platform=android");
						//Thread.sleep(2000);
						
						//click on online mode
						driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[8]/div[4]/div/div/div/label[1]/span[1]/input")).click();
						Thread.sleep(2000);
						
						//Enter online link
						driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[9]/div[2]/div/div[1]/div/div/input")).sendKeys("https://meet.google.com/kma-wmfs-rne");
						Thread.sleep(2000);
					
						//select free mode
						driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[10]/div[4]/label/span[1]/input")).click();
						Thread.sleep(3000);
				
						//Enter Event fees
						driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[10]/div[3]/div/div[1]/div/div/input")).sendKeys("3000");
						Thread.sleep(4000);
						
						
						//Select start date
						driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[11]/div[2]/div/div/div/div/button")).click();
						Thread.sleep(4000);
						driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/div[2]/div/div[2]/div/div[5]/div[4]/button")).click();
						Thread.sleep(3000);
						
						
						//Select end date
						driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[12]/div[2]/div/div/div/div/button")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/div[2]/div/div[2]/div/div[5]/div[4]/button")).click();
						Thread.sleep(2000);
						
						//Enter start time
						WebElement stime=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[11]/div[4]/div/div/div/input"));
						stime.sendKeys(Keys.CONTROL +"a");
						stime.sendKeys("06:00 PM");
						Thread.sleep(3000);
						
						//Enter end time
						WebElement eTime=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[12]/div[4]/div/div/div/input"));
						eTime.sendKeys(Keys.CONTROL +"a");
						eTime.sendKeys("07:00 PM");
						Thread.sleep(3000);
						
				
//			//click on select manually
//						driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[15]/div[2]/div/div/div/label[2]/span[1]/input")).click();
//						Thread.sleep(2000);
//						
//						//click on dropdown
//						driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[1]/div/div/div/div/div[2]/div/div/div[1]/div/div/div")).click();
//						Thread.sleep(2000);
//						
//						
//						//Select invitees
//						WebElement sel_friend = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul"));
//						Thread.sleep(1000);
//						
//						// Multi_select_option function
//						driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]/div/span")).click();
//						Thread.sleep(1000);
//						//driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]/div/span")).click();
//						//Thread.sleep(1000);
//						driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]/div/span")).click();
//						Thread.sleep(1000);
//						sel_friend.sendKeys(Keys.ESCAPE);
//						
//						
//						//click on cross button
//						driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[1]/div/div/div/div/div[1]/div[2]")).click();
//						Thread.sleep(2000);
//						
						
						//click on submitt button
						driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div[2]/div/form/div[14]/div/button")).click();
						Thread.sleep(2000);
						
						
	}

}

