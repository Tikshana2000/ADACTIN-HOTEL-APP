package com.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_booking_confirmation {
	
	public WebDriver driver;

	
	@FindBy(name = "logout")
	public WebElement logout;

	public Pom_booking_confirmation(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

	public WebElement getLogout() {
		return logout;
	}	
	
	
}
