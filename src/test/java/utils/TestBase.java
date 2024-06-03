package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//resources//config.properties");
		Properties prop =new Properties();
		prop.load(fis);
		String appURL=prop.getProperty("qaURL");
		
		
		if(driver==null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				driver=new ChromeDriver();
			}
			else
			{
				driver=new EdgeDriver();
			}
		    driver.get(appURL);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.manage().window().maximize();
		}
		
	    return driver;
	}

}
