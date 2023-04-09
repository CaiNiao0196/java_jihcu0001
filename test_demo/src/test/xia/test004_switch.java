package test.xia;

import java.util.Scanner;
/*
 *不加break，会从当前case一直往后执行
 *加break，会从当前执行到break停止 
 */

public class test004_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("快点写");
		int demo = sc.nextInt();
		switch (demo) {
		case 1:
			System.out.println("就会个1");
		case 2:
			System.out.println("会2了？");
			break;
		case 3:
			System.out.println("有3了");
		}
	}

}
