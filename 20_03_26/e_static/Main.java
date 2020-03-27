package e_static;

/**
 * 
 * 뭔가를 공유하고싶다
 *	단 하나로 공유 : static
 *	 -객체명이 아닌 클래스명 접근이 가능
 *   - static이 붙으면 객체없이 클래스만으로 실행가능
 */

public class Main {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book(); //생성자함수 총 3번 불려짐

		
		
		System.out.println("총 갯수 :" + Book.getCount());


	}
	
	

}
