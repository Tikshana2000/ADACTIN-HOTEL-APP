package com.adactin_project;

import com.baseclass.Base_Class;
import com.pom_adactin.Pom_Search_hotel;
import com.pom_adactin.Pom_Select_hotel;
import com.pom_adactin.Pom_book_hotel;
import com.pom_adactin.Pom_booking_confirmation;
import com.pom_adactin.Pom_login;

public class Adactin_hotel_project extends Base_Class {

	public static void main(String[] args) {

		browserlaunch("chrome");

		urllaunch("https://adactinhotelapp.com/");

		max();

		implicit(3000);

		Pom_login login = new Pom_login(driver);

		Pom_Search_hotel search = new Pom_Search_hotel(driver);

		Pom_Select_hotel sel_hotel = new Pom_Select_hotel(driver);

		Pom_book_hotel book = new Pom_book_hotel(driver);

		Pom_booking_confirmation confirm = new Pom_booking_confirmation(driver);

		inputvalues(login.getUsername(), "TIKSHANA");

		inputvalues(login.getPassword(), "momdad2515");

		clickelement(login.getLogin_button());

		dropdown(search.getSel_location(), "visible text", "Paris");

		dropdown(search.getSel_hotels(), "visible text", "Hotel Sunshine");

		dropdown(search.getSel_rooms(), "visible text", "Deluxe");

		dropdown(search.getSel_room_num(), "visible text", "1 - One");

		dropdown(search.getSel_adultroom(), "visible text", "2 - Two");

		dropdown(search.getSel_childroom(), "visible text", "0 - None");

		clickelement(search.getSubmit());

		clickelement(sel_hotel.getSel_radiobtn());

		clickelement(sel_hotel.getSel_continue());

		inputvalues(book.getFirstname(), "TIKSHANA");

		inputvalues(book.getLastname(), "B");

		inputvalues(book.getAddress(), "RSTUVW");

		inputvalues(book.getCard_num(), "1234567890123456");

		dropdown(book.getCard_type(), "visible text", "VISA");

		dropdown(book.getExp_month(), "visible text", "December");

		dropdown(book.getExp_year(), "visible text", "2022");

		inputvalues(book.getCvv_num(), "1234");

		clickelement(book.getBook_now());

		clickelement(confirm.getLogout());

	}

}
