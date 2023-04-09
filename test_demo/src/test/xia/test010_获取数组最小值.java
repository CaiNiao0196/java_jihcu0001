package test.xia;

public class test010_获取数组最小值 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {1,0,0,4,8,9,0};
		//定义参照物
		int max = arr[0];
		//for循环获取数组中每个元素
		for(int x = 0; x<arr.length; x++) {
			//与参照物比较
			if(arr[x]<=max) {
				max = arr[x];
				
			}
		}
		//输出最小值
		System.out.println(max);
		
		
	}

}
