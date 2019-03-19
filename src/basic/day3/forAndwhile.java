package basic.day3;

import java.util.Scanner;

public class forAndwhile {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int sum=0;
	int j=0;
	int inputNum;
	int oddNum=0;
	int evebNUm=0;
/*	for (int i = 0; i <100; i++) {
		if(i%2==0) {
			sum+=i;
		}
	}*/
	/*System.out.println(sum);*/
	/*sum=0;*/
/*	while(j<100){
		if(j%2==0) {
			sum+=j;
		}
		j++;
}*/
	/*System.out.println(sum);*/
	do {
		 inputNum=scanner.nextInt();
		 if(inputNum>0) {
			 oddNum++;
		 }
		 if(inputNum<0){
			evebNUm++; 
		 }	 
		 
	}while(inputNum!=0);
	System.out.println(oddNum+" "+evebNUm);
	scanner.close();
}

}