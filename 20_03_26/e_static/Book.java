package e_static;

public class Book {

	private static int count;

	public Book(){ //book은 생성자 함수 new가 있을때마다 불려짐
		count++;
		System.out.println("책 한개 생성");
	}
	
	public static int getCount() {
		return count;
	}
	
	
}
