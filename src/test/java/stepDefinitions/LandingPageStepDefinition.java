package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LandingPageStepDefinition {
	
	
	LandingPage landingPage;
	public TestContextSetup tcs;
	
	public LandingPageStepDefinition(TestContextSetup tcs)
	{
		this.tcs=tcs;
		this.landingPage =tcs.pom.getLandingPage();
	}
	
	
	@Given("User is on GreenKart landing page")
	public void user_is_on_green_kart_landing_page() 
	{
		
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
	}
	
	
	@When("user search with short name {string} on home page and extract actual name of the product")
	public void user_search_with_short_name_on_home_page_and_extract_actual_name_of_the_product(String product) throws InterruptedException {
	    
		
		landingPage=tcs.pom.getLandingPage();
		landingPage.searchItem(product);
		
		
	    Thread.sleep(3000);
	    tcs.productNameLanding=landingPage.getProductName();
	    
	    System.out.println("Product on Home page: "+tcs.productNameLanding);
		
	}
	
	@When("^user search with short name (.+) on home page and extract actual name of the product for parameterized test$")
	public void user_search_with_short_name_tom_on_home_page_and_extract_actual_name_of_the_product(String product) throws InterruptedException
	{
		landingPage=tcs.pom.getLandingPage();
		landingPage.searchItem(product);
		
		
	    Thread.sleep(3000);
	    tcs.productNameLanding=landingPage.getProductName();
	    
	    System.out.println("Product on Home page: "+tcs.productNameLanding);
	}
	
	@When("Added {string} items of the selected product to cart")
	public void Added_items_product(String quantity)
	{
		
		landingPage.incrementQuantity(Integer.parseInt(quantity));
		landingPage.addToCart();
		
	}

	
	
}
