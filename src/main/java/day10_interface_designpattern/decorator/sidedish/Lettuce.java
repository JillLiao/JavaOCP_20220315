package day10_interface_designpattern.decorator.sidedish;

import day10_interface_designpattern.decorator.Food;

public class Lettuce extends SideDish{

	public Lettuce(Food food) {
		super(food);
        name = "生菜";
        price = 15;
	}
	
}
