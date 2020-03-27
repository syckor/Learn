package h_inherit4;

public class Test {

	public static void main(String[] args) {
		Item[] item= method();
		//출력
		for(int q = 0; q < item.length; q++) {
			item[q].output();
		}
	}
	static Item[] method() {
		
		//Item z = new Item(); Item class가 추상이라서 객체생성이 안됨
		
		Book b = new Book("001","자바","홍길동","코스모");
		Cd c = new Cd("002","아는노래","지코");
		Dvd d = new Dvd("003","킹덤","배두나","김은희");		
		
		Item []i = new Item[3];
		i[0] = b;
		i[1] = c;
		i[2] = d;
		
		return i;
		
		
	}

}
