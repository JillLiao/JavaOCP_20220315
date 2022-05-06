package day08_oo_polymorphism;

public class _03_Teacher extends _01_Person{
	private int salary;

    public _03_Teacher() {
    }
    
    public _03_Teacher(String name, int age, int salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
