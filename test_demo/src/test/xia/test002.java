package test.xia;

//创建键盘录入对象联系--导包
import java.util.Scanner;
public class test002 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		//接收数据
		System.out.println("第一个");
		int test001 = sc.nextInt();
		System.out.println("第二个");
		int test002 = sc.nextInt();
		System.out.println("第三个");
		int test003 = sc.nextInt();
		
		int max001 = (test001>test002)?test001:test002;
		int max002 = (max001>test003)?max001:test003;
		System.out.println("max:"+max002);		
	}
}
