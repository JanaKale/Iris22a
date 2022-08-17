package TestngData;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.testUtil;

public class LoginTest {

	WebDriver driver;

	@BeforeMethod

	public void SetUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");

	}
	
	@DataProvider
	public Object[][] getLoginData() {
		Object data [][]=testUtil.getTestData("login");
		return data;
	}
	
	@Test(dataProvider="getLoginData")
	public void loginTest(String username,String password) {
		
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		
		//click on login button
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		
		
	}

	@AfterMethod

	public void tearDown() {
		driver.quit();
	}
}
