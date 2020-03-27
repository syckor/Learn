package h_inherit3;
/*
 * this : 자신 객체를 지칭하는 레퍼런스
 * super : 부모 객체를 지칭하는 레퍼런스
 * ----------------------------
 * this() : 다른 생성자함수를 호출할 때
 * super() : 부모생성자함수를 호출할 때, this()마찬가지로 제일첫줄에 와야항
 */


public class Book extends Item{
	
	String author, publisher;
	
	public Book() {
		System.out.println("Book 기본생성자");
	}
	
	public Book(String number, String title, String author, String publisher) {
	
//		super.number = number;//부모꺼를 지칭할때는 super를 쓰자 (this써도 이상은 없음)
//		super.title = title;
		super(number,title); //super함수 
		
		this.author = author;
		this.publisher = publisher;
		System.out.println("Book 인자생성자");
	}
	
	public void output() {
		System.out.println(number);
		System.out.println(title);
		System.out.println(author);
		System.out.println(publisher);
		
	}

}
