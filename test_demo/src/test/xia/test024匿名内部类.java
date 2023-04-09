package test.xia;
//练习：创建动物类，
public class test024匿名内部类 {
	public static void main(String[] args) {
		test(
				new animal() {

					@Override
					public void eat() {
						System.out.println("eat");
					}
					
				}
			);

	}
	public static void test(animal a) {
		a.eat();

}
//动物类
interface animal{
	public abstract void eat();
}
}



