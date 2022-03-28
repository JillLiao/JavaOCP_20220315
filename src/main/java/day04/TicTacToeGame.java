package day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
	static String[][] ttt= new String[3][3];
	
	public static void main(String[] args) {		
		start();
	}
	
	//開始
	public static void start() {
		clear();
		gameLoop();
	}
	
	//清盤
	public static void clear() {
		for(int i=0;i<ttt.length;i++) {
			for(int j=0;j<ttt[i].length;j++) {
				ttt[i][j]=" ";
			}
		}
	}

	//遊戲主體
	public static void gameLoop() {
		System.out.println("遊戲開始~");
		do {
			print();
			try {
				userPlay();
			} catch (RuntimeException e) {
				System.err.println("此處已被劃記，請重新輸入!");
				continue;
			}
			if(checkWinner("O")) {	//若已判斷獲勝
				print();	//印出最後的結果
				break;	//離開遊戲
			}
			pcPlay();
			if(checkWinner("X")) {
				print();
				break;
			}
			
		} while (true);
	}
	
	//印出盤面
	public static void print() {
		for(String[] t: ttt) {
			System.out.println(Arrays.toString(t));
		}
	}
	
	//user玩
	public static void userPlay() throws RuntimeException{
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入位置: ");
		int o = sc.nextInt();
		if(ttt[o/3][o%3].equals(" ")) {
			ttt[o/3][o%3] = "O";
		}else {
			RuntimeException e = new RuntimeException("此處已被劃記");
			throw e;
		}
	}
	
	//電腦玩
	public static void pcPlay() {
		Random r = new Random();
		System.out.print("請PC輸入位置: ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while (true) {
			int x = r.nextInt(9);//0~8
			if(ttt[x/3][x%3].equals(" ")) {
				System.out.println(x);
				ttt[x/3][x%3] = "X";
				break;
			}		
		}		
	}
	
	//判斷輸贏
	public static boolean checkWinner(String mark) {
		String marks =mark+mark+mark;
		if( (ttt[0][0]+ttt[0][1]+ttt[0][2]).equals(marks) ||
			(ttt[1][0]+ttt[1][1]+ttt[1][2]).equals(marks) ||
			(ttt[2][0]+ttt[2][1]+ttt[2][2]).equals(marks) ||
			(ttt[0][0]+ttt[1][0]+ttt[2][0]).equals(marks) ||
			(ttt[0][1]+ttt[1][1]+ttt[2][1]).equals(marks) ||
			(ttt[0][2]+ttt[1][2]+ttt[2][2]).equals(marks) ||
			(ttt[0][0]+ttt[1][1]+ttt[2][2]).equals(marks) ||
			(ttt[0][2]+ttt[1][1]+ttt[2][0]).equals(marks) 
			) {
			System.out.printf("%s獲勝!\n",mark.equals("O")?"User":"PC");
			return true;
		}
		for(String[] row: ttt) {
			for(String t: row) {
				if(t.equals(" ")) {
					return false;	//前面輸贏判斷完後，棋盤上還有空格，表示尚未出現贏家
				}
			}
		}
		System.out.println("和局! 請重新開始~");
		return true;
	}
}
