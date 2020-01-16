package mavenbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
	public WebDriver driver;
	@Test
   public void Launchbrowser()
   {
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   System.out.println("Browser Launch");
   }
}
