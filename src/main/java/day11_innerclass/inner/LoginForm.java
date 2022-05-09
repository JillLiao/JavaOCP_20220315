package day11_innerclass.inner;

//外部類別(表單)
public class LoginForm {
	private String userName;
    private String title = "登入表單"; // 表單抬頭
    public LoginForm(String userName) {
        this.userName = userName;
    }
    
    // 內部類別(按鈕)
    public class Button {
        private String title = "傳送"; // 按鈕抬頭
        //static int width = 200; // 屬性不可加入 static 修飾
        // 行為
        public void action() {
            String title = "驗證成功"; // 行為抬頭
            System.out.println(LoginForm.this.title); // 結果 -> 登入表單
            System.out.println(this.title); // 結果 -> 傳送
            System.out.println(title); // 結果 -> 驗證成功
            System.out.println(userName + "登入了...");
            //this就是class本身，action()是長在內部類別裡的，所以這裡的this就是指向內部類別
        }
    }
    public void print() {
    	Button lf = new LoginForm(userName).new Button();
    	lf.action();
    }
}
