package jp.ac.chibafjb.x15g019.kd101;

public class L161 {

	public static void main(String[] args) {
		int[] test=new int[2];
		test[0]=10;
		test[1]=20;
		int work = 0;
		work = test[1];
		test[1]=test[0];
		test[0]=work;
		int c = 0;
		for(int i:test){
			System.out.format("test[%s]="+i+"\n",c);
			c = c+1;
		}
	}

}
