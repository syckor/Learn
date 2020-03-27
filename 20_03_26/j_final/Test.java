package j_final;

 /*final*/class Parent{   //여기에 final이 붙으면 부모클래스 자체가 안됨
	 final String field = "부모님꺼";
	 final public void jib (){
	  System.out.println("부모님이 만드신거");
	 }
} 
class Child extends Parent{
	
	Child(){
		//super.field = "내꺼"; final때문에 못씀
	}
//	public void jib () { 얘도 final대문에 안댕
//		System.out.println("물려받아서 탕진잼");
//	}

}

public class Test {
	 public static void main(String[] args) {
		 Child p = new Child();
		  System.out.println(p.field);
		  p.jib();
	 }
}
