package test.xia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test027_泛型和foreach {
	public static void main(String[] args) {
		//泛型：对象后加类型
		
		Collection<student> stu = new ArrayList<student>();
		student s = new student("aaa", "33");
		stu.add(s);
		Iterator<student> it = stu.iterator();
		while(it.hasNext()) {
			student ss = it.next();
			System.out.println(ss.name);
		}
		
		//foreach调用
		foreach f = new foreach();
		f.test1();
	}

}
class student{
	String name;
	String age;
	public student(String name, String age) {
		this.name = name;
		this.age = age;
		
	}
}

// foreach循环
class foreach{
	public void test1() {
		Collection<String> c = new ArrayList<String>();
		c.add("test");
		c.add("bbb");
		for(String s: c) {
			System.out.println(s);
		}
	}
	
}
