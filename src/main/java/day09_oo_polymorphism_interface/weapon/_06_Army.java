package day09_oo_polymorphism_interface.weapon;

import java.util.stream.Stream;

public class _06_Army {
	public static void main(String[] args) {
		_01_Car car1 = new _03_Benz(200);
		_01_Car car2 = new _04_Tank(5000);
        _02_Weapon w1 = new _05_T91();
        _02_Weapon w2 = (_02_Weapon)car2;
        _02_Weapon w3 = new _04_Tank(6000);
        
        _01_Car[] cars = {car1, car2, (_01_Car)w3};
        // 總共馬力是多少
        int sum = Stream.of(cars).mapToInt(_01_Car::getPower).sum();
        System.out.println(sum);
        
        _02_Weapon[] weapons = {w1, w2, w3};
        // 統一發射武器
        Stream.of(weapons).forEach(_02_Weapon::shoot);
        
        Object[] objects = {car1, car2, w1, w2, w3};
        // 總共馬力是多少 ? 
        sum = Stream.of(objects)
                .filter(object -> object instanceof _01_Car)
                .map(object -> (_01_Car)object)
                .mapToInt(_01_Car::getPower)
                .sum();
        System.out.println(sum);
	}
}
