package test.xia;

import java.util.Random;
import java.util.Scanner;

//系统生成数字，猜对不对
/*1、填写数字
 *2、系统生成数字
 *3、给出答案是否正确
 */

public class test008_random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字：（5-10）");
		int sca = sc.nextInt();
		if (sca>=5 && sca<=10) {
		}else {
			System.out.println("输入有误！请重新输入");
			continue;
		}
		
		
		Random number = new Random() ;
		int num = number.nextInt(15) -5;
		if (sca == num) {
			System.out.println("恭喜你！猜对了！");
		}else {
			System.out.println("随机数是："+num+"不好意思！答错了！");
			
		}
		
		
	}
	
	
	
	

}
