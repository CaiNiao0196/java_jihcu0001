package test.xia;

import java.util.ArrayList;
import java.util.Collection;

//练习Collection
public class test025_Collection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		//添加add
		c.add(1998);
		//清空元素clear
		c.clear();
		//判断是否为空
		c.isEmpty();
		//判断集合中是否包含指定元素
		c.contains(19);
		//删除remove
		c.remove(1);
		//获取长度
		c.size();
		//将集合转换为一个Object类型的数组
		c.toArray();
		System.out.println(c);
	}
}
