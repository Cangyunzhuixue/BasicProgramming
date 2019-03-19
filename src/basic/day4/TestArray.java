package basic.day4;
/*
 * 使用array2=array1，会使修改array2时把array1也修改了
 */
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1, array2;
		int temp=0;
		array1 = new int[] { 2, 3, 5, 7, 9, 11, 13, 17, 19
		};
		array2=new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]+" ");
					}
		System.out.println();
		for (int i = 0; i < array1.length; i++) {
			if (i%2==0) {
				array2[i]=i;
			}else
			array2[i]=array1[i];
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < array2.length/2; i++) {//反转
			temp=array2[i];
			array2[i]=array2[array2.length-1-i];
			array2[array2.length-i-1]=temp;
			
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+" ");
		}
	}

}
