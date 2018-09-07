

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstDemo {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Desktop\\downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\dell\\Downloads\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com");
		
		

	}

}
