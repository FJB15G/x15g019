package jp.ac.chibafjb.x15g019.kd101;

public class L211 {

	public static void main(String[] args) {
		int[] num = new int[100];
		int a = num.length;
		ArrayProc x = new ArrayProc();
		System.out.println(x.maxFind1(num,a));
		System.out.println(x.maxFind2(num,a));
		
	}

}

class ArrayProc{
	int maxFind1(int num[],int a){
		int m = 0;
		int i = 0;
		while(i<a){
			if(num[i] > m){
				m = num[i];
			}
		i = i+1;
		}
		return m;
	}
	
	int maxFind2(int num[],int a){
		int i =1;
		int m = num[0];
		while(i<a){
			if(num[i]>m){
		m = num[i];
		}
		i = i + 1;
	}
		return m;
}
}