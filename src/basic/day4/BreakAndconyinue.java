package basic.day4;
/**
 * 
 * @author Administrator
 *break:使用在switch-case中或循环中
 *如果使用在循环中，表示：结束当前循环
 *continue：使用在循环结构中
 *表示：结束当次循环
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
