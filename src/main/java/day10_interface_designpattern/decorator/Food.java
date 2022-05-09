package day10_interface_designpattern.decorator;

public abstract class Food {
	protected String name;
    protected int price;
    
    public abstract String getName();
    public abstract int getPrice();
    
    public void printMemo() {
    	System.out.println("謝謝光臨Subway，本次消費明細如下");
    	System.out.println("內容: "+ getName());
    	System.out.println("金額: $"+ getPrice());
    }
}
