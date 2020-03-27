package h_inherit3;

public class Item {
	protected String number, title; //private이면 자식클래스가 못씀
	
	public Item(){
		System.out.println("Item 기본 생성자");
	}
	public Item(String number, String title){
	
		this.number = number;
		this.title = title;
		System.out.println("Item인자 생성자");		
	}
	
	public void output() {
		System.out.println(number);
		System.out.println(title);
		
	}
	

}
