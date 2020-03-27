package a_basic;

public class Main {

	public static void main(String[] args) {
		//변수선언
		//객체 생성(메모리 확보)
		Student s = new Student();
		s.kor = 70;
		s.eng = 88;
		s.math = 99;
		
		System.out.println("총점 :" + s.calTotal());
		
		//s.total = 100; // Student class에서 private 선언했으므로 이 페이지에서 total에 접근이 안됨
		System.out.println("평균 :" + s.calAvg());
		
	}

}
