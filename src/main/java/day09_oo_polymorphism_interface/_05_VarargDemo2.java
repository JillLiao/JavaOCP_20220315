package day09_oo_polymorphism_interface;

//自動變長參數若與一般方法產生衝突的調用規則
//會先比對一般方法
public class _05_VarargDemo2 {
	public static void main(String[] args) {
        print("john");
        print("john", "mary");
        //print("john", "mary", "helen");
        String[] names = {"john", "mary"};
        print(names);
        print("john", names);
    }
    
    public static void print(String name) {
        System.out.println("A");
    }
    
    public static void print(String name1, String name2) {
        System.out.println("B");
    }
    
    public static void print(String... names) {
        System.out.println("C");
    }
    
    public static void print(String name, String... names) {
        System.out.println("D");
    }
}
