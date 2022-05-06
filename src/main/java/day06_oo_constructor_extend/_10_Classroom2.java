package day06_oo_constructor_extend;

public class _10_Classroom2 {
	public static void main(String[] args) {
		_08_Teacher teacher = new _08_Teacher("John", 40, 90000);
		_07_Student student1 = new _07_Student("Mary", 18, 100);
		_07_Student student2 = new _07_Student("Bobo", 17, 90);
        
        System.out.println(teacher);
        System.out.println(student1);
        System.out.println(student2);
	}
}
