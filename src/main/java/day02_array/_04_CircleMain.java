package day02_array;

public class _04_CircleMain {

	public static void main(String[] args) {
		_03_Circle circle = new _03_Circle();
        circle.setR(7.5);
        circle.print();
        circle.calcAndPrintArea();
        // 取得 area 資料
        double area = circle.calcAndReturnArea();
        // 自行印出 area
        System.out.printf("area = %.3f\n", area);
	}

}
