package day10_interface_designpattern.decorator.sidedish;

import day10_interface_designpattern.decorator.Food;

public class Onion extends SideDish{

	public Onion(Food food) {
		super(food);
        name = "洋蔥";
        price = 15;
	}
	
}
