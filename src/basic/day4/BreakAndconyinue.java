package basic.day4;
/**
 * 
 * @author Administrator
 *break:ʹ����switch-case�л�ѭ����
 *���ʹ����ѭ���У���ʾ��������ǰѭ��
 *continue��ʹ����ѭ���ṹ��
 *��ʾ����������ѭ��
 */
public class BreakAndconyinue {

	public static void main(String[] args) {
		/*for (int i = 0; i < 10; i++) {
			if(i==7) {
				continue;
			}
			System.out.println(i);
		}*/
		// TODO Auto-generated method stub
		l: for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 9; j++) {
				if (j==4) {
					continue l;
				}
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
