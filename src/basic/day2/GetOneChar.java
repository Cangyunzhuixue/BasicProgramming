package basic.day2;

import java.util.Scanner;

public class GetOneChar {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String string=scanner.nextLine();//����
	char c=string.charAt(0);//��ȡ��һ��
	System.out.println(c);
	scanner.close();
	
	/*
	 * �˴��ָ�
	 * forѭ��������������ִ�е���䣬ͻ��int��i++�ľ���
	 */
	int i=0;
	for (System.out.println("s"); i < 4; i++,System.out.println("b")) {
		System.out.println("s");
	}
}
}
