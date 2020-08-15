package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {

	
	@FindBy(id="searchBarBN")
	private WebElement searchbox;
	
	@FindBy(xpath="//div[@class='product-shelf-title product-info-title pt-xs']//a[@title='I Promise']")
	private WebElement bookclick;
	
	@FindBy(xpath="//input[@class='btn-addtocart btn-pdp-addtocart btn btn--commerce mr-xs']")
	private WebElement AddToCart;

	@FindBy(xpath="//a[@class='shopping-bag-link']")
	private WebElement cart;

	@FindBy(xpath="//a[@class='btn sign-in-checkout mt-xs btn--full-width order-summary__btn--checkout']")
	private WebElement checkout;

	@FindBy(xpath="//a[@id='guestCheckoutBtn']")
	private WebElement guestcheckout;

	
			



public void searchbox(String bookname){
searchbox.sendKeys(bookname);
}

public void bookclick(){
bookclick.click();
}


public void addtocart() {
AddToCart.click();
}

public void gotocart() {
	cart.click();
}

public void checkout() {
	checkout.click();
}


public void guestcheckout() {
	guestcheckout.click();
}
}