package basic.day4;
/*
 * 球数组的最大值、最小值，平均数，总和
 */
public class AboutArray {
public static void main(String[] args) {
	int[] array01=new int[] {9,8,77,25,3,1,5,95,120};
	int max=array01[0];
	int min=array01[0];
	int sum=0;
			for (int i = 0; i < array01.length; i++) {
				max=(max>array01[i])?max:array01[i];
				min=(min<array01[i])?min:array01[i];
				sum+=array01[i];
			}
			System.out.println(max);
			
			System.out.println(min);
			System.out.println(sum/array01.length);
			
	}

}
