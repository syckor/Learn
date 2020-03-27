package d_constructor;

public class GradeExpr3 {
	int total;
	double average;
	int goodScore;
	int badScore;
	int jumsu[];
	public GradeExpr3(int[]jumsu) {
		
			this.jumsu = jumsu;
		
	}
	
	public int getTotal() {
		for(int i = 0; i < jumsu.length; i++) {
			total += jumsu[i];
		}	
		return total;
	}
	
	public double getAverage() {
		average = (double)total/jumsu.length;
		return average;
	}
	
	public int getGoodScore() {
		for(int i = 0; i < jumsu.length; i++) {
			if(jumsu[i]>goodScore) {
				goodScore = jumsu[i];
			}
		}
		return goodScore;
	}
	
	public int getBadScore() {
		for(int i = 0; i < jumsu.length; i++) {
			if(badScore < jumsu[i]) {
				badScore = jumsu[i];
			}
		}
		return badScore;
	}

}
