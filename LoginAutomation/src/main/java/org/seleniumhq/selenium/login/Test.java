package org.seleniumhq.selenium.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.seleniumhq.selenium.login.util.DriverFactory;
import org.seleniumhq.selenium.login.util.Env;

public class Test {

	public static void main(String[] args) {
		
		WebDriver driver = DriverFactory.getDriver();
		driver.get(Env.APP_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.username().sendKeys(Env.USERNAME);
		loginPage.password().sendKeys(Env.PASSWORD);
		loginPage.loginButton().click();
	}
}
