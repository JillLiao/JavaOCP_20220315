package day02_array;

public class _06_RectMain {

	public static void main(String[] args) {
		_05_Rect rect = new _05_Rect();
        rect.setWidthAndHigh(30, 50);
        int area = rect.getArea();
        System.out.printf("area = %,d\n", area);
	}

}
