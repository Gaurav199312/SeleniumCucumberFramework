package utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void switchWindow()
	{
		 Set<String> handles=driver.getWindowHandles();
		    
		    for(String handle:handles)
		    {
		    	driver.switchTo().window(handle);
		    	String url=driver.getCurrentUrl();
		    	if(!url.contains("offers"))
		    	{
		    		continue;
		    	}
		    }
	}
	
	public void switchWindowCheckout()
	{
		 Set<String> handles=driver.getWindowHandles();
		    
		    for(String handle:handles)
		    {
		    	driver.switchTo().window(handle);
		    	String url=driver.getCurrentUrl();
		    	if(!url.contains("cart"))
		    	{
		    		continue;
		    	}
		    }
	}

}
