package day08_oo_polymorphism;

public class _04_PersonMain {
	public static void main(String[] args) {
		// 不使用多型
		_02_Student student1 = new _02_Student("John", 18, 100);
		_02_Student student2 = new _02_Student("Jane", 19, 90);
		_03_Teacher teacher1 = new _03_Teacher("Mary", 28, 55000);
        
        _02_Student[] students = {student1, student2};
        _03_Teacher[] teachers = {teacher1};
        for(_02_Student student : students) {
            System.out.println(student.getName());
        }
        for(_03_Teacher teacher : teachers) {
            System.out.println(teacher.getName());
        }
	}
}
