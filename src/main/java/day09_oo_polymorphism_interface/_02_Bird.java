package day09_oo_polymorphism_interface;

public class _02_Bird extends _01_Animal{
	int legs = 2;
    void move() {
        System.out.println("我會飛");
    }
    int getLegs() {
        return legs;
    }
}
