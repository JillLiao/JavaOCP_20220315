package day10_interface_designpattern.decorator.sidedish;

import day10_interface_designpattern.decorator.Food;

public class Tuna extends SideDish{

	public Tuna(Food food) {
		super(food);
        name = "鮪魚";
        price = 20;
	}
	
}
