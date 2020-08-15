package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.pages.CheckoutPage;
import com.pages.LoginPage;

import BaseTest.BaseClass;
import utility.Kernel;

public class CheckoutpageTest extends Kernel {

	   @Test
		public void checkouttest() {
		checkoutpage.searchbox("I promise");
		checkoutpage.bookclick();
				checkoutpage.addtocart();
				checkoutpage.gotocart();
				checkoutpage.checkout();
				checkoutpage.guestcheckout();
				
		
}
}