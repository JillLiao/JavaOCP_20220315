package day10_interface_designpattern.decorator.sidedish;

import day10_interface_designpattern.decorator.Food;

public class Shrimp extends SideDish{

	public Shrimp(Food food) {
		super(food);
        name = "鮮蝦";
        price = 40;
	}
	
}
