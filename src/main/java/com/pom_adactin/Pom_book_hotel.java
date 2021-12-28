package com.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_book_hotel {
	
	public WebDriver driver;

	@FindBy(name = "first_name")
	public WebElement firstname;	
	
	@FindBy(name = "last_name")
	public WebElement lastname;	
	
	@FindBy(name = "address")
	public WebElement address;	
	
	@FindBy(name = "cc_num")
	public WebElement card_num;	
	
	@FindBy(name = "cc_type")
	public WebElement card_type;	
	
	@FindBy(name = "cc_exp_month")
	public WebElement exp_month;	
	
	@FindBy(name = "cc_exp_year")
	public WebElement exp_year;	
	
	@FindBy(name = "cc_cvv")
	public WebElement cvv_num;
	
	@FindBy(name = "book_now")
	public WebElement book_now;	
	

	
	public Pom_book_hotel(WebDriver driver2) {
    this.driver = driver2;
    PageFactory.initElements(driver2, this);
	
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getAddress() {
		return address;
	}

	public WebElement getCard_num() {
		return card_num;
	}

	public WebElement getCard_type() {
		return card_type;
	}

	public WebElement getExp_month() {
		return exp_month;
	}

	public WebElement getExp_year() {
		return exp_year;
	}

	public WebElement getCvv_num() {
		return cvv_num;
	}	
	
	public WebElement getBook_now() {
		return book_now;
	}

	
	
	
}
