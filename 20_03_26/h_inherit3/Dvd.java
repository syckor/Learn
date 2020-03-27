package h_inherit3;

public class Dvd extends Item {
	
	String actor, director;
	
	public Dvd() {
		
	}
	
	public Dvd(String number, String title, String actor, String director) {
	
		this.number = number;
		this.title = title;
		
		this.actor = actor;
		this.director = director;
	}
	
	
	
	
	
	public void output() {
		System.out.println(number);
		System.out.println(title);
		System.out.println(actor);
		System.out.println(director);
		
	}
	

}
