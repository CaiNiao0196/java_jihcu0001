package test.xia;

//定义方法进行数组求和
public class test013_方法2 {
	public static void main(String[] args) {
		int[] arr = {1,6,89,67,45};
		int sum = he(arr);
		System.out.println(sum);
	}
	//返回值类型 int
	//参数列表 arr
	public static int he(int[] arr) {
		int hee = 0;
		for(int x = 0; x<arr.length; x++) {
			hee += arr[x];
		}
		return hee;
	}

}
