package day06_oo_constructor_extend;

public class _07_Student extends _06_Person{
private Integer score;
    
    public _07_Student() {
    	
    }
    
    public _07_Student(String name, Integer age, Integer score) {
        setName(name);   // 若沒有名稱上的衝突，相當於：super.setName(name);
        setAge(age);     // 相當於：super.setAge(age);
//        setScore(score); // 相當於：this.setScore(score);
        this.score = score;
    }
    
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + "score=" + score + "} " + super.toString();
    }
}
