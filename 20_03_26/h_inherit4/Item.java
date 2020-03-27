package h_inherit4;

public abstract class Item { //추상메쏘드를 갖고 있다! 같이 추상처리해줘야함
	protected String number, title; //private이면 자식클래스가 못씀
	
	public Item(){
		System.out.println("Item 기본 생성자");
	}
	public Item(String number, String title){
	
		this.number = number;
		this.title = title;
		System.out.println("Item인자 생성자");		
	}
	
	public abstract void output() ; //추상처리해주고 오버라이딩으로 완성해줘야함
	

}
