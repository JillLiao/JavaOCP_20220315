package day10_interface_designpattern.decorator;

public class Bread extends Food{
	public Bread() {
        name = "麵包";
        price = 40;
    }
    
    @Override
    public String getName() {
        return name + "(" + price + ")";
    }

    @Override
    public int getPrice() {
        return price;
    }
}
