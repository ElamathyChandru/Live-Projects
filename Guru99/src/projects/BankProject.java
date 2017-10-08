package projects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;;



public class BankProject {

	WebDriver driver;
	@BeforeSuite
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "D://Elamathy//chromedriver.exe");  
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Test
	public void Google() throws AWTException
	{
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr98514");
		driver.findElement(By.name("password")).sendKeys("jEhUzYp");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	String managerId=	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText();
		
	if (managerId.contains("Manger Id")) {
		System.out.println("Login Succesfull");
		
	}
	else {
		System.out.println("Login Unsuccesfull");
	}
	
	}

}