package homework;

import java.util.Random;
import java.util.Scanner;

public class day001 {
	public static void main(String[] args) {
//		//test001
//		int x = 10; 
//	    int y = x++;
//	    int z = x++ + --y + x;
//	    System.out.println(z);
//	    //答案：32
	    
//	    //test002
//	    //2. 键盘录入两个整数,分别赋值给int变量x,y然后比较x和y的大小
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println("请输入x：");
//	    int x = sc.nextInt();
//	    System.out.println("请输入y：");
//	    int y = sc.nextInt();
//	    System.out.println("比较大的是："+Math.max(x, y)
	    
//	    //3. 实现猜测游戏, 游戏规则,随机生成一个1-100内的整数, 然后键盘录入一个数
//	    如果这个数比我们随机的数大就提示用户"输入的数大了", 当然如果用户输入的数比我们
//	    随机生成的数小的话就提示"输入的数小了",直到用户输对为止;
//		while(true) {
//			Random ran = new Random();
//			int x = ran.nextInt(0,100);
//			Scanner sc = new Scanner(System.in);
//			System.out.println("请输入你的数字（1-100）：");
//			int y = sc.nextInt();
//			if(x == y) {
//				System.out.println("你输入的是"+y+",恭喜你，猜对了！");
//				break;
//			}else {
//				System.out.println("我的是"+x+"很遗憾，你猜错了!");
//			}
//			
//		}	
		

//	    4.统计第三题用户猜的次数
//		while(true) {
//			Random ran = new Random();
//			int x = ran.nextInt(0,100);
//			Scanner sc = new Scanner(System.in);
//			System.out.println("请输入你的数字（1-100）：");
//			int y = sc.nextInt();
//			if(x == y) {
//				System.out.println("你输入的是"+y+",恭喜你，猜对了！");
//				break;
//			}else {
//				System.out.println("我的是"+x+"很遗憾，你猜错了!");
//			}	
//		}
		
		
//	    5.现在已知数组int[] arr = {12,34,465,3,45};
//	    要求创建一个新的数组,将arr的元素倒序放入新数组中,
//	    然后求出数组中的最大值是多少?然后求出最大值的角标是第几个
		int[] arr = {12,34,465,3,45};
		for(int start=0; end=arr.length-1; start<=end; start++; end--) {
			int temp = arr[start];
			arr[end] = arr[start];
			arr[start] = temp;
		}
		
		
		
		
//	    6.将第五题中最大值和最小值的位置进行交换;
		
		
		
//	    7.定义中国人类, 中国人都有国籍,并且值是中国, 有年龄,姓名,性别;
//	    8.使用静态的特点定义一个工具类专门用于操作数组的, 这个工具类有以下功能
//	      1)可以将整数类型的数组中的最大值找到
//	      2)可以将整数类型的数组中的最小值找到
//	      3)可以遍历一个整数数组;
//	      4)可以求出数组中最大值的角标
//	      5)可以求出数组中最小值的角标;
//	      6)可以对整数类型的数组进行排序
//	    9.能够说出代码块特点

	}
	

}
