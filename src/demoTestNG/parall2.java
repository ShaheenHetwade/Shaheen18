package demoTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parall2 {
@Test
public void tc2() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.close();
	}
}

