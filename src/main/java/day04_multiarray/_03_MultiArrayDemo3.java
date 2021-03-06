package day04_multiarray;

import java.util.Arrays;

public class _03_MultiArrayDemo3 {

	public static void main(String[] args) {
		String[][] ttt = new String[3][3];
        clear(ttt); // 清盤
        init(ttt); // 預設棋盤
        print(ttt); // 列印棋盤
    }
    // 預設資料
    public static void init(String[][] multiArray) {
        multiArray[0][0] = "X";
        multiArray[0][2] = "O";
        multiArray[1][1] = "O";
        multiArray[2][2] = "X";
    }
    
    // 清盤
    public static void clear(String[][] multiArray) {
        for(int i=0;i<multiArray.length;i++) {
            for(int k=0;k<multiArray[i].length;k++) {
                multiArray[i][k] = " ";
            }
        }
    }
    // 列印陣列方法
    public static void print(String[][] multiArray) {
        for(String[] array : multiArray) {
            System.out.println(Arrays.toString(array));
        }
	}

}
