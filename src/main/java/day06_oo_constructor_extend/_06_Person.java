package day06_oo_constructor_extend;

public class _06_Person {
	private String name;
    private Integer age;
    
    public _06_Person() {
    }
    
    public _06_Person(String name, Integer age) {
        this.name = name;	// 相當於：this.setName(name);
        this.setAge(age);	
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
}
