package day01;

public class _06_BMI_Main {

	public static void main(String[] args) {
		_05_BMI b1 = new _05_BMI();
		_05_BMI b2 = new _05_BMI();
        b1.name = "John";
        b1.height = 170;
        b1.weight = 60;
        b1.bmiValue = 60.0/Math.pow(170.0/100, 2); // Not good
        b2.name = "Mary";
        b2.height = 165;
        b2.weight = 45;
        b2.bmiValue = b2.weight / Math.pow(b2.height/100, 2); // good
        System.out.printf("%s %.1f %.1f %.1f\n", b1.name, b1.height, b1.weight, b1.bmiValue);
        System.out.printf("%s %.1f %.1f %.1f\n", b2.name, b2.height, b2.weight, b2.bmiValue);
	}

}
