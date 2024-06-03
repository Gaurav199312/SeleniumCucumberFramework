package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public LandingPage lp;
	public OffersPage op;
	public CheckoutPage cop;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public LandingPage getLandingPage()
	{
		lp=new LandingPage(driver);
		return lp;
	}
	
	public OffersPage getOffersPage()
	{
		op=new OffersPage(driver);
		return op;
	}
	
	public CheckoutPage getCheckoutPage()
	{
		cop = new CheckoutPage(driver);
		return cop;
	}


}
