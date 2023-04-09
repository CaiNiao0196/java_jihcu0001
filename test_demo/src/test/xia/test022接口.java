package test.xia;
/*
 * 接口与接口的关系练习
 */
public class test022接口 {
	public static void main(String[] args) {
		test003 test = new test003();
		test.methond1();
	}
}
interface test001{
	public abstract void methond1();
}
interface test002 extends test001{
	public abstract void methond2();
}
class test003 implements test002 {
	@Override
	public void methond1() {
		System.out.println("aaa");
	}

	@Override
	public void methond2() {

		
	}
}
