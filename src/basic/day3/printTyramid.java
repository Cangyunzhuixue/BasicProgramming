package basic.day3;
/**
 * ��ӡ������
 */
import java.util.Scanner;

public class printTyramid {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	
	for (int i = 0; i < n; i++) {//�ϰ���Д���n
		for (int j = 1; j <n-i ; j++) {
			System.out.print(" ");//�ո�
		}
		for (int j = 0; j < i+1; j++) {//���ǔ�
			System.out.print("* ");
		}
		System.out.println();
	
	}
	
	for (int i = 1; i < n; i++) {//�°���Д���n-1
		for (int j = 1; j < i+1; j++) {//ÿһ�пո���
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
