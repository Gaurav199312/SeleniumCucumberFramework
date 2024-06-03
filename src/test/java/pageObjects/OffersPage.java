package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	
public WebDriver driver;
	
	public OffersPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	private By searchBar = By.id("search-field");
	private By productNameOffer = By.xpath("//table[contains(@class,'table')]//tbody//tr//td");
	
	public void searchProduct(String product)
	{
		driver.findElement(searchBar).sendKeys(product);
	}
	
	public String getProductNameOffer()
	{
		return driver.findElement(productNameOffer).getText();
	}

}
