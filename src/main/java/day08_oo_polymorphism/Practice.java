package day08_oo_polymorphism;

import java.util.stream.Stream;

public class Practice {
	public static void main(String[] args) {
		_01_Person p1 = new _02_Student("John", 18, 100);
    	_01_Person p2 = new _02_Student("Jane", 19, 90);
    	_01_Person p3 = new _03_Teacher("Mary", 28, 55000);
        _02_Student s1 = new _02_Student("Helen", 18, 70);
        _03_Teacher t1 = new _03_Teacher("Bob", 35, 78000);
        
        _01_Person[] people = {p1, p2, p3, s1, t1};
        // 1. 顯示所有人名
        System.out.println("1.顯示所有人名：");
        Stream.of(people).forEach(n -> System.out.print(n.getName()+"\t"));
        System.out.println();
        System.out.println("-----------------");
        
        // 2. 計算平均年齡
        double avgAge = Stream.of(people).mapToInt(_01_Person::getAge).average().getAsDouble();
        System.out.println("2.平均年齡 = "+ avgAge);
        System.out.println("-----------------");
        
        // 3. 印出所有學生分數 = ?
        System.out.println("3.印出所有學生分數：");
        Stream.of(people).filter(p -> p instanceof _02_Student)
        	.map(p-> (_02_Student)p).forEach(s -> System.out.print(s.getScore()+"\t"));
        System.out.println();
        System.out.println("-----------------");
        
        // 4. 印出所有學生分數(使用 Java 8) = ?
        System.out.println("4.印出所有學生分數(使用 Java 8)：");
        Stream.of(people).filter(p -> p instanceof _02_Student)
        	.map(p -> (_02_Student)p).forEach(s -> System.out.print(s.getScore()+"\t"));
        System.out.println();
        System.out.println("-----------------");
        
        // 5. 請求出老師的平均薪資(使用 Java 8) = ?
        System.out.println("5.請求出老師的平均薪資(使用 Java 8)：");
        double avgSalary = Stream.of(people).filter(p -> p instanceof _03_Teacher)
        	.map(p-> (_03_Teacher)p).mapToInt(_03_Teacher::getSalary).average().getAsDouble();
        System.out.println("老師的平均薪資= "+ avgSalary);
	}
}
