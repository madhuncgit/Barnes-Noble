package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.pages.LoginPage;

import BaseTest.BaseClass;
import utility.Kernel;

public class LoginPageTest extends Kernel {
	@Test
	public void sptest() {
		Kernel kn = new Kernel();
loginpage.myaccount();
loginpage.createnewuseraccount();
loginpage.enteringfirstname("Madhu");
loginpage.enteringlastname("Suresh");
loginpage.enteringemail("56thwny@gmail.com");
loginpage.confirmemail("56thwny@gmail.com");
loginpage.password("Asdfgh123");
loginpage.confirmpswd("Asdfgh123");
loginpage.selectsecurityquestion();
loginpage.secquestionanswer("Coimbatore");
loginpage.createaccountclick();

}}
