package basic.day4;
/*
 * 1.数字常见异常：越界
 * 2.空指针异常
 */
public class TdArray {
public static void main(String[] args) {
	/*int[][] student=new int[4][3];//4一定在，3可不再
	int[][] arr=new int[][] {{3,8,8},{2,7},{90,1,6,7}};
	int sum=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]+"\t");
			sum+=arr[i][j];
		}
		System.out.println();
	}
	System.out.println(sum);
	int[]x,y[];*/
	//int[] x；一维
	//int[] y[];二维
	int[][] yanghuiTri=new int[10][10];
	for (int i = 0; i < yanghuiTri.length; i++) {
		for (int j = 0; j < i; j++) {
			if(j!=0&&j!=i&&i>2) {
			yanghuiTri[i][j]=yanghuiTri[i-1][j-1]+yanghuiTri[i-1][j];
			}else {
				yanghuiTri[i][j]=1;
			}
			System.out.print(yanghuiTri[i][j]+" ");
		}
		System.out.println();
	}
	
}
} 
