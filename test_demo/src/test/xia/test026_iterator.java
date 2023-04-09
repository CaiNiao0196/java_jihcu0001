package test.xia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//遍历集合
public class test026_iterator {
	public static void main(String[] args) {
		ccc();
		ddd();
		lll();
	}
		
	//方法1：将集合使用toArray转换为数组，再遍历数组
	public static void ccc(){
		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		Object[] o = c.toArray();
		for(int x=0; x<o.length; x++) {
			System.out.println(o[x]);
		}
	}

	// 方法2：迭代
	public static void ddd() {
		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		
		//创建迭代对象
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	//并发修改异常（Iterator没有添加方法，使用ListIterator）
	public static void lll() {
		List l = new ArrayList();
		l.add("hello");
		l.add("test");
		ListIterator lis = l.listIterator();
		while(lis.hasNext()) {
			String str = (String)lis.next();
			if(str.equals("hello")) {
				lis.add("world");
			}	
		}
		System.out.println(lis.next());
	}
}