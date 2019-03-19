package basic.day4;

import java.util.Scanner;

import com.sun.javafx.image.impl.IntArgb;

/**
 * 
 * @author Administrator ���Լ������С������ ��շת������󼸸��������Լ��������������������������������Լ����
 *         ����������Լ����������������Լ������������ȥ��ֱ�����һ����Ϊֹ�� ������õ��Ǹ����Լ��������������Щ�������Լ����
 *         �����������ĳ˻������������������Լ������С�������Ļ��� ����a��b����[a��b]=a��b��
 *         ���ԣ�������������С���������Ϳ�����������ǵ����Լ����Ȼ����������ʽ������ǵ���С��������
 */
public class GCDLCM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(get_gcd(a, b));
		System.out.println(get_lcm(a, b));
		scanner.close();
	}

	/*
	 * ������� �ݹ�
	 */
	public static int get_gcd(int a, int b) {
		int max = (a > b) ? a : b;
		int min = (a < b) ? a : b;
		if (max % min != 0) {
			return get_gcd(min, max % min);
		} else
			return min;

	}

	public static int get_lcm(int a, int b) {// ��󹫱���
		return a * b / get_gcd(a, b);
	}

}
