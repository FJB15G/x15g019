package jp.ac.chibafjb.x15g019.kd101;

import java.util.Scanner;

public class L141 {

	public static void main(String[] args) {
		System.out.print("整数を一つ入力してください-->");
		Scanner sin = new Scanner(System.in); 
		String s = sin.next();                
		sin.close();                           
		System.out.println("あなたが入力したのは"+s+"です");
	}

}
