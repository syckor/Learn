package a_basic;

public class Student {
	// 클래스 안에 있는 변수들 : 멤버변수 ( Member field)
	String name;
	int kor, eng, math; 
	private int total;
	private double avg;
	
	
	// 멤버함수 (member method/ member function)
	int calTotal() {
		total = kor + eng + math;
		return total;
	}
	
	double calAvg() {
		avg = (double)total / 3;
		return avg;
	}
	
	
}
