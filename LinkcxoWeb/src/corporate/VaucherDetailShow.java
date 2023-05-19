package corporate;
import org.openqa.selenium.By;
import commonClassLinkcxo.AuthCommon;
import commonClassLinkcxo.Superclass;

public class VaucherDetailShow extends Superclass{
public static void main(String[] args) throws InterruptedException {
		
		//Login
		AuthCommon auth = new AuthCommon();
		auth.login();
		Thread.sleep(4000);

		//click on corporate tab
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div/div[2]/div[3]/div[4]/div[2]/h2")).click();
		Thread.sleep(2000);
		
		//click on Voucher Tab
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div/div/div[1]/div/button[3]")).click();
		Thread.sleep(2000);
				
		//click on Realstate (Subpartner)
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/img")).click();
		//Thread.sleep(2000);
		
		
	}
	
}