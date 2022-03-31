package day05_oo_combination_stream;

public class _05_McDonlads {

	public static void main(String[] args) {
		// 起司
		_03_Cheese cheese1 = new _03_Cheese("巧達起司", 5);
        _03_Cheese cheese2 = new _03_Cheese("帕瑪森起司", 20);
        // 牛肉
        _02_Beef beef1 = new _02_Beef("碎牛肉", 15);
        _02_Beef beef2 = new _02_Beef("菲力", 35);
        // 麵包
        _01_Bread bread1 = new _01_Bread("馬芬麵包", 10);
        _01_Bread bread2 = new _01_Bread("芝麻麵包", 12);
        // 印出所有原料資訊
        System.out.println(cheese1); // cheese1.toString()
        System.out.println(cheese2);
        System.out.println(beef1);
        System.out.println(beef2);
        System.out.println(bread1);
        System.out.println(bread2);
        
        // 吉士牛肉漢堡
        _04_Hamburger hamburger = new _04_Hamburger("吉士牛肉漢堡", 10);
        hamburger.setBeef(beef1);
        hamburger.setCheese(cheese1);
        hamburger.setBread(bread2);
        System.out.println(hamburger);
        int sum = hamburger.getPrice();
        System.out.printf("%s 總價:%d\n", hamburger.getName(), sum);
        
        // 牛肉漢堡
        _04_Hamburger hamburger2 = new _04_Hamburger("牛肉漢堡", 10);
        hamburger2.setBeef(beef1);
        hamburger2.setBread(bread2);
        System.out.println(hamburger2);
        // 透過 hamburger2.getPrice(); 求出總價
        int sum2 = hamburger2.getPrice();
        System.out.printf("%s 總價:%d\n", hamburger2.getName(), sum2);
	}

}
