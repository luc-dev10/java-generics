package com.generic.demo;

import java.util.ArrayList;
import java.util.List;

public class Collector<T extends Car> implements Comparable<Collector<T>> {
	private String name;
	private List<T> cars = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// collection methods
	public int getNumOfCars() {
		return cars.size();
	}

	public void addCar(T car) {
		if (cars.contains(car))
			return;
		else
			cars.add(car);
	}

	@Override
	public int compareTo(Collector<T> o) {

		if (o.getName().equals(this.name)) {
			return 1;
		}

		return 0;
	}
}
