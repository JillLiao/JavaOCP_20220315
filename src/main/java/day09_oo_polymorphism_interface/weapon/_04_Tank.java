package day09_oo_polymorphism_interface.weapon;

public class _04_Tank implements _01_Car, _02_Weapon{
	
	private int power;
    
	public _04_Tank(int power) {
        this.power = power;
    }
    @Override
    public void move() {
        System.out.println("用履帶走");
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void shoot() {
        System.out.println("發射穿甲彈");
    }
}
