package testlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StartTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.diriver", "C:\\Selenium\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get ("https://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("canicianpetru@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.className("F9NWFb")).click();
		Thread.sleep(3000);
		String at = driver.getTitle();
		String et = "gmail";
		System.out.println(at);
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println ("Test Successful");
		
		}
		else
		{
			System.out.println("Test Failure");
		}
	}

}
