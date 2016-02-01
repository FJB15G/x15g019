package jp.ac.chibafjb.x15g019.kd101;

import java.util.Scanner;

public class L173 {
	public static void main(String[]args){
		int data[];
		for(int a = 0;;a++){
		Scanner sin = new Scanner(System.in);
		int x = int(sin);
		data[a] = sin;
		}
		for(int a=data.length-1;a>0;a--){
			data[a]=data[a-1];
		}
		for(int a:data){
			System.out.println(a);
		}
	}
}