/*
 * 建構子的操作
 */
package day06_oo_constructor_extend;

public class _01_Ball {
	private String color;
	private Integer price;
	
	public _01_Ball(int price) {
        System.out.println("A");
    }
    
    public _01_Ball() {
        System.out.println("B");
    }
    
    public _01_Ball(String color) {
        System.out.println("C");
    }
    
    public _01_Ball(String color, Integer price) {
        System.out.println("D");
    }
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "_01_Ball [color=" + color + ", price=" + price + "]";
	}
}
