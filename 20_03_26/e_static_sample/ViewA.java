package e_static_sample;

public class ViewA {
	
	DBconnect db;
	
	public ViewA() {
		db = DBconnect.getInstance();
	}
	
	
	public void use() {
		System.out.println("DB 작업중");
	}
}




