package test.xia;
//do...while实现求和
public class test007_do_while {
	public static void main(String[] args) {
		//初始化
		int sum = 0;
		int x = 1;
		do {
			if (x%2 ==0) {
				sum += x;
				}
			x++;
			}
		while(x<=100);
		System.out.println(sum);
	}

}
