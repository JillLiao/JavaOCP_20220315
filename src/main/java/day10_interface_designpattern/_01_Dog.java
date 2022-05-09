package day10_interface_designpattern;

//介面(規格)
public interface _01_Dog {
	int LEGS = 4; // public static final int LEGS = 4;
    // public static final 稱為常數(不會變的數, 變數名稱一律大寫)
	void skill(); // public abstract void skill();
	void eat();   // public abstract void eat();
}
