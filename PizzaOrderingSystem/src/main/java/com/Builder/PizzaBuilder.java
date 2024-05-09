package com.Builder;

import java.util.ArrayList;
import java.util.List;

import com.Pizza;

public class PizzaBuilder {
	private String size;
	private List<String> toppings;
	
	public PizzaBuilder() {
		toppings=new ArrayList<>();
	}
	
	public PizzaBuilder setSize(String size) {
		this.size=size;
		return this;
	}
	
	public PizzaBuilder addTopping(String topping) {
		toppings.add(topping);
		return this;
	}
	
	public Pizza build() {
		return new Pizza(size, toppings);
	}
	
}
