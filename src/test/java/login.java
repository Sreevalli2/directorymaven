import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	public static WebDriver driver;
	@BeforeTest
	public void setup() 
	{ 
	System.setProperty("webdriver.chrome.driver", "D:/Selenium Required/chromedriver_win/chromedriver.exe");
	 driver = new ChromeDriver();
	}
	@Test
	public void dologin()
	{
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("hi");
		
		driver.findElement(By.xpath("//input[@class='gNO89b']")).submit();
		driver.findElement(By.linkText("News")).click();
		}
	
	@AfterTest
	public void teardown() throws Exception
	{
	Thread.sleep(1500);
	driver.close();
	}

}
