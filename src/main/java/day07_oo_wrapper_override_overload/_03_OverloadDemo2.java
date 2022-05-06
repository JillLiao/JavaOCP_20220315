package day07_oo_wrapper_override_overload;

public class _03_OverloadDemo2 {
	int x(double d) {
        System.out.println("one");
        return 0;
    }
    
    // 一個類別中不可同時存在多組名稱與參數列一樣的方法
    /*
    String x(double d) {
        System.out.println("two");
        return null;
    }
 
    double x(double d) {
        System.out.println("three");
        return 0.0;
    }
    */
    public static void main(String[] args) {
        new _03_OverloadDemo2().x(4.0);
    }
}
