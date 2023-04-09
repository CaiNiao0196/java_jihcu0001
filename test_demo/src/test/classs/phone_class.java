package test.classs;
//练习手机类

public class phone_class {
	private String name;
	private int price;
	
	//构造方法
	public phone_class() {}
	public phone_class(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//方法
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	

}