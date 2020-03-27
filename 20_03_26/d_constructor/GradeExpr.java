package d_constructor;


public class GradeExpr {
	
	int jumsu[];
	int total;
	double average;
	int goodScore;
	int badScore;	
	
	public GradeExpr(int jumsu[]) {
		
		for(int i = 0; i < jumsu.length; i++) {
			total += jumsu[i];
			average = (double)total/jumsu.length;
			if(jumsu[i] > goodScore) {
				goodScore = jumsu[i];
			}
			badScore = jumsu[0];
			if(jumsu[i] < badScore) {
				badScore = jumsu[i];
			}
		}	
		
		
		
		
	}
		
	



	public int[] getJumsu() {
		return jumsu;
	}

	public void setJumsu(int[] jumsu) {
		this.jumsu = jumsu;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public int getGoodScore() {
		return goodScore;
	}

	public void setGoodScore(int goodScore) {
		this.goodScore = goodScore;
	}

	public int getBadScore() {
		return badScore;
	}

	public void setBadScore(int badScore) {
		this.badScore = badScore;
	}
}	
