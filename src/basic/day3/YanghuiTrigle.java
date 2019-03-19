package basic.day3;


/**
 * Ñî»ÔÈý½Ç
 * 
 * @author Administrator
 *
 */
public class YanghuiTrigle {

	public static void main(String[] args) {
		int rows = 10;
		 
		         for(int i =0;i<rows;i++) {
		             int number = 1;
		             //´òÓ¡¿Õ¸ñ×Ö·û´®
		             System.out.format("%"+(rows-i)*2+"s","");
		             for(int j=0;j<=i;j++) {
		                 System.out.format("%4d",number);
		                 number = number * (i - j) / (j + 1);                
		            }
		            System.out.println();
		        }
	}

}
