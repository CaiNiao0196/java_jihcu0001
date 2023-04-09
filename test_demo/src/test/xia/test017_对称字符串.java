package test.xia;

import java.util.Scanner;

public class test017_对称字符串 {
	public static void main(String[] args) {
		//键盘录入一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String s = sc.nextLine();
		//写方法判断
		//调用方法
		deng(s);
		
	}
	public static boolean deng(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String ss = sb.toString();
		return ss.equals(s);

	}

}
