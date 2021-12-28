package com.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Select_hotel {
	
	public WebDriver driver;

	@FindBy(name = "radiobutton_0")
	public WebElement sel_radiobtn;	
	
	
	@FindBy(name = "continue")
	public WebElement sel_continue;

	public Pom_Select_hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
				
		
	}


	public WebElement getSel_radiobtn() {
		return sel_radiobtn;
	}


	public WebElement getSel_continue() {
		return sel_continue;
	}	
	
	
	
	
	
	
	
	
}
