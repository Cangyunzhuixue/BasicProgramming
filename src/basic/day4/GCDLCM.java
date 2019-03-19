package basic.day4;

import java.util.Scanner;

import com.sun.javafx.image.impl.IntArgb;

/**
 * 
 * @author Administrator 最大公约数和最小公倍数 用辗转相除法求几个数的最大公约数，可以先求出其中任意两个数的最大公约数，
 *         再求这个最大公约数与第三个数的最大公约数，依次求下去，直到最后一个数为止。 最后所得的那个最大公约数，就是所有这些数的最大公约数。
 *         由于两个数的乘积等于这两个数的最大公约数与最小公倍数的积。 即（a，b）×[a，b]=a×b。
 *         所以，求两个数的最小公倍数，就可以先求出它们的最大公约数，然后用上述公式求出它们的最小公倍数。
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
	 * 最大公因数 递归
	 */
	public static int get_gcd(int a, int b) {
		int max = (a > b) ? a : b;
		int min = (a < b) ? a : b;
		if (max % min != 0) {
			return get_gcd(min, max % min);
		} else
			return min;

	}

	public static int get_lcm(int a, int b) {// 最大公倍数
		return a * b / get_gcd(a, b);
	}

}
