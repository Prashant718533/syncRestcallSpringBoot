package springBoot2.controller;

import org.springframework.stereotype.Component;

@Component
public class VehicleDetails {

	int id;
	String name;
	String color;
	int price;

	public VehicleDetails() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public VehicleDetails(int id, String name, String color, int price) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}

}
