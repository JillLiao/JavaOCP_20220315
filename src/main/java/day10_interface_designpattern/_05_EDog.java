package day10_interface_designpattern;

public class _05_EDog implements _01_Dog{

	@Override
	public void skill() {
		System.out.println("玩遊戲");
	}

	@Override
	public void eat() {
		System.out.println("吃電");
	}

}
