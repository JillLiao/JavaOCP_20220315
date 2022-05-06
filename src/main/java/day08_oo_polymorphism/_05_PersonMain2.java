package day08_oo_polymorphism;

import java.util.Arrays;

public class _05_PersonMain2 {

	// 使用多型
    public static void main(String[] args) {
    	_01_Person p1 = new _02_Student("John", 18, 100);
    	_01_Person p2 = new _02_Student("Jane", 19, 90);
    	_01_Person p3 = new _03_Teacher("Mary", 28, 55000);
        _02_Student s1 = new _02_Student("Helen", 18, 70);
        _03_Teacher t1 = new _03_Teacher("Bob", 35, 78000);
        
        _01_Person[] people = {p1, p2, p3, s1, t1};
        
        // 1. 顯示所有人名
        for(_01_Person person : people) {
            System.out.println(person.getName());
        }
        
        // 2. 計算平均年齡
        double avgOfAge= Arrays.stream(people)
                //.mapToInt(p -> p.getAge())
                .mapToInt(_01_Person::getAge)
                .average()
                .getAsDouble();
        System.out.println(avgOfAge);
        
        // 3. 印出所有學生分數 = ?
        for(_01_Person person : people) {
            // 判斷 person 是不是學生 ?
            //System.out.println(person.getClass());
            //System.out.println(person.getClass().getSimpleName());
            //System.out.println(person.getClass().getSimpleName().equals("Student"));
            if(person.getClass().getSimpleName().equals("Student")) {
            	_02_Student student = (_02_Student)person; // 將 person 轉型成 Student
                System.out.println(student.getScore());
            }
        }
        for(_01_Person person : people) {
            //System.out.println((person instanceof Student) + ":" + person.getClass());
            if(person instanceof _02_Student) {
            	_02_Student student = (_02_Student)person; // 將 person 轉型成 Student
                System.out.println(student.getScore());
            }
        }
     // 4. 印出所有學生分數(使用 Java 8) = ?
        Arrays.stream(people)
                .filter(person -> person instanceof _02_Student) // 過濾 Student
                .map(person -> (_02_Student)person) // 轉為 Student 型別
                .forEach(student -> System.out.println(student.getScore()));
        
        // 5. 請求出老師的平均薪資(使用 Java 8) = ?
        double avgOfSalary = Arrays.stream(people)
                .filter(person -> person instanceof _03_Teacher)
                .map(person -> (_03_Teacher)person)
                .mapToInt(_03_Teacher::getSalary)
                .average()
                .getAsDouble();
        System.out.println(avgOfSalary);
    }

}
