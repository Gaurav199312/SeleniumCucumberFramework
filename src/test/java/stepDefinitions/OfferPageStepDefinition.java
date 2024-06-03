package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OfferPageStepDefinition {
	
	
	
	public String name;
	public Set<String> handles;
	public TestContextSetup tcs;
	
	public OfferPageStepDefinition(TestContextSetup tcs)
	{
		this.tcs=tcs;
	}
	
	@Then("user search the same short name {string} in offers page to check if the product exists")
	public void user_search_the_same_short_name_in_offers_page_to_check_if_the_product_exists(String product) {
	   
		switchingWindowHandles();
		
		OffersPage op1=tcs.pom.getOffersPage();
		op1.searchProduct(product);
		name=op1.getProductNameOffer();
	    Assert.assertEquals(tcs.productNameLanding, name);		
	    	
	    }
	
	@Then("^user search the same short name (.+) in offers page to check if the product exists for parameterized test$")
	public void user_search_the_same_short_name_tom_in_offers_page_to_check_if_the_product_exists(String product) {
		switchingWindowHandles();
		
		OffersPage op1=tcs.pom.getOffersPage();
		op1.searchProduct(product);
		name=op1.getProductNameOffer();
	    Assert.assertEquals(tcs.productNameLanding, name);	
	}
	    
	    
	    
	    
	   


	public void switchingWindowHandles()
	{
		LandingPage lp1=tcs.pom.getLandingPage();
		lp1.navigateToOffersPage();
		tcs.gul.switchWindow();   
	}
}
