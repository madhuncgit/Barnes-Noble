package utility;

import org.openqa.selenium.support.PageFactory;

import com.pages.CheckoutPage;
import com.pages.LoginPage;

import BaseTest.BaseClass;



public class Kernel extends BaseClass {
	
	protected CheckoutPage checkoutpage = new CheckoutPage();
	protected LoginPage loginpage = new LoginPage() ;
	
	
	
	public Kernel() {
		checkoutpage=PageFactory.initElements(driver, CheckoutPage.class);
		loginpage=PageFactory.initElements(driver, LoginPage.class);

	}
}
