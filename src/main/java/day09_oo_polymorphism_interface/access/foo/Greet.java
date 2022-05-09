package day09_oo_polymorphism_interface.access.foo;

import day09_oo_polymorphism_interface.access.bar.Hello;

public class Greet {
    // 存取 Hello 的資源
    public void accessHello() {
        Hello hello = new Hello();
        System.out.println(hello.a);
        //System.out.println(hello.b); // 不可呼叫 Hello protected 方法
        //System.out.println(hello.c); // 不可呼叫 Hello 預設 方法
        //System.out.println(hello.d); // 不可呼叫 Hello private 方法
    }
}
