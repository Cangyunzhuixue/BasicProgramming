package basic.day2;

public class FooBizBaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, sum = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 7 == 0) {
				count++;
				sum += i;
			}

		}
		int singleDigit = 0, tenDigit = 0, hundredsDigit = 0;
		int a = 0, b = 0;

		/*
		 * 此處分割 方法一
		 */
		for (int i = 100; i < 1000; i++) {
			hundredsDigit = i / 100;
			a = i % 100;
			tenDigit = a / 10;
			b = a % 10;
			singleDigit = b;
			if (hundredsDigit * hundredsDigit * hundredsDigit + tenDigit * tenDigit * tenDigit
					+ singleDigit * singleDigit * singleDigit == i) {
				System.out.println(i);
			}
		}
		/*
		 * 方法二
		 */
		for (int i = 100; i < 1000; i++) {
			hundredsDigit = i / 100;
			tenDigit = (i - hundredsDigit * 100) / 10;
			singleDigit = i % 10;
			if (hundredsDigit * hundredsDigit * hundredsDigit + tenDigit * tenDigit * tenDigit
					+ singleDigit * singleDigit * singleDigit == i) {
				System.out.println(i);
			}
		}
	}

}
