package stepDefinitions;

import java.io.IOException;
import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.*;
import utils.TestContextSetup;

public class Hooks {
	
	TestContextSetup tcs;
	
	public Hooks(TestContextSetup tcs)
	{
		this.tcs=tcs;
	}
	
	@Before
	public void welcome()
	{
		System.out.println("*********Beginning execution***********");
	}
	@After
	public void tearDown() throws IOException
	{
		System.out.println("*********Ending execution***********");
		tcs.tb.WebDriverManager().quit();
		
	}
	
	@AfterStep
	public void addScreenshot(Scenario scn) throws IOException
	{
		WebDriver driver=tcs.tb.WebDriverManager();
		if(scn.isFailed())
		{
			File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=FileUtils.readFileToByteArray(sourcePath);
			scn.attach(fileContent, "image/png", "image");
		}
	}

}
