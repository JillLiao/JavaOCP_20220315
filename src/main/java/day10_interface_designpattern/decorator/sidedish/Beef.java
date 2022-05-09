package day10_interface_designpattern.decorator.sidedish;

import day10_interface_designpattern.decorator.Food;

public class Beef extends SideDish{

	public Beef(Food food) {
		super(food);
        name = "牛肉";
        price = 35;
	}
	
}
