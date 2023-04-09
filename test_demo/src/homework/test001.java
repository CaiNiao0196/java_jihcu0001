package homework;

import java.util.Calendar;

/*
 * 
 * 6.通过Calendar对象获取今天是多少年多少月多少日;
 *  (1)获取今天在一年中是第几周;
 *  (2)获取单前月份在一年中是第几个月;
 */
public class test001 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int d = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year +"年"+month+"月"+d+"日");
		int week = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println(week);
		int mon = c.get(Calendar.MONTH)+1;
		System.out.println(mon);
	}

}

