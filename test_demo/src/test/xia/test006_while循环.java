package test.xia;

public class test006_while循环 {
	public static void main(String[] args) {
		//求水仙花数并统计
		//定义统计初始化数
		int sum =0;
		//定义初始化数
		int x =100;
		//循环实现
		while(x<=1000) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai == x) {
				sum++;
				System.out.println(x);
			}
			//控制语句
			x++;
		}
//		System.out.println(x);
	}
}
