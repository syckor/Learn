package d_constructor;

public class PracticeClass {
	
	int jumsu[];
	
	public PracticeClass(int jumsu[]) {
		this.jumsu = jumsu;
	}
	
	
	public double getAverage() {
		double average = (double)getTotal()/jumsu.length;
		//double d = Double.parseDouble(String.format("%.1f", 3.135486))
		
		average = Double.parseDouble(String.format("%.2f", average));


		return average;
	}
	public int getTotal() {
		int total = 0;
		for(int i = 0; i < jumsu.length; i++) {
			total += jumsu[i];
		}
		return total;
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
		int badScore = jumsu[0];
		for(int i = 0; i < jumsu.length; i++) {
			if(jumsu[i] < badScore) {
				badScore = jumsu[i];
			}
		}
		return badScore;
	}
	

}
