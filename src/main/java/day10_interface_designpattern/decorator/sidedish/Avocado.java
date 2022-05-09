package day10_interface_designpattern.decorator.sidedish;

import day10_interface_designpattern.decorator.Food;

public class Avocado extends SideDish{

	public Avocado(Food food) {
		super(food);
        name = "酪梨";
        price = 30;
	}
	
}
