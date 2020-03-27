package e_static_sample;

public class ViewB {
	
	DBconnect db;
	
	public ViewB() {
		db = DBconnect.getInstance();
	}
	
	
	public void use() {
		System.out.println("DB 작업중");
	}
}
