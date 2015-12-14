package jp.ac.chibafjb.x15g019.kd101;

public class L163 {

	public static void main(String[] args) {
	int kbs = 0;
	int kane[]={33,18,102,47,5};
	int bouryoku = kane.length;
	for(int sex:kane){
		kbs = kbs+sex;
	}
		System.out.println("合計="+kbs);
	}

}
