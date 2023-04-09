package test.xia;
/*
 * 练习内部类的调用：
 * 1、成员方法调用
 * 2、自己调用
 * 
 */
public class test023内部类 {
	public static void main(String[] args) {
		//通过类调用内部类
		test tt = new test();
		tt.method();
		//通过内部类调用
		test.test1 t1 = new test().new test1();
		t1.method1();
		//static调用内部类方法1：创建内部类对象调用（调用不是静态的成员方法）
		test.test3 t3 = new test.test3();
		t3.nostatic();
		//直接使用类名调用static修饰的成员方法
		test.test3.static1();
		
	}

}
class test{
	private int num = 2;
	public void method(){
		test1 t = new test1();
		t.method1();
	}
	class test1{
		public void method1() {
			System.out.println(num);
		}
	}
	static class test3{
		public void nostatic() {
			System.out.println("不是static修饰的成员方法");
		}
		public static void static1() {
			System.out.println("static修饰的成员方法");
		}
	}
}
