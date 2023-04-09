package test.xia;

public class test015_字符串的转换 {
	public static void main(String[] args) {
		//字符串转换为数组
		String str = "hello";
		char[] char1 = str.toCharArray();
		System.out.println(char1);
		
		//字符串转为小写
		System.out.println("HEllo".toLowerCase());
		//字符串转为大写
		System.out.println("Hello".toUpperCase());
	}

}
