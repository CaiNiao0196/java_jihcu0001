package test.xia;

import java.util.ArrayList;

/*
 * 1、有一个数组
 * 2、将所有元素添加到集合
 * 3、打印所有张姓人员
 */
public class test018_集合 {
	public static void main(String[] args) {
		//定义数组
		String[] arr = {"张三","李四","张四"};
		//添加到集合
		ArrayList<String> array = new ArrayList<String>();
		for(int x=0; x<arr.length; x++) {
			array.add(arr[x]);
		}
		for(int x=0;x<array.size(); x++) {
			String s = array.get(x);
			if(s.startsWith("张")) {
				System.out.println(s);
			}
			
		}
		
	}

}
