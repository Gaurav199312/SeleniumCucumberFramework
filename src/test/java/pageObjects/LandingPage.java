package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	private By search = By.xpath("//input[@type='search']");
	private By productName=By.cssSelector(".product-name");
	private By topDealsLink=By.linkText("Top Deals");
	private By increment=   By.cssSelector("a.increment");
	private By addToCart = By.cssSelector(".product-action button");

	
	public void searchItem(String product)
	{
		driver.findElement(search).sendKeys(product);
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText().split("-")[0].trim();
	}
	
	public void navigateToOffersPage()
	{
		driver.findElement(topDealsLink).click();
	}
	
	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}
	
	public void incrementQuantity(int quantity)
	{
		/*int i = quantity-1;
		while(i>0)
		{
			driver.findElement(increment).click();
			i--;
		}*/
		
		for(int i=1;i<=quantity-1;i++)
		{
			driver.findElement(increment).click();
		}
		
	}
	
	public void addToCart()
	{
		driver.findElement(addToCart).click();
	}


	

}
