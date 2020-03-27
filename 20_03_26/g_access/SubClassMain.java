package g_access;

import g_access.sub.Access;


//3. 다른 패키지이지만 상속 관계라면
public class SubClassMain/*자식*/  extends Access//부모
{
	public static void main(String[] args) 
	{
		// 자식 클래스로 객체를 생성해야 한다.
		SubClassMain me = new SubClassMain();
		
		//me.a = "private 변경";
		me.b = "public 변경"; // 다른 패키지에서 접근 가능한것은 public만 가능
		me.c = "protected 변경"; //특별한 경우일때만 가능
		//me.d = "default 변경"; //동일한 패키지에서만 가능		
	
		me.output();
	}
}
