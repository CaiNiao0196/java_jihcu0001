package test.classs;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1、创建主界面
 * 2、定义查询方法
 * 3、定义添加方法
 * 4、定义删除方法
 * 5、定义修改方法
 */
public class studentdemo {
	public static void main(String[] args) {
		ArrayList<student> array = new ArrayList<student>();
		while(true) {
			//1、创建主界面
			System.out.println("--------欢迎来到学生管理系统--------");
			System.out.println("1 查询学生");
			System.out.println("2 添加学生");
			System.out.println("3 删除学生");
			System.out.println("4 修改学生");
			System.out.println("5 退出");
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你的选择：");
			String str = sc.nextLine();
			switch(str) {
			case "1":
				//查询
				getArray(array);
				break;
			case "2":
				//添加
				installArray(array);
				break;
			case "3":
				//删除
				deleteArray(array);
				break;
			case "4":
				//修改
				break;
			case "5":
			default:
				System.out.println("拜拜！");
				System.exit(0);
				break;
			}
		}	
	}
	
	//查询
	public static void getArray(ArrayList<student> array) {
		if(array.size() == 0) {
			System.out.println("未查询到学生信息，请重新选择");
			return;
		}
		System.out.println("学号\t\t姓名\t年龄\t居住地");
		for(int x=0;x<array.size();x++) {
			student s = array.get(x);
			System.out.println(s.getId()+"\t\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
			
		}

	}
	//添加
	public static void installArray(ArrayList<student> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学号");
		String id;
		while(true) {
			id = sc.nextLine();
			//解决学号重复问题
			boolean flag = false;
			for(int x=0;x<array.size(); x++) {
				student s = array.get(x);
				if(s.getId().equals(id)) {
					flag = true;
					break;
				}
			}
			if(flag) {
				System.out.println("学号已占用，请重新输入");
			}else {
				break;
			}
		}
		System.out.println("请输入姓名");
		String name = sc.nextLine();
		System.out.println("请输入年龄");
		String age = sc.nextLine();
		System.out.println("请输入地址");
		String address = sc.nextLine();
		student s = new student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		array.add(s);
		System.out.println("添加成功！");	
	}
	//删除
	public static void deleteArray(ArrayList<student> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要删除的学号");
		String s = sc.nextLine();
		
		int index = -1;
		for(int x=0; x<array.size(); x++) {
			student ss = array.get(x);
			if(ss.getId().equals(s)) {
				index = x;
				break;
			}
		if(index == -1) {
			System.out.println("您输入的学号不存在，请回去重新您的选择");			
		}else {
			array.remove(ss);
			System.out.println("删除成功");
		}
		}
	}
		
}
