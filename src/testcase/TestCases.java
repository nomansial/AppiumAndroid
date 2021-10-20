package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import config.BaseClass;
import pages.HomePage;


public class TestCases extends BaseClass {
	
		
	@Test
	public void testcase() throws InterruptedException {
		
		HomePage home = new HomePage(driver);
		
		home.CLickSearch();		
		home.Search();
		home.Add_Quantity();
		
	}
	
}
	


