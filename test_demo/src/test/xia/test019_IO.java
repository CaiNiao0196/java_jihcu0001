package test.xia;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//练习复制文件
public class test019_IO {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("demo.txt"));
		//1,一次读取一个字符
//		int x;
//		while((x = br.read())!= -1) {
//			bw.write(x);
//		}
		//2,一次读取一个数组
		char[] cha = new char[1024];
		int len;
		while((len = br.read(cha)) != -1) {
			bw.write(cha,0,len);
		}
		br.close();
		bw.close();
		
	}

}
