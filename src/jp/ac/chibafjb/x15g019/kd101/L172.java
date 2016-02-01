package jp.ac.chibafjb.x15g019.kd101;

public class L172 {
	public static void main(String[]args){
		int x[] = {1,2,3};
		int y[] = {7,8};
		int z[] = new int[100];
		int g = 0;
		for(int a:x){
			z[g]=a;
			g = g + 1;
		}
		for(int a:y){
			z[g]=a;
			g = g + 1;
		}
		int k = x.length;
		int c = y.length;
	for(int m=0;m<k+c;m++){
		System.out.println(z[m]);
	}
	}
}
