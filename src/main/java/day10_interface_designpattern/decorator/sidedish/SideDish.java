package day10_interface_designpattern.decorator.sidedish;

import day10_interface_designpattern.decorator.Food;

public class SideDish extends Food{
	protected Food food;
    
    public SideDish(Food food) {
        this.food = food;
    }

    @Override
    public String getName() {
        return food.getName()+ " + " + name +"("+ price +")";
    }

    @Override
    public int getPrice() {
        return food.getPrice() + price;
    }    
}
