package day01;

public class _11_Account_Main4 {

	public static void main(String[] args) {
		
		_07_Account act1 = new _07_Account();
        act1.name = "John";
        act1.deposit(1000);
        _07_Account act2 = new _07_Account();
        act2.name = "Mary";
        act2.deposit(1000);
        act1.print();
        act2.print();
        // 轉帳
        System.out.println("轉帳");
        act1.transfer(300, act2);
        act1.print();
        act2.print();
        // 轉帳2
        System.out.println("轉帳2");
        _07_Account.transfer(700, act2, act1);
        act1.print();
        act2.print();
	}

}
