package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class LoginPage {
	@FindBy(id="myAccountLink-old")
	private WebElement MyAccount;
	
	@FindBy(xpath="//a[@id='createAcctLink']")
	private WebElement CreatenNewUserAccount;
	
	@FindBy(xpath=("//input[@id='fName']"))
	private WebElement FirstName;
	
	@FindBy(xpath=("//input[@id='lName']"))
	private WebElement LastName;
	
	@FindBy(xpath=("//input[@id='email']"))
	private WebElement Email;
	
	@FindBy(xpath=("//input[@id='confirmEmail']"))
	private WebElement ConfirmEmail; 
	
	@FindBy(xpath=("//input[@id='password']"))
	private WebElement Password;
	
	@FindBy(xpath=("//input[@id='confPassword']"))
	private WebElement ConfirmPassword;
	
	@FindBy(xpath=("//a[@title='Security Question']"))
	private WebElement SecurityQuestion;
	
	@FindBy(xpath=("//input[@id='securityAnswer']"))
	private WebElement SecQuesAnswer;
	
	@FindBy(xpath=("//input[@id='@']"))
	private WebElement CreateAccount;

public void myaccount() {
	MyAccount.click();
}
	public void enteringfirstname(String firstname) {
	FirstName.sendKeys(firstname); }
		
    public void enteringlastname(String lastname) {
	LastName.sendKeys(lastname);}
		
	public void enteringemail(String email) {
	Email.sendKeys(email);}
			
				
	public void confirmemail(String reconfirmemail) {
	ConfirmEmail.sendKeys(reconfirmemail);}
		
		public void createnewuseraccount() {
			CreatenNewUserAccount.click();
		}
	public void password(String password) {
	Password.sendKeys(password);}
			
	public void confirmpswd(String reconfirmpswd) {
	ConfirmPassword.sendKeys(reconfirmpswd);}
				
		
	public void secquestionanswer(String answer) {
		SecQuesAnswer.sendKeys(answer);}
	
	
public void selectsecurityquestion() {
Select squestion = new Select(SecurityQuestion);
squestion.selectByVisibleText("In what city were you born?");
}
	
	public void createaccountclick() {
		CreateAccount.click();	
		}
	
	
	}

