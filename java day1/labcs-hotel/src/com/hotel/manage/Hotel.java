package com.hotel.manage;

public class Hotel {
	String hotelName;
	String city;
	float price;
	int duration;

	public Hotel() {
		hotelName = "Deccan";
		city = "Hyderabad";
		price = 3000.0f;
		duration = 3;
	}

	public Hotel(String photelName, String pcity, float pprice, int pduration) {
		hotelName = photelName;
		city = pcity;
		price = pprice;
		duration = pduration;
	}

	public void displayDetails() {
		System.out.println(hotelName);
		System.out.println(city);
		System.out.println(price);
		System.out.println(duration);
	}

	public void acceptDetails() {
		hotelName = "Deccan";
		city = "Hyderabad";
		price = 3000.0f;
		duration = 3;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", city=" + city + ", price=" + price + ", duration=" + duration + "]";
	}

}
