package day02_array;

public class _02_StudentMain {

	public static void main(String[] args) {
		_01_Student s1 = new _01_Student();
        s1.setName("John");
        s1.setHeight(170);
        s1.setWeight(60);
        s1.setScore(80);
        s1.print();
        _01_Student s2 = new _01_Student();
        s2.setName("Mary");
        s2.setHeight(160);
        s2.setWeight(45);
        s2.setScore(90);
        s2.print();
        _01_Student s3 = new _01_Student();
        s3.setName("Helen");
        s3.setHeight(500);
        s3.setWeight(-30);
        s3.setScore(-600);
        s3.print();
	}

}
