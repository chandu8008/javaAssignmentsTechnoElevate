package com.technoelevate.javabasic.mobile;

import java.util.Objects;

public class Mobile {
	private String model;
	private double price;
	private int ram;

	@Override
	public int hashCode() {
		return this.ram;
	}

	@Override
	public boolean equals(Object obj) {
		Mobile mobile = (Mobile) obj;
		return (this.model).equals(mobile.model);
	}

	public Mobile(String model, double d, int i) {
		super();
		this.model = model;
		this.price = d;
		this.ram = i;
	}

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", price=" + price + ", ram=" + ram + "]";
	}
}