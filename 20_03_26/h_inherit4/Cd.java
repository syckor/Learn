package h_inherit4;

public class Cd extends Item{//output method를 강제로 완성해줘야함
	
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
