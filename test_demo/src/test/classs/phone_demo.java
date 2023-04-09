package test.classs;
//调用手机类
public class phone_demo {
	public static void main(String[] args) {
		//无参方法调用
		phone_class p2  = new phone_class();
		p2.getName("vivo");
		p2.getPrice(3999);
		System.out.println(p2.getName()+p2.getPrice());
		//调用构造方法
		phone_class p  = new phone_class("oppo", 2999);
		System.out.println(p.getName()+p.getPrice());
		
	}

}
