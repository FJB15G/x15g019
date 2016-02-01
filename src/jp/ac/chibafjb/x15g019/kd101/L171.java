package jp.ac.chibafjb.x15g019.kd101;

public class L171 {
	public static void main(String[]args){
		int data[] = {100,200,300,0};
		for(int a=data.length-1;a>0;a--){
			data[a]=data[a-1];
		}
		for(int a:data){
			System.out.println(a);
		}
	}
}
