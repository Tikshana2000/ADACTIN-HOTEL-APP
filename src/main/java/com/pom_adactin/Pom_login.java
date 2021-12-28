package com.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_login {

	public WebDriver driver;
	
	@FindBy(name = "username")
	public WebElement username;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(name = "login")
	public WebElement login_button;

	
	public Pom_login(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_button() {
		return login_button;
	}

}
