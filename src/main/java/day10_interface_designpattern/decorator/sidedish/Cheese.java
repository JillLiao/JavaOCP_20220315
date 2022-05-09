package day10_interface_designpattern.decorator.sidedish;

import day10_interface_designpattern.decorator.Food;

public class Cheese extends SideDish{

	public Cheese(Food food) {
		super(food);
        name = "起司";
        price = 10;
	}
	
}
