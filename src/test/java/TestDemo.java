import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.AmazonHomePage;
import POM.ProductPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {
	WebDriver driver;
@BeforeMethod
public void Bmethod()
{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
}
	@Test
	public void mainScript() throws InterruptedException
	{
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	AmazonHomePage ah= new AmazonHomePage(driver);
	ah.searchProduct(" iPhone XR (64GB) - Yellow. ");
	Thread.sleep(1000);
	ah.onClick();
	Thread.sleep(2000);
	ProductPage pp= new ProductPage(driver);
	pp.getPrice();
	}
	@Test
	public void mainScript1() throws InterruptedException
	{
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	AmazonHomePage ah= new AmazonHomePage(driver);
	ah.fsearchproduct(" iPhone XR (64GB) - Yellow. ");
	Thread.sleep(1000);
	ah.fonClick();
	Thread.sleep(2000);
	ProductPage pp= new ProductPage(driver);
	pp.fgetPrice();
	Thread.sleep(2000);
	pp.comparePrice();
	}
//	
//	@Test
//	public void mainScript2() throws InterruptedException
//	{
//	
//	ProductPage pp= new ProductPage(driver);
//	pp.comparePrice();
//	}
	
}
