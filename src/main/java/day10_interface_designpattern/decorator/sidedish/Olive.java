package day10_interface_designpattern.decorator.sidedish;

import day10_interface_designpattern.decorator.Food;

public class Olive extends SideDish{

	public Olive(Food food) {
		super(food);
        name = "橄欖";
        price = 10;
	}
	
}
