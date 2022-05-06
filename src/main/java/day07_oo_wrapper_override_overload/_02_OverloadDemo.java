package day07_oo_wrapper_override_overload;

class User {
    void print(Integer x) {
        System.out.println("Integer");
    }
    void print(double x) {
        System.out.println("double");
    }
    void print(int x) {
        System.out.println("int");
    }
    void print(float x) {
        System.out.println("float");
    }
    void print(Float x) {
        System.out.println("Float");
    }
    void print(Double x) {
        System.out.println("Double");
    }
    void print(long x) {
        System.out.println("long");
    }
    void print(Long x) {
        System.out.println("Long");
    }
}

public class _02_OverloadDemo {
    public static void main(String[] args) {
        User user = new User();
        user.print(3.14);
        user.print(100);
        user.print(100L);
        user.print(Integer.valueOf(100));
    }
}