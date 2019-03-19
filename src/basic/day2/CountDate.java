package basic.day2;
/*
 * 输入2014年指定月和天，输出总天数
 */
import java.util.Scanner;

public class CountDate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		if(month<1&&month>12) {
			System.out.println("月份出错，冲洗输入");
			month=scanner.nextInt();
		}
		int day = scanner.nextInt();
		int sumday = 0;// 记录总天数
		/*
		 * /从12月开始写，switch的入口从指定月份进入，不加break，可以把小月的天数加上
		 */
		switch (month) {
		case 12:
			
			sumday += 30;//11月份天数
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
			sumday += 31;//一月份天数
		case 1:
			sumday += day;

		default:
			break;
		}
		System.out.println(sumday);
		scanner.close();
	}
}
