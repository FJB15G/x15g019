package jp.ac.chibafjb.x15g019.kd101;

public class L164 {

	public static void main(String[] args) {
		int a[]={5,15,25};
		int b[]=new int[3];
		int c = 0;
		for(int x:a){
			b[c]=x;
			System.out.format("b[%s]="+b[c]+"\n",c);
			c = ++c;
		}
	}

}
