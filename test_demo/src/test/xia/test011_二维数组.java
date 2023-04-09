package test.xia;

public class test011_二维数组 {
	public static void main(String[] args) {
		//定义二维数组
		int[][] arr = {{1,3,4,1},{3,1,32,3}};
		//打印二维数组每一个数据
		for(int y = 0; y<arr.length; y++) {
			for(int x = 0; x<arr[y].length; x++) {
				System.out.println(arr[y][x]);
			}
		}
	}

}
