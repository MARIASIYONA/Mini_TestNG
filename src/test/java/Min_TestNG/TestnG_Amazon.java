package Min_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestnG_Amazon {


WebDriver driver;

	

	@BeforeMethod

	public void setUp()

	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\balra\\eclipse-workspace01\\Mini_TestNG\\Driver\\chromedriver.exe");

	driver=new ChromeDriver();

	driver.get("https://www.amazon.in/");

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	

	@Test

	public void verifyTitle()

	{

	String actualTitle=driver.getTitle();

	String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

	

	AssertJUnit.assertEquals(actualTitle, expectedTitle);

	}

	

	@Test

	public void verifyLogo()

	{

	boolean flag=driver.findElement(By.xpath(" //a[@id='nav-logo-sprites']")).isDisplayed();

	

	AssertJUnit.assertTrue(flag);

	}

	

	
	@AfterMethod

	public void tearDown()

	{

	driver.quit();

	}




}

