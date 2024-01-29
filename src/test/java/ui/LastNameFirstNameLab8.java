package ui;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LastNameFirstNameLab8
{
private static WebDriver driver = null;
	
	@BeforeAll
	static void Setup() {
		//System.setProperty("webdriver.edge.driver", "C:\\browserdrivers\\msedgedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
		Logger.getLogger("").setLevel(Level.OFF);
		
		driver = new ChromeDriver();
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	}
	
	@AfterAll
	static void TearDown() {
		//driver.close();
	}
	
	@Test
	void TestDemo_guru99_com(){
		String baseUrl = "http://google.ca";
		String searchString = "demo guru99";
		String expectedTitle = "demo guru99";
		String expectedUrl = "https://demo.guru99.com/";
		
		
		driver.get(baseUrl);
		
		WebElement testBox = driver.findElement(By.name("q"));
		testBox.sendKeys(searchString);
		
		WebElement searchButton = driver.findElement(By.name("btnK"));
		searchButton.submit();
		
		WebElement firstResult = driver.findElement(By.tagName("h3"));
		firstResult.click();
		
		WebElement new_Tours = driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/test/newtours/']"));
		new_Tours.click();
		
		WebElement Register = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		Register.click();
		
		
		driver.findElement(By.name("firstName")).sendKeys("Anthony");
		driver.findElement(By.name("lastName")).sendKeys("Nwankwo");
		driver.findElement(By.name("phone")).sendKeys("223543");
		driver.findElement(By.name("userName")).sendKeys("test@gmail.com");	
		driver.findElement(By.name("address1")).sendKeys("2235 Blackwater");
		driver.findElement(By.name("city")).sendKeys("London");
		driver.findElement(By.name("state")).sendKeys("Ontario");
		driver.findElement(By.name("postalCode")).sendKeys("N5X 0L8");
		driver.findElement(By.name("country")).sendKeys("CANADA");
		driver.findElement(By.name("email")).sendKeys("demo@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Nonso@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Nonso@123");
		
		driver.findElement(By.name("submit")).click();
		
	}

}
