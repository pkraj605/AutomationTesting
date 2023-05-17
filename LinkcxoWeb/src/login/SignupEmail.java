package login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupEmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://linkcxo-frontend-testing.s3-website.ap-south-1.amazonaws.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// click on be a member
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/header/div/div[3]/button/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//h5[text()='Sign Up']")).click();
		//click on Email field
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/span/span[1]/input")).click();
		Thread.sleep(2000);

		//Enter Email Id
		driver.findElement(By.id("outlined-basic")).sendKeys("prabhat@linkcxo.com");

		//Send Button Key
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div/div/div[2]")).click();
		Thread.sleep(30000);

		//Submit button
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[3]/div/button")).click();
		Thread.sleep(3000);

		// first name
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[1]/div/div[2]/div[1]/div/div/input"))
		.sendKeys("Pankaj");
		Thread.sleep(1000);

		// last name
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div[1]/div/div/input"))
		.sendKeys("Kumar");
		Thread.sleep(1000);
		// Company Name
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[2]/div/div[2]/div[1]/div/div/input"))
		.sendKeys("Micromax");
		Thread.sleep(1000);
		// Designation
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[3]/div/div[2]/div/div/div"))
		.click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[4]")).click();
		Thread.sleep(1000);

		// Total Years of experience
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[4]/div/div[2]/div[1]/div/div/input"))
		.sendKeys("15");
		Thread.sleep(1000);

		// Industry Drop Down radio button
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[5]/div/div[2]")).click();
		Thread.sleep(1000);
		WebElement act_ind = driver.findElement(By.xpath("//div[contains(@class,'MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiMenu-paper MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper css-zzhupx')]"));
		Thread.sleep(1000);

		// Multi_select_option
		driver.findElement(By.xpath("//div[@id='menu-']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiMenu-paper MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper css-zzhupx']/ul/li[4]"))
		.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='menu-']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiMenu-paper MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper css-zzhupx']/ul/li[5]"))
		.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='menu-']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiMenu-paper MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper css-zzhupx']/ul/li[8]"))
		.click();
		act_ind.sendKeys(Keys.ESCAPE);

		// function Drop Down radio button
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[6]/div/div[2]/div/div/div"))
		.click();
		Thread.sleep(1000);
		WebElement act_fun = driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiMenu-paper MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper css-zzhupx']"));
		Thread.sleep(1000);

		// Multi_select_option
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]/div/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]/div/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]/div/span")).click();
		act_fun.sendKeys(Keys.ESCAPE);

		// Enter Mobile no
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[7]/div/div[3]/div/div[1]/div/div/input"))
		.sendKeys("8969229391");

		// Enter Location
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[8]/div/div[2]/div[1]/div/div/input")).sendKeys("Bihar");

		// Enter date of birth
		
		WebElement bday1=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[9]/div/div[2]/div/div/input"));
		bday1.sendKeys(Keys.CONTROL +"a");
		bday1.sendKeys("12/05/1989");
		Thread.sleep(3000);


		// Enter linkedin URL
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[10]/div/div[2]/div[1]/div/div/input")).sendKeys("https://www.linkedin.com/in/anand-ganesh-joshi-2494472/");
		Thread.sleep(1000);
				
		// Submitt
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[11]/div/button")).click();
		Thread.sleep(1000);


	}

}
