package codenbox.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WdManagerTest {

	public WebDriver driver;

	@BeforeMethod
	public void initializeDriver() {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\SeleniumWork\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		/*
		 * WebDriverManager.chromedriver().setup();
		 * WebDriverManager.firefoxdriver().setup();
		 * WebDriverManager.operadriver().setup(); WebDriverManager.phantomjs().setup();
		 * WebDriverManager.edgedriver().setup(); WebDriverManager.iedriver().setup();
		 */

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

	}

	@Test
	public void codenboxTest() {

		driver.get("http://codenboxautomationlab.com/");
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
