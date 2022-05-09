package day09_oo_polymorphism_interface;

class Animal {
	int legs = 4;
    void move() {
        System.out.println("我會動");
    }
    int getLegs() {
        return legs;
    }
}
class Bird extends Animal{
	int legs = 2;
    void move() {
        System.out.println("我會飛");
    }
    int getLegs() {
        return legs;
    }
}
public class Polymorphism {
	public static void main(String[] args) {
		Animal animal = new Bird();
        System.out.println("animal.legs: "+ animal.legs);
        System.out.println("animal.getLegs(): "+animal.getLegs());
        animal.move();
	}
}