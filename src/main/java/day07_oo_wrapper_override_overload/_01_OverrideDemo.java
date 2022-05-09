package day07_oo_wrapper_override_overload;

class Father {
    int x = 100;
    void play() {
        System.out.println("Golf");
    }
}
class Son extends Father {
    int x = 200; // 遮蔽 Father 的屬性(物件變數)
    @Override
    void play() { // 覆寫 Father 的方法
        System.out.println("LoL");
    }
    void hello() { // Son 自己的方法
//        System.out.println("Father的x = " + super.x);
    	System.out.println("Hello son");
    }
}
public class _01_OverrideDemo {
    public static void main(String[] args) {
        Son son = new Son();
        son.play();
        son.hello();
        System.out.println("son的x = " + son.x);
    }
}
