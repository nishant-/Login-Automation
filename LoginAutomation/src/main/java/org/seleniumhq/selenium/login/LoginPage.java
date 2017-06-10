package org.seleniumhq.selenium.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.seleniumhq.selenium.login.util.Locators;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}

	By userName = By.xpath(Locators.LOGIN_USERNME);
	By password = By.xpath(Locators.LOGIN_PASSWORD);
	By loginButton = By.xpath(Locators.LOGIN_BUTTON);
	
	
	public WebElement username(){
		return driver.findElement(userName);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement loginButton() {
		return driver.findElement(loginButton);
	}
}
