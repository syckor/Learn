package c_array;

import java.util.Scanner;

public class Main {

	/**
	 * 			배열을 이용해서 3명의 국영수 점수를 입력받아 총점과 평균을 구한다
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
	
		Student [] s = new Student[3];		// 학생 수 3은 배열의 갯수를 의미한다.
	                                        //class도 new를 쓰고 배열도 new를 쓰는데 student[] s는 배열의 new 그냥 배열 선언만 한거
		
		for(int i = 0; i < s.length; i++) { // 여기서 s[0] = new Student(); s[1] = new Student();... 이렇게 객체생성한거
			s[i] = new Student();          
		
		//각각 학생의 이름과 국영수 점수를 입력받아 이름과 총점 평균 출력
		//만들어진 각각의 개체에 이름과 점수를 넣어서 총점과 평균 출력해줬다
			System.out.print((i+1) + "번째학생 이름 :");
			s[i].setName(in.next());
			System.out.print("국어점수 :");
			s[i].setKor(in.nextInt());
			System.out.print("영어점수 :");
			s[i].setEng(in.nextInt());
			System.out.print("수학점수 :");
			s[i].setMath(in.nextInt());
		}	
		for(int i = 0; i < s.length; i++) {
			System.out.println((i+1) + "번째 학생:" + s[i].getName());
			System.out.println("총점 :" + s[i].calTotal() + " 평균 :"  + s[i].calAverage() );
		}
		
		
	}

}
