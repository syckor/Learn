package c_array;

import java.util.Scanner;

import d_constructor.Student;

public class MainArray {
	
	/**
	 * 	3명의 학생 정보를 입력받아 각 학생별 총점 평균을 구한다면
	 */
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		Student s[] = new Student[3];
		
		for(int i = 0; i< s.length; i++) {
			
			System.out.println("이름->");
			String name = in.next();
			System.out.println("국어점수->");
			int k = in.nextInt();
			System.out.println("영어점수->");
			int e = in.nextInt();
			System.out.println("수학점수->");
			int m = in.nextInt();
			
			
			s[i] = new Student(name,k,e,m);		
			System.out.println("총점 :" + s[i].calTotal());
			System.out.println("평균:" + s[i].calAverage());
		}
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		// 추가적으로 각 과목별 총점을 구한다면?
		for(int i = 0; i < 3; i++ ) {
			
			sumKor += s[i].getKor();
			sumEng += s[i].getEng();
			sumMath += s[i].getMath();
		}
		System.out.println("국어총점 : " + sumKor + "\n영어총점" + sumEng + "\n수학총점" + sumMath);
	}

}
