package basic.day2;

import java.util.Scanner;

public class GetOneChar {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String string=scanner.nextLine();//输入
	char c=string.charAt(0);//获取第一个
	System.out.println(c);
	scanner.close();
	
	/*
	 * 此处分割
	 * for循环内有两个可以执行的语句，突破int，i++的局限
	 */
	int i=0;
	for (System.out.println("s"); i < 4; i++,System.out.println("b")) {
		System.out.println("s");
	}
}
}
