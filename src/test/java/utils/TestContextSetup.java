package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;


public class TestContextSetup {
	
	public WebDriver driver;
	public String productNameLanding;
	public PageObjectManager pom;
	public TestBase tb;
	public GenericUtils gul;
	
	public TestContextSetup() throws IOException
	{
		tb=new TestBase();
		pom = new PageObjectManager(tb.WebDriverManager());
		gul=new GenericUtils(tb.WebDriverManager());
	}
	
	

}
