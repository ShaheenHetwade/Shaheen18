package loadClose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.close();

		


	}

}
