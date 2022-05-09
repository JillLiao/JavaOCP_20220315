package day09_oo_polymorphism_interface.weapon;

public class _03_Benz implements _01_Car{
	
	private int power;
    public _03_Benz(int power) {
        this.power = power;
    }
    @Override
    public void move() {
        System.out.println("用車輪走");
    }

    @Override
    public int getPower() {
        return power;
    }
}
