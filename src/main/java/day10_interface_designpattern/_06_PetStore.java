package day10_interface_designpattern;

import java.util.stream.Stream;

public class _06_PetStore {
	public static void main(String[] args) {
        //Dog d1 = new Dog(); // interface 介面不可"直接" new
        //Dog d2 = new AbstractDog(); // abstract class 抽象類別也不可"直接" new
        
        _01_Dog dog1 = new _03_Shiba();
        _01_Dog dog2 = new _04_Chihuahua();
        _01_Dog dog3 = new _05_EDog();
        System.out.println(_01_Dog.LEGS);
        System.out.println(dog1.getClass().getSimpleName());
        System.out.println(dog2.getClass().getSimpleName());
        dog1.skill();
        dog1.eat();
        dog2.skill();
        dog2.eat();
        dog3.skill();
        dog3.eat();
        // Java 8
        _01_Dog[] dogs = {dog1, dog2, dog3};
        Stream.of(dogs).forEach(dog -> {
            dog.skill();
            dog.eat();
        });
        
        _07_AbstractCat[] cats = {new _08_PersianCat(), new _09_SiameseCat()};
        // Java 5 以前
        for(int i=0;i<cats.length;i++) {
        	_07_AbstractCat cat = cats[i];
            cat.eat();
            cat.skill();
        }
        // Java 5 ~ 7 的寫法
        for(_07_AbstractCat cat : cats) {
            cat.eat();
            cat.skill();
        }
        // Java 8
        Stream.of(cats).forEach(cat -> {
            cat.eat();
            cat.skill();
        });        
    }
}
