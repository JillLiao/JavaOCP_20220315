package day05_oo_combination_stream;

public class _04_Hamburger {
	private String name; // 漢堡名稱
    private _01_Bread bread; // 內容物-麵包 
    private _03_Cheese cheese; // 內容物-起司
    private _02_Beef beef; // 內容物-牛肉
    private Integer price; // 漢堡基礎價

    public _04_Hamburger(String name, _01_Bread bread, _03_Cheese cheese, _02_Beef beef, Integer price) {
        this.name = name;
        this.bread = bread;
        this.cheese = cheese;
        this.beef = beef;
        this.price = price;
    }

    public _04_Hamburger(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public _01_Bread getBread() {
        return bread;
    }

    public void setBread(_01_Bread bread) {
        this.bread = bread;
    }

    public _03_Cheese getCheese() {
        return cheese;
    }

    public void setCheese(_03_Cheese cheese) {
        this.cheese = cheese;
    }

    public _02_Beef getBeef() {
        return beef;
    }

    public void setBeef(_02_Beef beef) {
        this.beef = beef;
    }

    public Integer getPrice() {
        //int sum = price + bread.getPrice() + beef.getPrice() + cheese.getPrice();
        int sum = price;
        if(bread != null) {
            sum += bread.getPrice();
        }
        if(beef != null) {
            sum += beef.getPrice();
        }
        if(cheese != null) {
            sum += cheese.getPrice();
        }
        return sum;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hamburger{" + "name=" + name + ", bread=" + bread + ", cheese=" + cheese + ", beef=" + beef + ", price=" + price + '}';
    }
}
