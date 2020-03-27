package h_inherit3;

public class Cd extends Item{
	
	String singer;
	
	public Cd() {
		
	}
	public Cd(String number, String title, String singer) {
	
		
		this.number = number;
		this.title = title;
		
		this.singer = singer;
		
	}
	
	public void output() {
		
		System.out.println(number);
		System.out.println(title);
		System.out.println(singer);
		
		
	}

}
