package basic.day2;

/*a~z的ASCII码数为97~122
 * A~Z为65~90
 * 转移是+-32
 */

public class hellojava {
public static void main(String[] args) {
	int chararry[]=new  int[26];
	for (int i = 0,j=97; i < chararry.length; i++,j++) {
		chararry[i]=j;
		char letter=(char)chararry[i];
		System.out.print(letter);
	}
	System.out.println();
	for (int i = 0; i < chararry.length; i++) {
		chararry[i]-=32;//原数等于减之后的数值
		if(chararry[i]>64&&chararry[i]<69){
		char letter2=(char)chararry[i];
		System.out.print(letter2+" ");
		}else {
			System.out.print("o ");
		}
	}
}
}
