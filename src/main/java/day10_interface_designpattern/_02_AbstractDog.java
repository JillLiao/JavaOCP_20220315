package day10_interface_designpattern;

//抽象類別(半成品)
public abstract class _02_AbstractDog implements _01_Dog{
	
	@Override
    public void eat() {
        System.out.println("吃狗食");
	}
}
