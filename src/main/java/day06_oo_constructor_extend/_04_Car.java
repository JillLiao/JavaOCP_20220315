package day06_oo_constructor_extend;

public class _04_Car {
	public static String brandName = "BMW"; // 類別變數
    private Integer price; // 金額 // 物件變數
    
    public _04_Car(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "price=" + price + '}';
    }
    
    public static void main(String[] args) {
    	_04_Car c1 = new _04_Car(100);
    	_04_Car c2 = new _04_Car(200);
        System.out.println(c1);
        System.out.println(c2);
        c2.brandName = "Banz"; // 不建議這樣使用(but 考試會考)
        _04_Car.brandName = "Banz"; // 正確呼叫方式
        System.out.println(c1.brandName); // 不建議用此呼叫
        System.out.println(c2.brandName); // 不建議用此呼叫
        System.out.println(_04_Car.brandName); // 正確呼叫方式
    }
}
