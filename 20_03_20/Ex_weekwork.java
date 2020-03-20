package d_array;

import java.util.Scanner;

public class Ex_weekwork {

	public static void main(String[] args) {
		
		//String -> char[] 변환
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("테스트 케이스의 개수 : ");
		int a = input.nextInt();
		input.nextLine();
		char test[][] = new char[a][];
		  //여기까지 테스트케이스의 개수가 몇개인지 알아내는 과정
		
		
		for(int i = 0; i < a ; i++) {
			System.out.println("테스트결과를 입력하세요");
			test[i] = input.nextLine().toCharArray();   //String을 char array로 변환해줌
			                                            //여기까지 해서 test배열을 완료   
			// 1+ 2 + 3 + 4 + .....
//			if(ch[i]=='O')
//			{
//			count++;
//			for(int j=1; j==ch.length;j++)
//			{
//			if(ch[i]==ch[j])
//			{
//			count++;
//			}
//			}
//			}
//			else
//			{
//			count=0;
//			}
//			total=total+count;
//			}
//			System.out.println(total);
//			}
			int result = 0; 
			int o = 0;
			for ( int j = 0; j < test[i].length ; j++) {   //test[i][j]
				
//				int sum = 0;
//				for (int i = 1 ; i <= 100; i++) {
//					sum += i;
				
				if(test[i][j] == 'o') {
					o++;
					for(int k = 1; k ==test[i].length ; k++) {
						if(test[i] == test[k]) {
						o++;
						}
					}
				} else {
					o = 0;
				}
				result = result + 0;
				
//				for (int k = 0; k < test[i].length ; k++) { //   (test[j]==0 )이라고 하니 안되었던것. test[][]로 선언했으면 test[][]로 비교해줄것
//					if(test[i][j] == 'x') {														
			}
			System.out.println(result);
			System.out.println();
		}
	
	}

}
