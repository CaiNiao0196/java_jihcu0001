package test.xia;
/*
 * 程序员：姓名，工号，薪水，工作内容
 * 项目经理：姓名，工号，项目奖金，薪水，工作内容
 * 
 */
public class test021抽象类练习 {
	public static void main(String[] args) {
		ChengXuYuan cxy = new ChengXuYuan();
		cxy.GongZuo();

	}

}
//抽象类
abstract class home{
	String name;
	int GongHao;
	int XingShui;
	String NeiRong;
	public abstract void GongZuo();
	
}

//程序员
class ChengXuYuan extends home{
	@Override
	public void GongZuo(){

		System.out.println("是一个程序员！");
	}
}

//项目经理
class JingLi extends home{
    int JiangJin;
	@Override
	public void GongZuo() {

		System.out.println("是一个项目经理！");
	}
	
}

	