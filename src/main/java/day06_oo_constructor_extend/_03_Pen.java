package day06_oo_constructor_extend;
//建構子操作
public class _03_Pen {
	public _03_Pen() {
        this("88");	//呼叫C建構子
        System.out.println("A");
    }
    public _03_Pen(Integer price) {
        System.out.println("B, price:" + price);
    }
    public _03_Pen(String color) {
        this(88);	//呼叫B建構子
        System.out.println("C, color:" + color);
    }
    
    // 主程式
    public static void main(String[] args) {
    	_03_Pen p1 = new _03_Pen();
    }
}
/*
 	1. this 就是這個 class 本身
	2. 建構子之間可以互相調用，方法為 this()
	3. this 必須要在建構子的第一行
 */