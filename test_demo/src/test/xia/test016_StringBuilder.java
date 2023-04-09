package test.xia;

public class test016_StringBuilder {
	public static void main(String[] args) {
		//StringBuilder -- > String
		StringBuilder sb = new StringBuilder();
		sb.append(false);
		String s = sb.toString();
		System.out.println(s);
		//String --> StringBuilder
		String ss = "aaa";
		StringBuilder sb2 = new StringBuilder(ss);
		System.out.println(sb2);	
		}

}
