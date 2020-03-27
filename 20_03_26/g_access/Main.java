package g_access;

import g_access.sub.Access;

// 2. 다른 패키지에서 확인
class Main
{
	public static void main(String[] args) 
	{
		Access me = new Access();
		
		//me.a = "private 변경";
		me.b = "public 변경";  //다른 패키지에서 접근 가능한것은 public만 가능
		//me.c = "protected 변경"; //특별한 경우일때만 가능
		//me.d = "default 변경"; //동일한 패키지에서만 가능
	
		
		me.output();
	}
}

