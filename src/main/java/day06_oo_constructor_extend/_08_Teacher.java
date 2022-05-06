package day06_oo_constructor_extend;

public class _08_Teacher extends _06_Person{
private Integer salary;
    
    public _08_Teacher() {
        
    }
    
    public _08_Teacher(String name, Integer age, Integer salary) {
    	super(name, age);	//調用父類別的建構子
        //super.setName(name);	//調用父類別的setName()
        //super.setAge(age);
        this.setSalary(salary);
    }
    
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + "salary=" + salary + "} " + super.toString();
    }
}
