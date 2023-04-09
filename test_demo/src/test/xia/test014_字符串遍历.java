package test.xia;
/*分析
 * 	1、输入一个字符串
 * 	2、进行遍历
 */

import java.util.Scanner;

public class test014_字符串遍历 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String zf = sc.nextLine();
		
		for(int x=0;x<zf.length();x++) {
			System.out.println(zf.charAt(x));
		}
		
	}
	
	
	
	

}
