package com.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Search_hotel {
	
	public WebDriver driver;

	@FindBy(name = "location")
	public WebElement sel_location;
	
	@FindBy(name = "hotels")
	public WebElement sel_hotels;
	
	@FindBy(name = "room_type")
	public WebElement sel_rooms;
	
	@FindBy(name = "room_nos")
	public WebElement sel_room_num;
	
	@FindBy(name = "adult_room")
	public WebElement sel_adultroom;
	
	@FindBy(name = "child_room")
	public WebElement sel_childroom;
	
	@FindBy(name = "Submit")
	public WebElement submit;
	
	public WebElement getSubmit() {
		return submit;
	}

	public Pom_Search_hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		
	}

	public WebElement getSel_location() {
		return sel_location;
	}

	public WebElement getSel_hotels() {
		return sel_hotels;
	}

	public WebElement getSel_rooms() {
		return sel_rooms;
	}

	public WebElement getSel_room_num() {
		return sel_room_num;
	}

	public WebElement getSel_adultroom() {
		return sel_adultroom;
	}

	public WebElement getSel_childroom() {
		return sel_childroom;
	}

	
}
