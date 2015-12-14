package jp.ac.chibafjb.x15g019.kd101;

import java.util.Scanner;

public class L142 {

	public static void main(String[] args) {
		
		Scanner sin = new Scanner(System.in); 
		System.out.print("整数aの入力-->");
		String a = sin.next();             
		System.out.print("整数bの入力-->");
		String b = sin.next();
		sin.close();
		int o = Integer.parseInt(a)+ Integer.parseInt(b);
		int m = Integer.parseInt(a)- Integer.parseInt(b);
		int n = Integer.parseInt(a)* Integer.parseInt(b);
		int k = Integer.parseInt(a)/ Integer.parseInt(b);
		System.out.println(a+" + "+b+" = "+o);
		System.out.println(a+" - "+b+" = "+m);
		System.out.println(a+" * "+b+" = "+n);
		System.out.println(a+" / "+b+" = "+k);
	}

}
