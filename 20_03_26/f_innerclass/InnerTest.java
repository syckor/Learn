package f_innerclass;

class Outer
{
	class Inner //멤버이므로 static을 붙일 수 있음
	{
		void naJabara(){
			System.out.println("잡아보슈~~");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		Outer.Inner in  = o.new Inner();//Outer안에 Inner클래스를 부를때, Outer Instance o에 new Inner를 선언
		in.naJabara();
		// class Inner에 static을 붙이면 outer.Inner in = new Outer.Inner(); 가능
		
		
	}
}


