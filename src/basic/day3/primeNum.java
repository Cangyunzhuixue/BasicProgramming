package basic.day3;



/**
 * 
 * @author Administrator ÖÊÊı
 */
public class primeNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (isPrimeNum(i)) {
				System.out.println(i);
				sum++;
			}
		}
		System.out.println(sum);
	}

	public static Boolean isPrimeNum(int i) {
		
		if (i==1) {
			return false;
		}
		for (int j = 2; j < i; j++) {
			
			if (i%j == 0) {
				
				return false;
			}
		}
		return true;

	}
}
