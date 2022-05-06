package day08_oo_polymorphism;

public class _02_Student extends _01_Person{
private int score;
    
    public _02_Student() {
    }
    
    public _02_Student(String name, int age, int score) {
        setName(name);
        setAge(age);
        setScore(score);
    }
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
