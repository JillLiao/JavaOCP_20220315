package day09_oo_polymorphism_interface;

public class _03_Zoo {
	public static void main(String[] args) {
		_01_Animal animal = new _02_Bird();
        System.out.println("animal.legs: "+ animal.legs);//執行結果：_01_Animal 的 legs
        System.out.println("animal.getLegs(): "+animal.getLegs());	//執行結果：_02_Bird 的 legs
        animal.move();	//執行結果：_02_Bird 的 move()
	}
}
/*
 * 可以對照day06_11_Family
 * 多型宣告時，屬性的遮蔽效果會消失，呼叫出來的屬性必為宣告之父類別的屬性，
 * 若想獲得子類別的屬性，那就只能在子類別中額外撰寫一個getAttribute()方法 
 */