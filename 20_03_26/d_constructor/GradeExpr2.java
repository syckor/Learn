package d_constructor;


public class GradeExpr2 {
	
	private int jumsu[];
	
	public GradeExpr2(int []jumsu) {
		this.jumsu = jumsu;
	} // private int jumsu[](member변수를 초기화 하기 위한 생성자 )




	public int getTotal() {
		int total = 0;
		for ( int i = 0; i < jumsu.length; i++) {
			total += jumsu[i];
		}
		return total;
	}


	public double getAverage() {
		double average;
		average = (double)getTotal()/jumsu.length; 
		
		return average;
	}
	public int getGoodScore() {
		int goodScore = 0;
		for(int i = 0; i < jumsu.length; i++) {
			if(jumsu[i]>goodScore) {
				goodScore = jumsu[i];
			}
		}
		
		return goodScore;
	}
	

	public int getBadScore() {
		int badScore = 0;
		badScore = jumsu[0];
		for(int i = 0; i < jumsu.length; i++) {
			if(jumsu[i]<jumsu[0]) {
				badScore = jumsu[i];
			}
		}
		return badScore;
	}

}	
