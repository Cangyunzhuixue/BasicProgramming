package basic.day2;
/*
 * ����2014��ָ���º��죬���������
 */
import java.util.Scanner;

public class CountDate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		if(month<1&&month>12) {
			System.out.println("�·ݳ�����ϴ����");
			month=scanner.nextInt();
		}
		int day = scanner.nextInt();
		int sumday = 0;// ��¼������
		/*
		 * /��12�¿�ʼд��switch����ڴ�ָ���·ݽ��룬����break�����԰�С�µ���������
		 */
		switch (month) {
		case 12:
			
			sumday += 30;//11�·�����
		case 11:
			sumday += 31;
		case 10:
			sumday += 30;
		case 9:
			sumday += 31;
		case 8:
			sumday += 31;
		case 7:
			sumday += 30;
		case 6:
			sumday += 31;
		case 5:
			sumday += 30;
		case 4:
			sumday += 31;
		case 3:
			sumday += 28;
		case 2:
			sumday += 31;//һ�·�����
		case 1:
			sumday += day;

		default:
			break;
		}
		System.out.println(sumday);
		scanner.close();
	}
}
