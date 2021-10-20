package config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	protected AndroidDriver<AndroidElement> driver = null;
	
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		DesiredCapabilities cap =new DesiredCapabilities();
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability(MobileCapabilityType.UDID, "R58R22JW2FV");
		cap.setCapability("appPackage", "com.ikea.alfuttaim.store");
		cap.setCapability("appActivity", "com.ikea.kompis.SplashActivity");
		driver = new AndroidDriver<>(new URL("http://127.0.0.2:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
	
	@AfterMethod
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
	}

}
