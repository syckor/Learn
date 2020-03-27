package d_constructor;

import java.util.Scanner;
import java.util.StringTokenizer;

public class GradeTest3 {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("데이터의 개수");
		num = input.nextInt();
		int jumsu[] = new int[num];
		System.out.println("점수데이터 입력");
		String datas = input.next();
		StringTokenizer st = new StringTokenizer(datas,",");
		for(int i = 0; st.hasMoreTokens() ; i++) {
			String token = st.nextToken();
			jumsu[i] = Integer.parseInt(token);
		}
		GradeExpr3 grade1 = new GradeExpr3(jumsu);
		
		
		System.out.println("총점 :" + grade1.getTotal());
		System.out.println("평균 :" + grade1.getAverage());
		System.out.println("최고점수 :" + grade1.getGoodScore());
		System.out.println("최저점수 :" + grade1.getBadScore());
		
				
	}

}	

	
