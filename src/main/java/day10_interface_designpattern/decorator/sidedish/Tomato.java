package day10_interface_designpattern.decorator.sidedish;

import day10_interface_designpattern.decorator.Food;

public class Tomato extends SideDish{

	public Tomato(Food food) {
		super(food);
        name = "鮪魚";
        price = 20;
	}
	
}
