package pages;

import config.BaseClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	public AndroidDriver<AndroidElement> driver;

	public HomePage(AppiumDriver<AndroidElement> driver)
	{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id="com.ikea.alfuttaim.store:id/textView7")
	private AndroidElement Search_Field;
	
	
	@AndroidFindBy(id="com.ikea.alfuttaim.store:id/search_products_text_view")
	private AndroidElement Search_Second_Field;
	
	@AndroidFindBy(id="com.ikea.alfuttaim.store:id/tv_text")
	private AndroidElement Click_Search;
	
	@AndroidFindBy(id="com.ikea.alfuttaim.store:id/iv_product")
	private AndroidElement product;
	
	@AndroidFindBy(id="com.ikea.alfuttaim.store:id/tv_product_name")
	private AndroidElement pro_Des;
	
	@AndroidFindBy(id="com.ikea.alfuttaim.store:id/tv_regular_price")
	private AndroidElement Price_Listing;
	
	@AndroidFindBy(id="com.ikea.alfuttaim.store:id/product_detail_name")
	private AndroidElement Deatilname;
	
	@AndroidFindBy(id="com.ikea.alfuttaim.store:id/product_detail_price_value")
	private AndroidElement Deatilprice;
	
	@AndroidFindBy(id="com.ikea.alfuttaim.store:id/product_qty")
	private AndroidElement PROQt;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='2']")
	private AndroidElement QPicker;
	
	@AndroidFindBy(id="android:id/button1")
	private AndroidElement okBtn;
	
	

	@AndroidFindBy(id="com.ikea.alfuttaim.store:id/btn_add_to_cart")
	private AndroidElement AddBtn;
	
	
	
	
	public void CLickSearch() {
		
		Search_Field.click();
	}
	
    public void Search() {
		
		Search_Second_Field.sendKeys("table");
		Click_Search.click();
		String Desc=pro_Des.getText();
		String Price=Price_Listing.getText();
		System.out.println(Desc + Price);
		product.click();
		String Desc1=Deatilname.getText();
		String Price1=Deatilprice.getText();
		System.out.println(Desc1 + Price1);
		
		Assert.assertTrue(Desc.contains(Desc1));
		Assert.assertTrue(Price.contains(Price1));
	}
    
    public void Add_Quantity() {
    	
    	PROQt.click();
    	QPicker.click();
    	okBtn.click();
    	AddBtn.click(); 
    	
    }

}
