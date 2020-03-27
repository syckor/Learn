package d_constructor;

import java.util.*;

public class PracticeMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("데이터의 개수 :");
		int num = input.nextInt();
		
		System.out.println("데이터 입력 :");
		String howManyData = input.next();
		
		int jumsu[] = new int[num];
		
		StringTokenizer st = new StringTokenizer(howManyData,",");
		for(int i = 0; st.hasMoreTokens(); i ++) {
			String token = st.nextToken();
			jumsu[i] = Integer.parseInt(token);
		}
		System.out.print("점수들 :");
		for(int i = 0; i < jumsu.length; i++) {
			System.out.print("," +jumsu[i]);
		}
		
		PracticeClass practice = new PracticeClass(jumsu);
		
		System.out.println("\n총점 :" + practice.getTotal());
		System.out.println("평균 :" + practice.getAverage());
		System.out.println("최고점수 :" + practice.getGoodScore());
		System.out.println("최저점수: " + practice.getBadScore());
			

	}

}