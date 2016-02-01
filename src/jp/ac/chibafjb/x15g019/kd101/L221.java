package jp.ac.chibafjb.x15g019.kd101;

import java.util.Scanner;

public class L221 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int score[] = new int[100];
		score[99] = 999;
		score[34] = 12;
		String s_num = sin.next();
		int i = Integer.parseInt(s_num);
		ArraProc x = new ArraProc();
		System.out.println(x.linerSearch1(score,i));
		System.out.println(x.linerSearch2(score,i));
	}
}

class ArraProc{
	public int linerSearch1(int[] s,int n) {
		int i = 0;
		while(i<100 && !(s[i] == n)){
			i = i +1;
		}
		return i;
	}


	public int linerSearch2(int[] s,int n) {
		int i = 99;
		while(i>=0 && !(s[i] == n)){
			i = i - 1;
		}
		if(i == -1){
		return (100);
		}else{
			return(i);
		}
	}
	}
	
