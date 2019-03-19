package basic.day3;
/**
 * 打印金字塔
 */
import java.util.Scanner;

public class printTyramid {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	
	for (int i = 0; i < n; i++) {//上半段行數為n
		for (int j = 1; j <n-i ; j++) {
			System.out.print(" ");//空格數
		}
		for (int j = 0; j < i+1; j++) {//星星數
			System.out.print("* ");
		}
		System.out.println();
	
	}
	
	for (int i = 1; i < n; i++) {//下半段行數為n-1
		for (int j = 1; j < i+1; j++) {//每一行空格數是
			System.out.print(" ");
		}
		for (int j = 0; j < n-i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	scanner.close();
}
}
