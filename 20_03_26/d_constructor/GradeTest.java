package d_constructor;

import java.util.Scanner;
import java.util.StringTokenizer;

import c_array.Student;

public class GradeTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("데이터의 개수 입력");
		int howManyData = input.nextInt();
		int jumsu[] = new int[howManyData];
		
		System.out.print("데이터입력");
		String data = input.next();
		StringTokenizer st = new StringTokenizer(data,",");
		for(int i = 0; st.hasMoreTokens(); i++) {
			String token = st.nextToken();
			jumsu[i] = Integer.parseInt(token);
		}
		
		for(int i = 0; i < jumsu.length ; i++) {
			System.out.print(jumsu[i] + ",");
		}
		
		GradeExpr grade = new GradeExpr(jumsu); // jumsu[]가 아니랄 jumsu로 입력
		
		System.out.println("총점 : " + grade.getTotal());
		System.out.println("평균 : " + grade.getAverage());
		System.out.println("최고점수 : " + grade.getGoodScore());
		System.out.println("최저점수 : " + grade.getBadScore());
		
		
		

	}
	
	

}
