package h_inherit4;

public class Dvd extends Item {//Item이 미완성이므로 여기서 그걸 완성해줘야함
	
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
