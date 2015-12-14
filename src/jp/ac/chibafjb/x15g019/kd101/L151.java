package jp.ac.chibafjb.x15g019.kd101;

import java.util.Scanner;

public class L151 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("aの入力-->");
		float a = sin.nextFloat();
		System.out.print("bの入力-->");
		float b = sin.nextFloat();
		float q = a+ b;
		float w = a*b;
		float n = a-b;
		float m = a/b;
		System.out.println("a+b="+q);
		System.out.println("a-b="+n);
		System.out.println("a*b="+w);
		System.out.println("a/b="+m);
		

	}

}
