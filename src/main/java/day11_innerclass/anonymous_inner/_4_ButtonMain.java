package day11_innerclass.anonymous_inner;

public class _4_ButtonMain {
	public static void main(String[] args) {
		_1_Button manulButton = new _2_ManulButton();
        manulButton.action();	//手動登入
        
        _1_Button autoButton = new _3_AutoButton();
        autoButton.action();	//自動登入
        
        _1_Button yoyoButton = new _1_Button(){	//將interface的抽象方法實作出來
            @Override							//而這{ }的內容即為匿名類別
            public void action() {				//匿名類別就不需要為了臨時的需求額外建一個class
                System.out.println("悠遊卡登入");
            }
        };
        yoyoButton.action();
        
        _1_Button creditCardButton = new _1_Button(){
            @Override
            public void action() {
                System.out.println("信用卡登入");
            }
        };
        creditCardButton.action();
        
        // Java 8 Lambda
        _1_Button yoyoButton2 = () -> System.out.println("悠遊卡2.0登入");
        yoyoButton2.action();
	}
}
