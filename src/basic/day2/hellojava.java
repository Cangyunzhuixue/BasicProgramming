package basic.day2;

/*a~z��ASCII����Ϊ97~122
 * A~ZΪ65~90
 * ת����+-32
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
		chararry[i]-=32;//ԭ�����ڼ�֮�����ֵ
		if(chararry[i]>64&&chararry[i]<69){
		char letter2=(char)chararry[i];
		System.out.print(letter2+" ");
		}else {
			System.out.print("o ");
		}
	}
}
}
