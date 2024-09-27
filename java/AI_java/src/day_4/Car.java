package day_4;

import java.util.Objects;

public class Car {
	private String make;
	private int price;
	private String model;
	public Car(String make, String model, int price) {
		this.make = make;
		this.price = price;
		this.model = model;
	}
	@Override
	public int hashCode() {
		return Objects.hash(make, model, price);
	}	
}
