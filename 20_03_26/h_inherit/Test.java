package h_inherit;

/*
 * overloading : 여러개의 함수를 동일한 함수명으로 씁니다. 인자의 자료형과 갯수가 달라야함
 * 
 * overriding : 상속관계에서 인자와 반환값까지 동일한 함수들
 * 
 */


public class Test {

	public static void main(String[] args) {
		//1. 각각의 클래스 생성
//		Umma u = new Umma();
//		u.gene();
//		u.job();
		
		
//		Ddal d = new Ddal();
//		d.gene();
//		d.study();
//
//		d.job();
		
		//2. 부모 변수에 자식 객체 생성
		
		Umma dal = new Ddal();
		
		//dal.study(); 엄마클래스만 접근가능함
		dal.job();
		
		dal.gene();//이름이 같으면 자식클래스에서 가져옴
					//overriding 상속관계에 있을때만 가능
		
		//3. 객체임을 확인
		Ddal d = new Ddal();
		if(d instanceof Ddal) {
			System.out.println("딸객체");
		}
		if(d instanceof Umma) {
			System.out.println("딸객체");
		}
		
		//4. 형변환
		//    (casting) : 기본형/상속관계의 클래스
		
		Umma a = new Umma();
		//Ddal b = (Ddal)a;//Ddal은 메모릴에 없는데 Ddal을 참조하려고 해서 실행하면 오류가 남 
		
		Ddal c = new Ddal();
		Umma e = (Umma)c;  //up-casting
		Ddal f = (Ddal)e;  //down-casting
		
		
	}

}
