package day10_interface_designpattern.decorator;

import day10_interface_designpattern.decorator.sidedish.Avocado;
import day10_interface_designpattern.decorator.sidedish.Beef;
import day10_interface_designpattern.decorator.sidedish.Cheese;
import day10_interface_designpattern.decorator.sidedish.Lettuce;
import day10_interface_designpattern.decorator.sidedish.Olive;
import day10_interface_designpattern.decorator.sidedish.Onion;
import day10_interface_designpattern.decorator.sidedish.Shrimp;
import day10_interface_designpattern.decorator.sidedish.Tomato;

public class Subway {

	public static void main(String[] args) {
		Food food = new Bread();
		food = new Lettuce(food);
		food = new Avocado(food);
		food = new Onion(food);
		food = new Cheese(food);
		food = new Shrimp(food);
		food = new Beef(food);
		food = new Tomato(food);
		food = new Olive(food);
		
		food.printMemo();
	}

}
