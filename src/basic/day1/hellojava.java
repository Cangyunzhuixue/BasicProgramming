package basic.day1;

import java.util.Scanner;



/**
 * @author Administrator
 *
 */

/*
 * Ctrl+shift+f
 */

public class hellojava {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("intput the firtnumber: ");
		int num1 = scanner.nextInt();
		//System.out.println("intput the secondnumber: ");
		int num2 = scanner.nextInt();
		//System.out.println("intput ThemeClient thirtnumber");
		int num3 = scanner.nextInt();
		
		if (num1 >= num2) {
		if (num2>=num3) {
			System.out.println(num1+" "+num2+" "+num3);
		}else if(num1>=num3){
			System.out.println(num1+" "+num3+" "+num2);
		}else {
			System.out.println(num3+" "+num1+" "+num2);
		}
		}else if(num1>=num3){
			System.out.println(num2+" "+num1+" "+num3);
		}else if(num2>=num3){
			System.out.println(num2+" "+num3+" "+num1);
		}else {
			System.out.println(num3+" "+num2+" "+num1);
		}
		scanner.close();
	}
}
